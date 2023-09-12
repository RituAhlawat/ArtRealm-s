package com.psa.flight_reservation_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.flight_reservation_app.dto.ReservationRequest;
import com.psa.flight_reservation_app.entity.Flight;
import com.psa.flight_reservation_app.entity.Passenger;
import com.psa.flight_reservation_app.entity.Reservation;
import com.psa.flight_reservation_app.repository.FlightRepository;
import com.psa.flight_reservation_app.repository.PassengerRepository;
import com.psa.flight_reservation_app.repository.ReservationRepository;
import com.psa.flight_reservation_app.utilities.EmailUtility;
import com.psa.flight_reservation_app.utilities.PDFgenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
    
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	PDFgenerator pdfgenerator;
	@Autowired
	EmailUtility emailUtility;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
      Passenger passenger=new Passenger();
      passenger.setFirstName(request.getFirstName());
      passenger.setLastName(request.getLastName());
      passenger.setMiddleName(request.getMiddleName());
      passenger.setEmailId(request.getEmailId());
      passenger.setPhone(request.getPhone());
      passengerRepo.save(passenger);
      
      long flightId = request.getFlightId();
      Optional<Flight> findById = flightRepo.findById(flightId);
      Flight flight = findById.get();
      
      Reservation reservation=new Reservation();
      reservation.setFlight(flight);
      reservation.setPassenger(passenger);
      reservation.setCheckedIn(false);
      reservation.setNumberOfBags(2);
     
      String filePath="D:\\Advance Java\\flight_reservation_app\\tickets\\reservation"+reservation.getId()+".pdf";
      reservationRepo.save(reservation);
      
      pdfgenerator.generateItinerary(reservation,filePath);
     emailUtility.sendItinerary(passenger.getEmailId(),filePath);
      return reservation;
	}

}
