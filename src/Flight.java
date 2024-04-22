public class Flight {

    private String flightName;
    private String departureTime;
    private String arrivalTime;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Aircraft aircraft;

    // Constructor for the Flight class
    public Flight(String flightName, String departureTime, String arrivalTime,
                  Airport departureAirport, Airport arrivalAirport, Aircraft aircraft) {
        this.flightName = flightName;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.aircraft = aircraft;
    }

    // Getter methods for flight attributes

    public String getFlightName() {
        return flightName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }
}
