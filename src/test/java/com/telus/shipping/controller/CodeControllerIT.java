package com.telus.shipping.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The {@link CodeController} integration tests.
 *
 * @author John Dexter Reyes
 */
@WebMvcTest(CodeController.class)
class CodeControllerIT {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void shouldReturnAllCodes() throws Exception {
		this.mockMvc.perform(get("/code")).andExpect(status().isNotImplemented());
	}

}
