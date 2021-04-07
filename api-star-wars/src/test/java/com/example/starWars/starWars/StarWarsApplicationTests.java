package com.example.starWars.starWars;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.starWars.starWars.dto.Results;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
class StarWarsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void test() throws Exception {

		Results results = new Results();
		results.setOpening_crawl("Teste Junit");
		
		String json = new ObjectMapper().writeValueAsString(results);

		mockMvc.perform(MockMvcRequestBuilders.put("/update-film/0").content(json).header(HttpHeaders.CONTENT_TYPE,
				MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());

		mockMvc.perform(
				MockMvcRequestBuilders.get("/detail-film/0").header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());
		
		mockMvc.perform(
				MockMvcRequestBuilders.get("/list-films").header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON))
				.andDo(print()).andExpect(status().isOk());

	}
}
