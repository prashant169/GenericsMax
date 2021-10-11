package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
	@Test
	public void floatMax1() {
		float actualValue = Maximum.getmaximum(12f, 14f, 15f);
		Assert.assertEquals(15, actualValue, 0);
	}

	@Test
	public void floatMax2() {
		float actualValue = Maximum.getmaximum(1000f, 545f, 746f);
		Assert.assertEquals(1000, actualValue, 0);
	}
}