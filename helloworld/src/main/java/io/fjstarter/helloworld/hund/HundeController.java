package io.fjstarter.helloworld.hund;

//import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HundeController {

	@Autowired
	private HundService hundService;
	
	// Returns all Dogs
	@RequestMapping("/hunde")
	public List<Hund> getAllDogs() {
		return hundService.getHunde();
	}
	

	// Returns single Dog
	@RequestMapping("/hund/{id}")
	public Hund getDog(@PathVariable String id) {
		return hundService.getHund(id);
	}
	
	
	// Add Dog
	@RequestMapping(value = "/hund", method=RequestMethod.POST)
	public Hund addDog(@RequestBody Hund hund) {
		hundService.addHund(hund);
		return hund;
	}
	
}



