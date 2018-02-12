package web;

import backend.SmartHouse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    SmartHouse smartHouse = new SmartHouse();
    @RequestMapping("/print")
    public String print(@RequestParam(value = "toPrint")String toPrint){
        smartHouse.print(toPrint);
        return "Request was send";
    }
    //http://localhost:8080/print?toPrint=Proszę wydrukuj strone testową

}
