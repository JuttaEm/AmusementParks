package hh.swd20.AmusementParks.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.swd20.AmusementParks.domain.ParkRepository;

@Controller
public class ParkController {
	
	@Autowired
	private ParkRepository parkRepository;
	
	@GetMapping("/parklist")
	public String listAllParks(Model model) {
		model.addAttribute("parks", parkRepository.findAll());
		return "parklist";
	}

}
