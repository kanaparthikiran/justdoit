package com.hotel.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Map;

import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.Request;

import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.context.TilesRequestContext;


@SpringBootApplication
@EnableJpaAuditing
public class SpringTemplateServiceApplication {

	public static void main(String[] args) {
//		Request a = null;
//		a.getParamValues().
//		ApplicationContext context = a.getApplicationContext();
//		System.out.println("  HWTilesContextScopes.request.name()  "+HWTilesContextScopes.request.name());
//		System.out.println("  HWTilesContextScopes.request.name()  "+ HWTilesContextScopes.request.name().getClass().getName());
		//Object aa = a.getContext(HWTilesContextScopes.request.name()).get("");
	//	.getApplicationContext().getApplicationScope();
		//Map<String, String> testMap = a.getParam();
		SpringApplication.run(SpringTemplateServiceApplication.class, args);
	}
}
