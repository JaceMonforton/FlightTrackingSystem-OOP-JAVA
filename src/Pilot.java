import java.util.ArrayList;
public class Pilot {

	private String pilotName;
	private int pilotID;
	private String pilotPosition;
	private ArrayList<Flight> flights; // List of flights associated with the pilot

	public Pilot(String pilotName, int pilotID, String pilotPosition) {
		this.pilotName = pilotName;
		this.pilotID = pilotID;
		this.pilotPosition = pilotPosition;
		this.flights = new ArrayList<>();
	}

	public String getName() {
		return pilotName;
	}

	public int getLicenseNumber() {
		return pilotID;
	}

	public String getPilotPosition() {
		return pilotPosition;
	}

	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}
}
