public abstract class Person {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public boolean changeAddress(Address address) {
        if(this.address.equals(address)) {
            return false;
        }
        this.address = address;
        return true;
    }

    public Address getAddress() {
        return address;
    }
}
