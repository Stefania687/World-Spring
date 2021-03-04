package it.objectmethod.worldSpring.dao;

import java.util.List;

import it.objectmethod.worldSpring.domain.City;

public interface ICityDao {

	public City getCityByName(String cityName);

	public List<City> getCityByCountryCode(String countryCode);

}
