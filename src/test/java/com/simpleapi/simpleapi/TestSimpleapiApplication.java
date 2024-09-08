package com.simpleapi.simpleapi;

import org.springframework.boot.SpringApplication;

public class TestSimpleapiApplication {

	public static void main(String[] args) {
		SpringApplication.from(SimpleapiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
