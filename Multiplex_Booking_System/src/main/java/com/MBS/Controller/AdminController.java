package com.MBS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MBS.Exception.ResourceNotFoundException;
import com.MBS.Model.Seats;
import com.MBS.Service.SeatsService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	SeatsService service;

	@PostMapping("/addSeats")
	public ResponseEntity<String> addSeats(@RequestBody Seats seat) {
		Seats e = service.addSeats(seat);
		return new ResponseEntity<String>("Inserted Successfully", HttpStatus.OK);
	}

	@GetMapping("/sumofconfirmedseats")
	public int sumofconfirmedseats() {
		int a = service.sumofconfirmedseats();
		if (a == 0) {
			throw new ResourceNotFoundException("seats should be selected");
		}
		return a;
	}

	@GetMapping("/sumofcancelledseats")
	public int totalcancelledseats() {
		int a = service.totalcancelledseats();

		if (a == 0) {
			throw new ResourceNotFoundException("seats should be selected");
		}

		return a;
	}

	@GetMapping("/TotalConfirmedseats")
	public int totalconfirmedseats() {
		int a = service.totalconfirmedseats();

		if (a == 0) {
			throw new ResourceNotFoundException("seats should be selected");
		}

		return a;
	}

	@GetMapping("/profit")
	public double amount() {
		double a = service.amount();
		if (a == 0) {
			throw new ResourceNotFoundException("amount should be paid");
		}

		return a;
	}

}
