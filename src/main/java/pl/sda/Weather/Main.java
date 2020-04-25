package pl.sda.Weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        Location location= new Location("Poznan","Poland");
        Request request=new Request("City","Poland");
        Weather weather=new Weather( 23.5,"Poznan");
        System.out.println(weather.getTemperature());
        weather.setTemperature(34.33);
        System.out.println(weather.getTemperature());

        mapper.writeValue(new File("data.json"),weather);
        Weather readWeather= mapper.readValue(new File("data.json"),Weather.class);
        System.out.println(readWeather.getCity());
        System.out.println(location.getCountry());

    }

}
