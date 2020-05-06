import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/weather")
public class WeatherController {

        @OnOpen
        public void handleOpen() {
                System.out.println("Connected ...");
        }

        @OnMessage
        public String handleMessage(String message) {
        System.out.println("MSG From Client : " + message);
        String replayMessage = WeatherService.answer(message);
        System.out.println("MSG From Server : " + replayMessage);
        return replayMessage;
    }


}
