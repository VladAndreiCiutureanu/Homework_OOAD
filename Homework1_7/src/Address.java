public class Address {
    String street;
    int number;
    String city;
    String county;

    public Address(String street, int number, String city, String county) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.county = county;
    }

    @Override
    public String toString() {
        return "Address[ street=" + street + ", number=" + number + ", city=" + city + ", county=" + county + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Address && this.toString().equals(obj.toString());
    }
}
