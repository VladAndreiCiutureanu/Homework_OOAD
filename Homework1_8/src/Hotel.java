import java.util.List;

public class Hotel {
    protected String name;
    protected Address address;
    protected int stars;
    protected List<Tourist> tourists;

    public Hotel(int stars, Address address, String name, List<Tourist> tourists) {
        this.stars = stars;
        this.address = address;
        this.name = name;
        this.tourists = tourists;
    }

    public List<Tourist> getTourists() {
        return tourists;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", stars=" + stars +
                ", tourists=" + tourists +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Hotel && toString().equals(obj.toString());
    }

    public String getName() {
        return name;
    }
}
