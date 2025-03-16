import java.util.List;

public class City {
    protected List<Hotel> hotels;
    protected String name;
    protected List<Person> people;

    public City(String name, List<Person> people, List<Hotel> hotels) {
        this.hotels = hotels;
        this.name = name;
        this.people = people;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public List<Person> getPeople() {
        return people;
    }
}
