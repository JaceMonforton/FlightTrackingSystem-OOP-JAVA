import java.util.ArrayList;

public class Airline {
    private String id;              // airline id
    ArrayList<Flight> flights;      // list of flights for this airline
    ArrayList<Aircraft> aircraft;   // list of aircraft for this airline

    /**
     * Constructor for the Airline class.
     *
     *  id       The ID of the airline.
     *  flights  The list of flights for this airline.
     *  aircraft The list of aircraft for this airline.
     */
    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft) {
        this.id = id;
        this.flights = flights;
        this.aircraft = aircraft;
    }

    /**
     * Gets the ID of the airline.
     *
     * returns The airline ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the list of flights for this airline.
     *
     * @return The list of flights.
     */
    public ArrayList<Flight> getFlights() {
        return flights;
    }

    /**
     * Gets the list of aircraft for this airline.
     *
     * @return The list of aircraft.
     */
    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }

    /**
     * Adds an aircraft to the airline. If the aircraft is already owned by the airline, do nothing.
     *
     * @param aircraft The aircraft to be added.
     */
    public void owns(Aircraft aircraft) {
        if (!this.aircraft.contains(aircraft)) {
            this.aircraft.add(aircraft);
        }
        // If the airline already owns the aircraft, do nothing
    }

    /**
     * Prints information about flights owned by the airline.
     */
    public void printFlightByNameWithPilots() {
        System.out.println("Flights owned by airline " + id + ":");
        for (Flight flight : flights) {
            Aircraft flightAircraft = flight.getAircraft();
            System.out.println("Flight ID: " + flight.getFlightName() + "\n" +
                    "Aircraft: " + flightAircraft.getName() + "\n" + "\n" +
                    "Departure Airport: " + flight.getDepartureAirport()  +
                    "Departure Time: " + flight.getDepartureTime() + "\n" + "\n" +
                    "Arrival Airport: " + flight.getArrivalAirport() +
                    "Arrival Time: " + flight.getArrivalTime() + "\n"   );

            // Print pilots for the current flight
            System.out.println("Pilots:");
            for (Pilot pilot : flightAircraft.getPilots()) {
                System.out.println(" - Name: " + pilot.getName() +
                        ", ID: " + pilot.getLicenseNumber() +
                        ", Position: " + pilot.getPilotPosition());
            }

            System.out.println();
        }
    }

    /**
     * Gets a list of pilots working for the airline.
     *
     * @return The list of working pilots.
     */
    public ArrayList<Pilot> pilotsWorkingForAirline() {
        ArrayList<Pilot> workingPilots = new ArrayList<>();

        for (Aircraft currentAircraft : aircraft) {
            Pilot[] pilotsInAircraft = currentAircraft.getPilots();

            for (Pilot pilot : pilotsInAircraft) {
                if (!workingPilots.contains(pilot)) {
                    workingPilots.add(pilot);
                }
            }
        }

        return workingPilots;
    }

    /**
     * Gets a list of flights departing from a specific airport on a specific date.
     *
     * @param airport    The departure airport.
     * @param departTime The departure time.
     * @return The list of departure flights.
     */
    public ArrayList<Flight> getDepartureFlightByAirport(Airport airport, String departTime) {
        ArrayList<Flight> list = new ArrayList<Flight>();
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getDepartureAirport().equals(airport) & (flights.get(i).getDepartureTime().equals(departTime)))
                list.add(flights.get(i));
        }
        return list;
    }



    /**
     * Gets a list of flights arriving from a specific airport on a specific date.
     *
     * @param airport     The arrival airport.
     * @param arrivalDate The arrival date.
     * @return The list of arrival flights.
     */
    public ArrayList<Flight> getArrivalFlightByAirport(Airport airport, String arrivalDate) {
        ArrayList<Flight> arrivalFlights = new ArrayList<>();

        for (Flight flight : flights) {
            if (flight.getArrivalAirport().equals(airport) && flight.getArrivalTime().equals(arrivalDate)) {
                arrivalFlights.add(flight);
            }
        }

        return arrivalFlights;
    }
}
