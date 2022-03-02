package com.junit.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit5 dynamic tests example")
@RunWith(JUnitPlatform.class)
public class DynamicExample {
	@TestFactory
	Collection <DynamicTest> dynamicTests(){
		return Arrays.asList(
				dynamicTest("simple dynamic test",()-> assertTrue(true)),
				dynamicTest("My executable class",new MyExecutable()),
				dynamicTest("Exception Executable",()-> {throw new Exception("exception example");}),
				dynamicTest("simple dynamic test-2",()-> assertTrue(true))
				
				);
				
				
	}

}
class MyExecutable implements Executable{

	@Override
	public void execute() throws Throwable {
		System.out.println("Hello");
		
	}
	
}
