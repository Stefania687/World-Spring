package it.objectmethod.worldSpring.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.objectmethod.worldSpring.dao.ICityDao;
import it.objectmethod.worldSpring.domain.City;

@Service
public class CityDaoImpl implements ICityDao {
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
	public City getCityByName(String cityName) {
		Connection conn = getConnection();
		City city = null;

		String sql = "SELECT * FROM city WHERE Name = ?";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, cityName);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				city = new City();
				city.setId(rs.getInt("ID"));
				city.setCountryCode(rs.getString("CountryCode"));
				city.setName(rs.getString("Name"));
				city.setDistrict(rs.getString("District"));
				city.setPopulation(rs.getInt("Population"));
			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return city;
	}

	@Override
	public List<City> getCityByCountryCode(String countryCode) {
		Connection conn = getConnection();
		List<City> cities = new ArrayList<City>();

		String sql = "SELECT Name, Population FROM city WHERE CountryCode = ? ";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, countryCode);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				City city = new City();
				city.setName(rs.getString("Name"));
				city.setPopulation(rs.getInt("Population"));
				cities.add(city);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cities;
	}
}
