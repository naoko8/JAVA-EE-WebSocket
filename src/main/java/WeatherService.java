import weatherInfo.getWeather;
import weatherInfo.WeatherModel;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {

        public static String answer(String question) {
            String result ;

            switch (question) {
                case "all":
                    result= getWeather.getweather().toString();
                    break;
                default:
                    result = "ამ კითხვაზე პასუხი არ მაქვს";
            }

            return result;
        }


}
