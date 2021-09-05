package magictrio.javawwa30finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class    Greetings {

    public String text ;
@Autowired
EventRepozytory eventRepozytory;


 @GetMapping(path = "/")
    public String HelloMessage() {
        this.text = "Hello from first BBBBBBApp";
        System.out.println(eventRepozytory.findAll());
        return text;
    }

}
