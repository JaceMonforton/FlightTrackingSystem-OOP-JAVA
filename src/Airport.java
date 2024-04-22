import java.util.ArrayList;

public class Airport {
    private String city;    // Airport city
    private String country; // Airport country
    private String id;      // Airport id

    public Airport(String city, String country, String id) {
        this.city = city;
        this.country = country;
        this.id = id;
    }

    public String getAirportCity() {
        return city;
    }

    public String getAirportCountry() {
        return country;
    }

    public String getAirportId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n" + "City: " + city + "\n" +
                "Country: " + country + "\n" +
                "ID: " + id + "\n";
    }
}
