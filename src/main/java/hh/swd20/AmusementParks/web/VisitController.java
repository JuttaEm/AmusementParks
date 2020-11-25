/*package hh.swd20.AmusementParks.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hh.swd20.AmusementParks.domain.ParkRepository;
import hh.swd20.AmusementParks.domain.Visit;
import hh.swd20.AmusementParks.domain.VisitRepository;

@CrossOrigin
@Controller
public class VisitController {
	
	@Autowired
	private VisitRepository visitRepository;
	
	@Autowired
	private ParkRepository parkRepository;
	
	@GetMapping(value="/visitlist")
	public String listAllVisits(Model model) {
		model.addAttribute("visits", visitRepository.findAll());
		return "visitlist";
	}
	
	@GetMapping(value="/addvisit")
	public String addVisit(Model model) {
		model.addAttribute("visit", new Visit());
		return "addvisit";
	}
	
	@PostMapping("/savevisit")
	public String saveVisit(Visit visit) {
		visitRepository.save(visit);
		return "redirect:visitlist";
	}
	
	
}*/
