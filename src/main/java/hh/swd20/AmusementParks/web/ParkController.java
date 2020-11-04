package hh.swd20.AmusementParks.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.swd20.AmusementParks.domain.AttractionRepository;
import hh.swd20.AmusementParks.domain.Park;
import hh.swd20.AmusementParks.domain.ParkRepository;

@Controller
public class ParkController {
	
	@Autowired
	private ParkRepository parkRepository;
	
	@Autowired
	private AttractionRepository attractionRepository;
	
	
	/*@GetMapping("/parklist")
	public String listAllParks(Model model) {
		model.addAttribute("parks", parkRepository.findAll());
		return "parklist";
	}*/
	
	@RequestMapping(value="/parks", method = RequestMethod.GET)
	public @ResponseBody List<Park> getAllParks() {
		return (List<Park>) parkRepository.findAll(); 
	}
	
	

}
