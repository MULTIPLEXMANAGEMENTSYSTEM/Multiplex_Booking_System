package com.MBS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MBS.Model.Seats;

@Repository
public interface SeatsRepository extends JpaRepository<Seats, Integer> {

	@Query(value = "SELECT SUM(totalseats) FROM Seats ", nativeQuery = true)
	int sumofconfirmedseats();

	@Query(value = "SELECT SUM(totalseatscancelled) FROM Seats", nativeQuery = true)
	int totalcancelledseats();

	@Query(value = "SELECT sum(totalseats)-sum(totalseatscancelled)  FROM Seats ", nativeQuery = true)
	int totalconfirmedseats();

	@Query(value = "select sum(totalseats*seat_cost)  from seats ", nativeQuery = true)
	double amount();

}
