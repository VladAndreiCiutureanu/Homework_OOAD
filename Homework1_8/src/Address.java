public class Address {
    protected String street;
    protected int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Address && toString().equals(obj.toString());
    }
}
