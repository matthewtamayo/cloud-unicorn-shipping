package com.telus.shipping.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The {@link CityController} integration tests.
 *
 * @author John Dexter Reyes
 */
@WebMvcTest(CityController.class)
class CityControllerIT {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void shouldReturnAllCities() throws Exception {
		this.mockMvc.perform(get("/city")).andExpect(status().isNotImplemented());
	}

}
