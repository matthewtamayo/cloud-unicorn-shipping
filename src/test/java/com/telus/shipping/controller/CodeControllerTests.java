package com.telus.shipping.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The {@link CodeController} tests.
 *
 * @author John Dexter Reyes
 */
class CodeControllerTests {

	private final CodeController controller = new CodeController();

	@Test
	void shouldReturnAllCodes() {
		assertThat(this.controller.get()).isNull();
	}

}
