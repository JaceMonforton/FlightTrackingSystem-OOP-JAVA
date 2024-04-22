/*******************************************************
 * Author: Jace Monforton (100836485)
 * Date: November 22nd - 2023
 * Final Assignment OOP 2023
 * Description:
 This Program models an Aircraft / Airport system with classes representing:
 airports, pilots, aircraft, flights, and airlines.
 The program demonstrates a basic structure for modeling aviation-related entities and
 their relationships in a simplified system. It uses object-oriented principles to represent real-world concepts and their interactions.
 *******************************************************/


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AirportTest {

	public static void main(String[] args) throws ParseException {

		// instantiate objects from Airport class
		Airport pearson = new Airport("Toronto", "Canada", "YYZ");
		Airport montreal = new Airport("Montreal", "Canada", "YUL");
		Airport ottawa = new Airport("Ottawa", "Canada", "YOW");


		// instantiate objects from Pilots class
		Pilot johnSmith = new Pilot("John Smith", 540, "Captain");
		Pilot sarahEric = new Pilot("Sarah Eric", 651, "CoPilot");
		Pilot monnaKam = new Pilot("Monna Kam", 785, "Navigator");

		// instantiate objects from Aircraft class
		ArrayList<Pilot> pilots = new ArrayList<Pilot>();
		pilots.add(johnSmith);
		pilots.add(sarahEric);
		pilots.add(monnaKam);
		Aircraft boeing787 = new Aircraft("Boeing 787", "Working", "Landed", pilots);

		// instantiate objects from Flight class
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Date departureTime = (dateFormat.parse("07/17/2018 03:19"));
		Date arrivalTime = (dateFormat.parse("07/20/2018 04:50"));
		Flight ac472 = new Flight("AC472", departureTime.toString(), arrivalTime.toString(), pearson, ottawa, boeing787);

		// instantiate objects from Airline class
		ArrayList<Flight> flights = new ArrayList<Flight>();
		flights.add(ac472);
		ArrayList<Aircraft> Aircrafts = new ArrayList<Aircraft>();
		Aircrafts.add(boeing787);
		Airline airCanada = new Airline("Air Canada", flights, Aircrafts);

		airCanada.printFlightByNameWithPilots();

	}
}
