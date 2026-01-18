package com.sstobiec.flashai;

import org.springframework.boot.SpringApplication;

public class TestFlashaiApplication {

	public static void main(String[] args) {
		SpringApplication.from(FlashaiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
