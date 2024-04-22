import java.util.ArrayList;

public class Aircraft {
    private String name;            // Aircraft name
    private String state;           // Aircraft state: working/under repair
    private String flightState;     // Landed/Airborne
    private ArrayList<Pilot> pilots; // List of all pilots for the aircraft

    public Aircraft(String name, String state, String flightState, ArrayList<Pilot> pilots) {
        this.name = name;
        this.state = state;
        this.flightState = flightState;
        this.pilots = pilots;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getFlightState() {
        return flightState;
    }

    public void joinPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public ArrayList<Pilot> printPilots() {
        System.out.println("Pilots working on " + name + ":");
        for (Pilot pilot : pilots) {
            System.out.println("Name: " + pilot.getName() +
                    ", License Number: " + pilot.getLicenseNumber());
        }
        return pilots;
    }

    public Pilot[] getPilots() {
        return pilots.toArray(new Pilot[0]);
    }
}
