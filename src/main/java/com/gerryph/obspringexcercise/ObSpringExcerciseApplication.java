package com.gerryph.obspringexcercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gerryph.obspringexcercise.entities.Laptop;
import com.gerryph.obspringexcercise.repositories.LaptopRepository;

@SpringBootApplication
public class ObSpringExcerciseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringExcerciseApplication.class, args);

		LaptopRepository repo = context.getBean(LaptopRepository.class);

		Laptop lap1 = new Laptop(null, "Dell", "Inspiron", 8, 16.0d, 850.00d, true);

		repo.save(lap1);
	}

}
