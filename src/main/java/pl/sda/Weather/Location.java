package pl.sda.Weather;

public class Location {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Location(String name, String country) {
        this.name = name;
        this.country = country;
    }

    private String name;

    public String getCountry() {
        return country;
    }

    private String country;
}
