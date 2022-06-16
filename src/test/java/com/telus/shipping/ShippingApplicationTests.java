package com.telus.shipping;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.SpringApplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;

/**
 * The {@link ShippingApplication} tests.
 *
 * @author John Dexter Reyes
 */
@ExtendWith(MockitoExtension.class)
class ShippingApplicationTests {

	private MockedStatic<SpringApplication> springApplication;

	private ShippingApplication shippingApplication;

	@BeforeEach
	void init() {
		this.springApplication = mockStatic(SpringApplication.class);
		this.shippingApplication = new ShippingApplication();
	}

	@Test
	void shouldBootstrapApplication() {
		ShippingApplication.main(null);
		this.springApplication.verify(() -> SpringApplication.run(eq(ShippingApplication.class), isNull()), times(1));
	}

	@Test
	void shouldReturnOpenApiInfo() {
		assertThat(this.shippingApplication.shippingOpenAPI()).isNotNull();
	}

	@AfterEach
	void tearDown() {
		this.springApplication.close();
	}

}
