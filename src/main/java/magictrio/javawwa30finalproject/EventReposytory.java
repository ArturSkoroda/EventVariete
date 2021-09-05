package magictrio.javawwa30finalproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public interface EventReposytory extends JpaRepository <Event, Long> {
public List<Event> findAllByOrderByStartEventAsc();


}
