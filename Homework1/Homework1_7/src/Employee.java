public class Employee extends Person {
    String position;

    public Employee(String name, int age, Address address, String position) {
        super(name, age, address);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", age=" + age + ", address=" + address + ", position=" + position + "]";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Employee && this.toString().equals(obj.toString());
    }
}
