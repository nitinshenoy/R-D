package com.example.demo;

import org.junit.jupiter.api.Test;

public class CarServiceTest {
	
	@Test
	public void shouldDemostateLogging() {
		CarService carService= new CarService();
		carService.process("BMW");
	}

}
