package com.telus.shipping.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The {@link CityController} tests.
 *
 * @author John Dexter Reyes
 */
class CityControllerTests {

	private final CityController controller = new CityController();

	@Test
	void shouldReturnAllCities() {
		assertThat(this.controller.get()).isNull();
	}

}
