package com.MBS.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MBS.Model.Seats;
import com.MBS.Repository.SeatsRepository;

@Service
@Transactional
public class SeatsService {
	@Autowired
	SeatsRepository repo;

	public Seats addSeats(Seats seat) {
		Seats e = repo.save(seat);
		return e;
	}

	public int totalconfirmedseats() {
		int a = repo.totalconfirmedseats();
		return a;
	}

	public int sumofconfirmedseats() {
		int a = repo.sumofconfirmedseats();
		return a;

	}

	public int totalcancelledseats() {
		int a = repo.totalcancelledseats();
		return a;
	}

	public double amount() {
		double a = repo.amount();
		return a;
	}
}
