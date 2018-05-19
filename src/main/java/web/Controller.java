package web;

import backend.Room;
import backend.SmartHouse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * In Spring’s approach to building RESTful web services,
 * HTTP requests are handled by a controller.
 * These components are easily identified by the @RestController annotation,
 * and the Controller  handles REST requests
 * for /print
 */
@RestController
public class Controller {

    SmartHouse smartHouse = new SmartHouse();

    @RequestMapping("/print")
    public String print(@RequestParam(value = "toPrint") String toPrint) {
        smartHouse.print(toPrint);
        return "Request confirmation. Page was printed on LG ";//to web browser
    }
    //http://localhost:8080/print?toPrint=Please print test page on LG printer

    @RequestMapping("/turnOnTV")
    public String turnOnTv(@RequestParam(value = "room") Room room) {
        smartHouse.turnOnTV(room);
        return String.format("TV in room %s turned on", room);
    }
    //http://localhost:8080/turnOnTV?room?BIG_ROOM
}

/**
 * @RestController to adnotacja, która sprawia, że klasa
 * będzie mogła obsługiwać żądania REST.
 * Jej użycie jest równoważne zastosowaniu dwóch innych
 * adnotacji: @Controller and @ResponseBody. W ten sposób tworzy kontroler, który
 * zwraca dane tekstowe (a nie kod HTML).
 * @RequestMapping pozwala określić adres, pod jakim ma być
 * dostępny kontroler.
 */
