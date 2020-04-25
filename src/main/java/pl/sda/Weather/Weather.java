package pl.sda.Weather;

public class Weather {
    private Double temperature;
    private String city;

    public Weather(){}

    public Weather(Double temperature,String city){
        this.temperature=temperature;
        this.city=city;
    }
    public Double getTemperature(){
        return temperature;
    }
    public void setTemperature (Double temperature){
        this.temperature=temperature;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
}
