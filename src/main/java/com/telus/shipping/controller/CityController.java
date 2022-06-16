package com.telus.shipping.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.telus.shipping.model.City;

/**
 * The {@link City} REST controller.
 *
 * @author John Dexter Reyes
 */
@RestController
@RequestMapping("/city")
@Tag(name = "city")
public class CityController {

	@GetMapping
	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	public List<City> get() {
		return null;
	}

}
