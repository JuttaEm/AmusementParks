package hh.swd20.AmusementParks.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.swd20.AmusementParks.domain.Attraction;
import hh.swd20.AmusementParks.domain.AttractionRepository;
import hh.swd20.AmusementParks.domain.Category;
import hh.swd20.AmusementParks.domain.CategoryRepository;
import hh.swd20.AmusementParks.domain.Park;
import hh.swd20.AmusementParks.domain.ParkRepository;

@CrossOrigin
@Controller
public class AttractionController {
	
	@Autowired
	private AttractionRepository attractionRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ParkRepository parkRepository;
	
	@GetMapping("/attractionlist")
	public String listAttractionsByParkId(Model model) {
		model.addAttribute("attractions", attractionRepository.findAll());
		return "attractionlist";
	}
	
	//RESTful service to get all attractions
	@GetMapping(value="/attractions")
	public @ResponseBody List<Attraction> getAllAttractions() {
		return (List<Attraction>) attractionRepository.findAll();
	}
	
	//RESTful service to get list of attractions by parkId
	@GetMapping(value="/attractions/{id}")
	public @ResponseBody Optional<Attraction> findAttractionsByParkId(@PathVariable("id") Long parkId) {
		return attractionRepository.findById(parkId);
	}
	
	@GetMapping(value="/addattraction/{id}")
	public String addAttractionToPark(@PathVariable("id") Long parkId, Category category, Model model) {
		Attraction attraction = new Attraction();
		Park park = parkRepository.findById(parkId).get();
		attraction.setPark(park);
		model.addAttribute("attraction", attraction);
		model.addAttribute("categories", categoryRepository.findAll());
		attraction.setCategory(category);
		return "addattraction";
	}
	
	@PostMapping(value="/saveattraction")
	public String saveAttraction(Attraction attraction, Model model) {
		attractionRepository.save(attraction);
		return "redirect:../parklist";
	}
	


}
