package com.telus.shipping.model;

import com.google.code.beanmatchers.BeanMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

/**
 * The {@link City} tests.
 *
 * @author John Dexter Reyes
 */
class CityTests {

	@Test
	void shouldHaveValidBeanConstructor() {
		MatcherAssert.assertThat(City.class, BeanMatchers.hasValidBeanConstructor());
	}

	@Test
	void shouldHaveValidGettersAndSetters() {
		MatcherAssert.assertThat(City.class, BeanMatchers.hasValidGettersAndSetters());
	}

	@Test
	void shouldHaveValidBeanHashCode() {
		MatcherAssert.assertThat(City.class, BeanMatchers.hasValidBeanHashCode());
	}

	@Test
	void shouldHaveValidBeanEquals() {
		MatcherAssert.assertThat(City.class, BeanMatchers.hasValidBeanEquals());
	}

	@Test
	void shouldHaveValidBeanToString() {
		MatcherAssert.assertThat(City.class, BeanMatchers.hasValidBeanToString());
	}

}
