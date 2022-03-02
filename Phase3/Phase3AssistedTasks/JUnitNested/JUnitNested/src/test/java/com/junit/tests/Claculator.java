package com.junit.tests;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Claculator {

	public int add(int a,int b) {
		return a+b;
	}
	@Test
	void add() {
		Claculator c=new Claculator();
		assertEquals(2, c.add(1,1));
	}
}

