package it.objectmethod.world.dao;

import java.util.List;

import it.objectmethod.world.domain.Country;

public interface ICountryDao {
	public List<Country> getCountryByName(String countryName, String continent);

	public List<String> getContinent();

	public List<Country> getCountryByContinent(String continent);

}
