package magictrio.javawwa30finalproject;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
@AllArgsConstructor
@Entity
public class Event {
    @Id
    Long ID;
    String name;
    String description;
    String city;
    LocalDateTime startEvent;
    LocalDateTime endEvent;

}
