package com.example.starWars.starWars.dto;

import java.util.List;

public class ResponseFilmsDTO {

    private List<Results> results;

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

}