package org.dsoft;

import org.dsoft.entities.Country;
import org.dsoft.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesApplication implements CommandLineRunner {
	
	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepository.save(new Country("Earth", "World"));
		countryRepository.save(new Country("China", "Peking"));
		countryRepository.save(new Country("Germany", "Berlin"));
		countryRepository.save(new Country("USA", "Washington DC"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		
	}
	
	
}
