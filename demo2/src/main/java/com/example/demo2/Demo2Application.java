package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Bean
	public List<Demo2Dto> createDto() {
		var list = new ArrayList<Demo2Dto>();
		list.add(new Demo2Dto("test1", "test1password"));
		list.add(new Demo2Dto("test2", "test2password"));
		return list;
	}
}
