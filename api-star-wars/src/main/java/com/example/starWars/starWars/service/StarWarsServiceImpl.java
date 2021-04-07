package com.example.starWars.starWars.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.starWars.starWars.dto.Results;
import com.example.starWars.starWars.dto.ResponseFilmsDTO;

@Service
@CacheConfig(cacheNames={"films"})
public class StarWarsServiceImpl{
	
	private ResponseFilmsDTO listFilms = new ResponseFilmsDTO();

	@Cacheable
    public ResponseFilmsDTO findAll() {
		RestTemplate restTemplate = new RestTemplate();
		
		this.listFilms = restTemplate.getForEntity("https://swapi.dev/api/films/", ResponseFilmsDTO.class).getBody();
		
		return this.listFilms;
    }
	
	@CachePut
    public Results updateDescriptionFilm(Results results, long id) {
		Results filmSelected = this.listFilms.getResults().get((int) id); 
        
		filmSelected.setVersion(filmSelected.getVersion() + 1);
		filmSelected.setOpening_crawl(results.getOpening_crawl());
        
        return filmSelected;
    }
	
	public ResponseFilmsDTO findAllFilms() {
		return this.listFilms;
    }
	
	public Results findDetailFilm(long id) {
		return this.listFilms.getResults().get((int) id);
    }
	
}