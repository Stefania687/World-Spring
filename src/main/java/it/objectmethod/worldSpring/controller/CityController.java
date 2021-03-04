package it.objectmethod.worldSpring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.objectmethod.worldSpring.dao.ICityDao;
import it.objectmethod.worldSpring.dao.impl.CityDaoImpl;
import it.objectmethod.worldSpring.domain.City;

@Controller
public class CityController {

	@RequestMapping("/details")
	public String getCityByName(@RequestParam("nomeCitta") String nomeCitta, ModelMap map) {
		City city = new City();
		ICityDao cityDao = new CityDaoImpl();
		city = cityDao.getCityByName(nomeCitta);

		map.addAttribute("city", city);

		return "index";
	}

	@RequestMapping("/home")
	public String getIndex() {
		return "index";
	}

	@RequestMapping("/cityList")
	public String getCityByCountryCode(@RequestParam("country") String countryCode, ModelMap map) {
		List<City> list = new ArrayList<>();
		ICityDao cityDao = new CityDaoImpl();
		list = cityDao.getCityByCountryCode(countryCode);
		map.addAttribute("cityList", list);
		return "index-3";
	}

}
