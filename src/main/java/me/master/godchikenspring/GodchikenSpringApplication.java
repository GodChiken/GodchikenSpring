package me.master.godchikenspring;

import com.master.godchikenspringbootstarter.model.Godchiken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GodchikenSpringApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(GodchikenSpringApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
	}

	/*@Bean
	public Godchiken godchiken(){
		return Godchiken.builder().name("기무보훈상").howLong(2000).build();
	}*/
}
