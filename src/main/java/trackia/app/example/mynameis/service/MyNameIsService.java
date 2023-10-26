package trackia.app.example.mynameis.service;

import org.springframework.stereotype.Service;

import trackia.app.Trackia;

@Service
public class MyNameIsService {
	private static final String MYNAMEIS = ", my name is service @TrackIA";
	
	@Trackia(value = "SERVICE_LOCAL", description = "Greeting from service")
	public String myNameIs() {
		return MYNAMEIS;
	}
}
