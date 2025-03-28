import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Hotel h1 = new Hotel(5, new Address("Main St.", 123), "Hotel 1", new ArrayList<Tourist>(List.of(new Tourist("Alice", 25, new Address("Main St.", 126), "USA"))));
        h1.getTourists().add(new Tourist("Bob", 30, new Address("Main St.", 124), "USA"));
        h1.getTourists().add(new Tourist("Jack", 35, new Address("Main St.", 125), "UK"));

        System.out.println(Utility.isPersonAccommodated(h1, new Tourist("Alice", 25, new Address("Main St.", 126), "USA")));
        System.out.println(Utility.isPersonAccommodated(h1, new Tourist("Alice", 26, new Address("Main St.", 126), "USA")));
        h1.getTourists().get(0).changeAddress(new Address("Main St.", 223));
        Hotel h2 = new Hotel(4, new Address("Main St.", 130), "Hotel 2", new ArrayList<Tourist>(List.of(new Tourist("Charlie", 40, new Address("Main St.", 135), "Romania"))));

        City c = new City("City 1", new ArrayList<Person>(List.of(new Person("John", 45, new Address("Main St.", 100)), new Person("Mary", 50, new Address("Main St.", 101)))), new ArrayList<Hotel>(List.of(h1, h2)));
        Utility.printHotels(c);
        Utility.printPeople(c);
        Utility.printTourists(c);

        Utility.moveTourist(h1.getTourists().get(0), h1, h2);
        Utility.printTourists(c);
    }
}
