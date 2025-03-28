public class Tourist extends Person {
    protected String origin;

    public Tourist(String name, int age, Address address, String origin) {
        super(name, age, address);
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tourist && toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", origin='" + origin + '\'' +
                '}';
    }
}
