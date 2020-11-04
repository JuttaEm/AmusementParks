package hh.swd20.AmusementParks.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.swd20.AmusementParks.domain.Attraction;
import hh.swd20.AmusementParks.domain.AttractionRepository;
import hh.swd20.AmusementParks.domain.CategoryRepository;
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
	
	/*@GetMapping("/attractionlist")
	public String listAllAttractions(Model model) {
		model.addAttribute("attractions", attractionRepository.findAll());
		return "attractionlist";
	}*/
	
	//RESTful service to get all books
	@RequestMapping(value="/attractions", method = RequestMethod.GET)
	public @ResponseBody List<Attraction> getAllAttractions() {
		return (List<Attraction>) attractionRepository.findAll();
	}
	
	//RESTful service to get list of attractions by parkId
	/*@RequestMapping(value="/attractions/{parkId}", method = RequestMethod.GET)
	public @ResponseBody List<Attraction> findByParkId(@PathVariable("parkId") Long parkId) {
		return attractionRepository.findByParkId(parkId);
	}*/


}
