package com.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction();
		assertEquals("hi friend", interaction.greeting());
		
	}
}
