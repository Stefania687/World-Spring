package it.objectmethod.worldSpring.dao;

import java.util.List;

import it.objectmethod.worldSpring.domain.Country;

public interface ICountryDao {
	public List<Country> getCountryByName(String countryName, String continent);

	public List<String> getContinent();

	public List<Country> getCountryByContinent(String continent);

}
