package it.objectmethod.world.dao;

import java.util.List;

import it.objectmethod.world.domain.City;

public interface ICityDao {

	public City getCityByName(String cityName);

	public List<City> getCityByCountryCode(String countryCode);

}
