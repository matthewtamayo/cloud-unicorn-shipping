package com.telus.shipping.model;

import com.google.code.beanmatchers.BeanMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

/**
 * The {@link Code} tests.
 *
 * @author John Dexter Reyes
 */
class CodeTests {

	@Test
	void shouldHaveValidBeanConstructor() {
		MatcherAssert.assertThat(Code.class, BeanMatchers.hasValidBeanConstructor());
	}

	@Test
	void shouldHaveValidGettersAndSetters() {
		MatcherAssert.assertThat(Code.class, BeanMatchers.hasValidGettersAndSetters());
	}

	@Test
	void shouldHaveValidBeanHashCode() {
		MatcherAssert.assertThat(Code.class, BeanMatchers.hasValidBeanHashCode());
	}

	@Test
	void shouldHaveValidBeanEquals() {
		MatcherAssert.assertThat(Code.class, BeanMatchers.hasValidBeanEquals());
	}

	@Test
	void shouldHaveValidBeanToString() {
		MatcherAssert.assertThat(Code.class, BeanMatchers.hasValidBeanToString());
	}

}
