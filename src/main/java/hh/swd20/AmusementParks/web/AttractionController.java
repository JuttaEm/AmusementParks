package hh.swd20.AmusementParks.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import hh.swd20.AmusementParks.domain.AttractionRepository;
import hh.swd20.AmusementParks.domain.CategoryRepository;

@CrossOrigin
@Controller
public class AttractionController {
	
	@Autowired
	private AttractionRepository attractionRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/attractionlist")
	public String listAllAttractions(Model model) {
		model.addAttribute("attractions", attractionRepository.findAll());
		return "attractionlist";
	}

}
