package magictrio.javawwa30finalproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    public String text ;

 @GetMapping(path = "/")
    public String HelloMessage() {
        this.text = "Hello from first AAAAAAAAAAAAApp";
        System.out.println(text);
        return text;
    }

}
