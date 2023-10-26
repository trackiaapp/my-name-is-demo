package trackia.app.example.mynameis.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import trackia.app.Trackia;
import trackia.app.example.mynameis.service.MyNameIsService;
import trackia.app.module.sla.Slable;
import trackia.app.module.sysinfo.Infoable;

@RestController
public class MyNameIsController {
	@Autowired MyNameIsService myNameIsService;

	@Trackia(description = "My Name Is TrackIA Example", write = true)
	@Slable(3000)
	@Infoable
	@GetMapping("myNameIs")
	public ResponseEntity<String> myNameIs() {
		return new ResponseEntity<>(myNameIsService.myNameIs(), HttpStatus.CREATED);
	}

}
