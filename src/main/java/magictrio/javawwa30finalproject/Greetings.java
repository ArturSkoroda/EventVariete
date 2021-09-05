package magictrio.javawwa30finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class    Greetings {

    public String text ;
@Autowired
EventReposytory eventReposytory;


 @GetMapping(path = "/")
    public String HelloMessage() {
        this.text = "Hello from first BBBBBBApp";
        System.out.println(eventReposytory.findAll());
        return text;
    }
    @GetMapping(path = "/events")
    public String EventLisst(){
              return String.valueOf(eventReposytory.findAll());
    }
    @GetMapping(path = "/eventsByStartDate")/*trzeba zamienić sortowanie na po dacie startu Eventu*/
    public String EventLisstSortedByStartDate(){
        return String.valueOf(eventReposytory.findAll());
    }

    /*dodawanie i zapisywanie do listy Eventów nowych wydarzeń*/
    public  void addEvents(Event event) {this.eventReposytory.save(event);}
}
