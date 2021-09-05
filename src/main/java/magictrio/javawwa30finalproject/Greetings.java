package magictrio.javawwa30finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class    Greetings {
    public String text;
    @Autowired
    EventReposytory eventReposytory;


    @GetMapping(path = "/")
    public String HelloMessage() {
        this.text = "Hello from first BBBBBBApp";
               return text;
    }

    @GetMapping(path = "/events")
    public List<Event> EventLisst() {
        return eventReposytory.findAll();
    }

    @GetMapping(path = "/eventsByStartDate")
    public List<Event> EventLisstSortedByStartDate() {
        return eventReposytory.findAllByOrderByStartEventAsc();
    }

    @GetMapping(path = "/eventsAds")
    /*dodawanie i zapisywanie do listy Eventów nowych wydarzeń*/
    public void addEvents(Event event) {
        this.eventReposytory.save(event);
    }

    @PostMapping("/eventsAds")
       public void createEvent(@RequestBody Event event) {
              eventReposytory.save(event);


    }

}
