package it.objectmethod.world.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.objectmethod.world.dao.ICityDao;
import it.objectmethod.world.dao.impl.CityDaoImpl;
import it.objectmethod.world.domain.City;
import it.objectmethod.world.jasper.JasperService;

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
	@RequestMapping("/city-pdf")
	public void getCityReport(@RequestParam("country") String countryCode) {
		List<City> list = null;
		ICityDao cityDao = new CityDaoImpl();
		list = cityDao.getCityByCountryCode(countryCode);
		JasperService jasperService = new JasperService();
		try {
			jasperService.getJasperPrint(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
