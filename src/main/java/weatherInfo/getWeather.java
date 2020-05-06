package weatherInfo;
import java.util.List;
import java.util.ArrayList;

public class getWeather {

    public static List<WeatherModel> getweather() {
        List<WeatherModel> weather = new ArrayList<>();
        weather.add(new WeatherModel("Tbilisi", 20, 15,70,"East",20));
        weather.add(new WeatherModel("Kutaisi", 22, 12,71,"East",20));
        weather.add(new WeatherModel("Batumi", 25, 11,72,"West",20));

        return weather;
    }
}
