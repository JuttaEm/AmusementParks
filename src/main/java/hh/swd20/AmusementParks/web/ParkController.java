package hh.swd20.AmusementParks.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.swd20.AmusementParks.domain.Attraction;
import hh.swd20.AmusementParks.domain.AttractionRepository;
import hh.swd20.AmusementParks.domain.Park;
import hh.swd20.AmusementParks.domain.ParkRepository;

@Controller
public class ParkController {
	
	@Autowired
	private ParkRepository parkRepository;
	
	@Autowired
	private AttractionRepository attractionRepository;
	
	
	@GetMapping({"/", "/parklist"})
	public String listAllParks(Model model) {
		model.addAttribute("parks", parkRepository.findAll());
		return "parklist";
	}
	
	@RequestMapping(value="/parks", method = RequestMethod.GET)
	public @ResponseBody List<Park> getAllParks() {
		return (List<Park>) parkRepository.findAll(); 
	}
	
	@RequestMapping(value="/parks/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Park> findPark(@PathVariable("id") Long parkId) {	
	return parkRepository.findById(parkId);
	}
	
	@GetMapping("/addpark")
	public String addPark(Model model) {
		model.addAttribute("park", new Park());
		return "addpark";
	}
	
	@PostMapping("/savepark")
	public String savePark(Park park) {
		parkRepository.save(park);
		return "redirect:parklist";
	}
	
	@GetMapping(value="/editpark/{id}")
	public String editPark(@PathVariable("id") Long parkId, Model model) {
		model.addAttribute("park", parkRepository.findById(parkId));
		return "editpark";
	}
	
	
	@RequestMapping(value="/deletepark/{id}", method = RequestMethod.GET)
	public String deletePark(@PathVariable("id") Long parkId, Model model) {
		parkRepository.deleteById(parkId);
		return "redirect:../parklist";
	}
	
	@GetMapping(value="/attractionlist/{id}")
	public String findAttractionsByParkId(@PathVariable("id") Long parkId, Attraction attraction, Model model) {
		//parkRepository.findAttractionsByParkId(parkId);
		model.addAttribute("park", parkRepository.findById(parkId));
		model.addAttribute("attractions", attractionRepository.findById(attraction.getAttractionId()));
		return "attractionlist";
	}
	

}
