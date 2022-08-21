package com.piyush.springboottiketbookings.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.springboottiketbookings.DAO.CityDAO;
import com.piyush.springboottiketbookings.model.City;
import com.piyush.springboottiketbookings.model.Movie;



@RestController
public class TestController {

	/*@RequestMapping(value = "/Testcity", method = RequestMethod.GET)
	public City testCity() {

		City c = new City();
		c.setName("Agra");
		c.setPincode("411001");
		c.setState("UP");
		return c;
	}*/
	
	@Autowired
	CityDAO theCityDAO;

	
	@GetMapping("/Testcity/1")
	public City testCity() {
		
//	public ResponseEntity<City> getOneCity(@PathVariable(value="ID") long ID){
		
		City theCity = theCityDAO.findOne(1);
		return theCity;
	
	}
	
	

}
