package trackia.app.example.mynameis.service;

import org.springframework.stereotype.Service;

import trackia.app.Trackia;
import trackia.app.to.Journal;

@Service
public class MyNameIsService {
	private static final String MYNAMEIS = ", my name is service @TrackIA";
	
	@Trackia(value = "SERVICE_LOCAL", description = "Greeting from service")
	public String myNameIs(Journal journal) {
		return MYNAMEIS;
	}
}
