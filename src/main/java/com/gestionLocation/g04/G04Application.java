package com.gestionLocation.g04;

import com.gestionLocation.g04.entities.Voiture;
import com.gestionLocation.g04.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class G04Application {

	public static void main(String[] args) {
		SpringApplication.run(G04Application.class, args);
	}

	@Bean
	CommandLineRunner start(VoitureRepository voitureRepository){
		return args -> {
			voitureRepository.save(new Voiture(123456789L,"Dacia","Jaune","RRRR",1000.00));
			voitureRepository.save(new Voiture(123456780L,"Toyota","Rouge","CCCC",5000.00));
			voitureRepository.save(new Voiture(12345678900L,"Touareg","JVert","DDDD",3000.00));
			voitureRepository.findAll().forEach(voiture -> {
				System.out.println(voiture.toString());
			});
		};
	}
}
