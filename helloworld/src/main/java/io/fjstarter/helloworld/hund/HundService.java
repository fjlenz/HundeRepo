package io.fjstarter.helloworld.hund;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HundService {

	private List<Hund> hunde = new ArrayList<>(Arrays.asList(
			new Hund("1","Gelb","Hasso"),
			new Hund("2","Braun","Schnuffel"),					
			new Hund("3","Schwarz","Rolf")
		));
	
	public List<Hund> getHunde() {
		return hunde;
	}
	
	public Hund getHund(String id) {
		return hunde.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
	public Hund addHund(Hund h) {
		hunde.add(h);
		return h;
	}
	
	
}



