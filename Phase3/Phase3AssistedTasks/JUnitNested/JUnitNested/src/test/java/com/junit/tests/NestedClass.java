package com.junit.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Nested class")
public class NestedClass {
	@BeforeEach
	void Before() {
		System.out.println("Befor test");
	}
	@Test
	void init() {
		System.out.println("this is test case");
	}
	@AfterEach
	void After() {
		System.out.println("After test ");
	}
	@Nested
	@DisplayName("nested class")
	class A{
	
	@BeforeEach
	void Before1() {
		System.out.println("before nested test class ");
	}
	@Test
	void init() {
		System.out.println("inside nested class");
	}
	@AfterEach
	void After() {
		System.out.println("After nested test class ");
	}
	
}
	
	

}
