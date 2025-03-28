import java.util.List;

public class Company {
    String name;
    Address address;
    List<Employee> employees;

    public Company(String name, Address address, List<Employee> employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public boolean addEmployee(Employee e) {
        if (employees.contains(e) && employees.size() > 0) {
            return false;
        }
        return employees.add(e);
    }

    public void displayAddresses(){
        for (Employee e : employees) {
            System.out.println(e.getAddress());
        }
    }

    public void displayEmployees(){
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
