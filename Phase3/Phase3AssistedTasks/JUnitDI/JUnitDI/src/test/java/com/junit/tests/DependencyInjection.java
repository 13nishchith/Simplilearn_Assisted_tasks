package com.junit.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit5 Dependency injection example")
@RunWith(JUnitPlatform.class)

public class DependencyInjection {
	DependencyInjection(TestInfo testinfo){
		assertEquals("JUnit5 Dependency Injection example", testinfo.getDisplayName());
		
	}
	@BeforeEach
	void init(TestInfo testinfo) {
		String displayName=testinfo.getDisplayName();
		assertTrue(displayName.equals("Test1")|| displayName.equals("test2()"));
	}
	@Test
	@DisplayName("Test1")
	@Tag("my-tag")
	void test1(TestInfo testinfo) {
		assertEquals("Test1", testinfo.getDisplayName());
		assertTrue(testinfo.getTags().contains("my-tag"));
	}
	
	@Test
	void test2() {
		
	}
}
