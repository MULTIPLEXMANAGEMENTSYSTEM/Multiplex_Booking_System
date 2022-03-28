package com.MBS;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.MBS.Model.Seats;
import com.MBS.Repository.SeatsRepository;
import com.MBS.Service.SeatsService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {
	@MockBean
	private SeatsRepository repo;

	@Autowired
	SeatsService service;

	@Test
	public void saveUser() {
		Seats seat = new Seats(1, 140, 5, 0, 1, 1, "Premimum");
		when(repo.save(seat)).thenReturn(seat);
		assertEquals(seat, service.addSeats(seat));
	}

	@Test
	public int sumofconfirmedseats() {
		AdminTest test = new AdminTest();
		int output = test.sumofconfirmedseats();
		assertEquals(10, output);
		return output;
	}

	@Test
	public int totalcancelledseats() {
		AdminTest test = new AdminTest();
		int output = test.totalcancelledseats();
		assertEquals(3, output);
		return output;
	}

	@Test
	public int totalconfirmedseats() {
		AdminTest test = new AdminTest();
		int output = test.totalconfirmedseats();
		assertEquals(3, output);
		return output;
	}

	@Test
	public double amount() {
		AdminTest test = new AdminTest();
		double output = test.amount();
		assertEquals(3, output);
		return output;
	}

}
