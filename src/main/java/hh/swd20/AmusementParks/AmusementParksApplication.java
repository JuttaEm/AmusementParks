package hh.swd20.AmusementParks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.AmusementParks.domain.Park;
import hh.swd20.AmusementParks.domain.ParkRepository;



@SpringBootApplication
public class AmusementParksApplication {
	
	private static final Logger log = LoggerFactory.getLogger(AmusementParksApplication.class);

	// Application main method
	public static void main(String[] args) {
		SpringApplication.run(AmusementParksApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo(ParkRepository parkRepository) {
	return (args) -> {
		
		log.info("save demo data of books with category");
		
		parkRepository.save(new Park("Linnanmäki", 4 , "www.linnanmaki.fi", "Finland", "Helsinki"));
		parkRepository.save(new Park("Särkänniemi", 3 , "www.sarkanniemi.fi", "Finland", "Tampere"));
		parkRepository.save(new Park("Powerpark", 5 , "www.powerpark.fi", "Finland", "Alahärmä"));	
		
		
		log.info("fetch all parks");
		for (Park park : parkRepository.findAll()) {
			log.info(park.toString());
		}
		
	};
	}
	
}
