package magictrio.javawwa30finalproject;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Data
@Entity
public class Event {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long ID;
    String name;
    String description;
    String city;
    LocalDateTime startEvent;
    LocalDateTime endEvent;

}
