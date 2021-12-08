package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person, LocalTime localTime) {
        if (person.getTicket().entryTime().isAfter(localTime)) {
            people.add(person);
        } else {
            throw new IllegalArgumentException("Entrance not possible due to starting time of the event.");
        }
    }
}
