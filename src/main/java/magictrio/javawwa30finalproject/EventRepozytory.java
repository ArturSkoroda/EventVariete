package magictrio.javawwa30finalproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.ArrayList;

@Repository
public interface EventRepozytory extends JpaRepository <Event, Long> {

}
