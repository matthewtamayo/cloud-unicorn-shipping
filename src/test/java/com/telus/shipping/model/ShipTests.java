package com.telus.shipping.model;

import com.google.code.beanmatchers.BeanMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

/**
 * The {@link Ship} tests.
 *
 * @author John Dexter Reyes
 */
class ShipTests {

	@Test
	void shouldHaveValidBeanConstructor() {
		MatcherAssert.assertThat(Ship.class, BeanMatchers.hasValidBeanConstructor());
	}

	@Test
	void shouldHaveValidGettersAndSetters() {
		MatcherAssert.assertThat(Ship.class, BeanMatchers.hasValidGettersAndSetters());
	}

	@Test
	void shouldHaveValidBeanHashCode() {
		MatcherAssert.assertThat(Ship.class, BeanMatchers.hasValidBeanHashCode());
	}

	@Test
	void shouldHaveValidBeanEquals() {
		MatcherAssert.assertThat(Ship.class, BeanMatchers.hasValidBeanEquals());
	}

	@Test
	void shouldHaveValidBeanToString() {
		MatcherAssert.assertThat(Ship.class, BeanMatchers.hasValidBeanToString());
	}

}
