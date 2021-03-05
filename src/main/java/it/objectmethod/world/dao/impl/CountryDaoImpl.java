package it.objectmethod.world.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.world.dao.ICountryDao;
import it.objectmethod.world.domain.Country;

public class CountryDaoImpl implements ICountryDao {

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:33060/world", "omdev", "omdev");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public List<Country> getCountryByName(String countryName, String continent) {
		Connection conn = getConnection();
		List<Country> countries = new ArrayList<>();
		String sql = "SELECT Code, Name, Continent, Population, SurfaceArea " + "FROM country "
				+ "WHERE ('' = ? OR Name = ?) AND ('' = ? OR Continent = ?)";
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, countryName);
			stm.setString(2, countryName);
			stm.setString(3, continent);
			stm.setString(4, continent);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Country country = new Country();
				country.setCodiceNazione(rs.getString("Code"));
				country.setNomeNazione(rs.getString("Name"));
				country.setContinente(rs.getString("Continent"));
				country.setPopolazione(rs.getInt("Population"));
				country.setEstensioneGeografica(rs.getInt("SurfaceArea"));
				countries.add(country);
			}
			rs.close();
			stm.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return countries;
	}

	@Override
	public List<String> getContinent() {
		Connection conn = getConnection();
		List<String> continent = new ArrayList<String>();

		String sql = "SELECT DISTINCT Continent FROM country;";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				continent.add(rs.getString("Continent"));

			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return continent;

	}
	@Override
	public List<Country> getCountryByContinent(String continent){
		
			Connection conn = getConnection();
			List<Country> countries = new ArrayList<Country>();

			String sql = "SELECT Name, Population, Code FROM country WHERE Continent = ? ";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1, continent);

				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					Country country = new Country();
					country.setCodiceNazione(rs.getString("Code"));
					country.setNomeNazione(rs.getString("Name"));
					country.setPopolazione(rs.getInt("Population"));
					countries.add(country);
				}
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return countries;
		
	}

}
