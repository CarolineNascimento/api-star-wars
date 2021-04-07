package com.example.starWars.starWars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.starWars.starWars.dto.ResponseFilmsDTO;
import com.example.starWars.starWars.dto.Results;
import com.example.starWars.starWars.service.StarWarsServiceImpl;

@RestController
public class StarWarsController {

	private final StarWarsServiceImpl service;
	
	@Autowired
	StarWarsController(StarWarsServiceImpl service) {
		this.service = service;
		service.findAll();
	}

	@PutMapping("/update-film/{id}")
	public Results updateDescriptionFilm(@RequestBody Results results, @PathVariable("id") long id) {
		return service.updateDescriptionFilm(results, id);
	}

	@GetMapping("/list-films")
	public ResponseFilmsDTO getListFilms() {
		return service.findAllFilms();
	}
	
	@GetMapping("/detail-film/{id}")
	public Results getDetailFilm(@PathVariable("id") long id) {
		return service.findDetailFilm(id);
	}
}
