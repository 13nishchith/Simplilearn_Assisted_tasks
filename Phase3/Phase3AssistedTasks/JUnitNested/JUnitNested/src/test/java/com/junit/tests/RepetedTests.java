package com.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@DisplayName("JUnit5 repeted test examples")
@RunWith(JUnitPlatform.class)
public class RepetedTests {
	@BeforeAll
	public static void initEach() {
		System.out.println("befor Each initEach method()");
	}
	@BeforeEach
	public void init() {
		System.out.println("befor all init method()");
	}
	
	@Test
	@DisplayName("add operation")
	@RepeatedTest(5)
	void add() {
		Claculator c=new Claculator();
		assertEquals(2, c.add(1,1));
		System.out.println("result is equal");
	}
    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }
     
    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

	

  

}
