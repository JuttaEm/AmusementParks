package hh.swd20.AmusementParks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.AmusementParks.domain.Attraction;
import hh.swd20.AmusementParks.domain.AttractionRepository;
import hh.swd20.AmusementParks.domain.Category;
import hh.swd20.AmusementParks.domain.CategoryRepository;
import hh.swd20.AmusementParks.domain.Park;
import hh.swd20.AmusementParks.domain.ParkRepository;



@SpringBootApplication
public class AmusementParksApplication {
	
	private static final Logger log = LoggerFactory.getLogger(AmusementParksApplication.class);

	// Application main method
	public static void main(String[] args) {
		SpringApplication.run(AmusementParksApplication.class, args);
	}
	
	
	// Demodata
	@Bean
	public CommandLineRunner demo(ParkRepository parkRepository, AttractionRepository attractionRepository, CategoryRepository categoryRepository) {
	return (args) -> {
		
		log.info("save demo categories");
		
		Category category1 = new Category("Children");
		Category category2 = new Category("Extreme");
		Category category3 = new Category("Rollercoaster");
		
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		categoryRepository.save(category3);
		
		
		log.info("save demo data of amusement parks with categories");
		
		parkRepository.save(new Park("Linnanmäki", 4 , "www.linnanmaki.fi", "Finland", "Helsinki"));
		parkRepository.save(new Park("Särkänniemi", 3 , "www.sarkanniemi.fi", "Finland", "Tampere"));
		parkRepository.save(new Park("Powerpark", 5 , "www.powerpark.fi", "Finland", "Alahärmä"));	
		
		
		log.info("fetch all parks");
		for (Park park : parkRepository.findAll()) {
			log.info(park.toString());
		}
		
		log.info("save demo data of attractions");
		
		attractionRepository.save(new Attraction("Booster", 5 , "Ihan sairaan kauhee", category2));
		attractionRepository.save(new Attraction("Pitts Special", 5 , "Tuntuu kuin olisi lentokoneessa!", category3));
		attractionRepository.save(new Attraction("Cobra", 4 , "Huikee, mutta vähän nykivä", category3));	
		
		
		log.info("fetch all attractions");
		for (Attraction attraction : attractionRepository.findAll()) {
			log.info(attraction.toString());
		}
		
	};
	}
	
}
