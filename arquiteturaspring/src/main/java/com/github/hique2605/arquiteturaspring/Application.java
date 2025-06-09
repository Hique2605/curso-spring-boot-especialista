package com.github.hique2605.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);


		//mesma coisa <  >
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		//builder.profiles("producao"); //n é ideal tem q ser antes de startar a aplicação
		builder.run(args);


		//contexto da aplicação ja startado

		//builder.bannerMode(Banner.Mode.OFF);  desliga o banner do Spring Boot
		//ConfigurableApplicationContext ApplicationContext = builder.context();
		//var produtoRepository = ApplicationContext.getBean("produtoRepository");

		//builder.addCommandLineProperties(false);
		//builder.properties("spring.config.location=classpath:/application.properties");


	}

}
