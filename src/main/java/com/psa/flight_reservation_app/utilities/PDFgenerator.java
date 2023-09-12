package com.psa.flight_reservation_app.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.psa.flight_reservation_app.entity.Reservation;



@Component
public class PDFgenerator {
	
	public void generateItinerary(Reservation reservation,String filePath) {
	        try {
	            Document document = new Document();
	            PdfWriter.getInstance(document, new FileOutputStream(filePath));
	            document.open();
	            document.add(generateTable(reservation));
	           document.close();
	        } catch (FileNotFoundException | DocumentException e) {
	            e.printStackTrace();
	        }
	    }
	  
     

	private PdfPTable generateTable(Reservation reservation) {
		   PdfPTable table = new PdfPTable(2);
	        PdfPCell cell;
	        

	        cell = new PdfPCell(new Phrase("Flight Itinerary"));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setColspan(2);
	        table.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase("Flight Detail"));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setColspan(2);
	        table.addCell(cell);
	        
	        table.addCell("Departure City");
	        table.addCell(reservation.getFlight().getDepartureCity());
	        table.addCell("Arrival City");
	        table.addCell(reservation.getFlight().getArrivalCity());
	        table.addCell("Flight Number");
	        table.addCell(reservation.getFlight().getFlightNumber());
	        table.addCell("Operating Airlines");
	        table.addCell(reservation.getFlight().getOperatingAirlines());
	        table.addCell("Departure Date");
	        table.addCell(reservation.getFlight().getDateOfDeparture().toString());
	        table.addCell("Departure Time");
	        table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
	       

	        cell = new PdfPCell(new Phrase("Passenger Detail"));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setColspan(2);
	        table.addCell(cell);
	        

	        table.addCell("First Name");
	        table.addCell(reservation.getPassenger().getFirstName());
	        table.addCell("Last Name");
	        table.addCell(reservation.getPassenger().getLastName());
	        table.addCell("Middle Name");
	        table.addCell(reservation.getPassenger().getMiddleName());
	        table.addCell("Email Id");
	        table.addCell(reservation.getPassenger().getEmailId());
	        table.addCell("Phone ");
	        table.addCell(reservation.getPassenger().getPhone());
	        
	        
	       return table;

	}
		
		}



	


