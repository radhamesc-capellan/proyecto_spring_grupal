package com.grupal.proyecto.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class StartupListener {

	private final Environment environment;

	public StartupListener(Environment environment) {
		this.environment = environment;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onApplicationReady() {
		String port = environment.getProperty("server.port", "8080");
		String appName = environment.getProperty("spring.application.name", "Application");
		System.out.println(appName + " está corriendo en puerto: " + port);
	}

}
