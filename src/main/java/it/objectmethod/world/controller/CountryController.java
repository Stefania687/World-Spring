package it.objectmethod.world.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.objectmethod.world.dao.ICountryDao;
import it.objectmethod.world.dao.impl.CountryDaoImpl;
import it.objectmethod.world.domain.Country;

@Controller
public class CountryController {
	@RequestMapping("/country")
	public String getCountryByName(@RequestParam("nome") String nomeNazione,
			@RequestParam("continente") String nomeContinente, ModelMap map) {

		List<Country> list = new ArrayList<Country>();
		ICountryDao countryDao = new CountryDaoImpl();
		list = countryDao.getCountryByName(nomeNazione, nomeContinente);
		map.addAttribute("countries", list);

		return "index-2";
	}

	@RequestMapping("/home-2")
	public String getIndex() {
		return "index-2";
	}

	@RequestMapping("/home-3")
	public String getContinent(ModelMap map) {
		List<String> list = new ArrayList<>();
		ICountryDao countryDao = new CountryDaoImpl();
		list = countryDao.getContinent();
		map.addAttribute("continentList", list);
		return "index-3";
	}
	
	@RequestMapping("/countryList")
	public String getContinent(@RequestParam("continent") String continent, ModelMap map) {
		List<Country> list = new ArrayList<>();
		ICountryDao countryDao = new CountryDaoImpl();
		list = countryDao.getCountryByContinent(continent);
		map.addAttribute("countryList", list);
		return "index-3";
	}

	
}
