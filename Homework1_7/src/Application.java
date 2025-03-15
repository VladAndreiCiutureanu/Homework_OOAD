import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Company company1 = new Company("Ford", new Address("X", 12, "Craiova", "Dolj"), new ArrayList<>());
        Company company2 = new Company("Dacia", new Address("Y", 12, "Craiova", "Dolj"), new ArrayList<>());
        Company company3 = new Company("Renault", new Address("Z", 12, "Craiova", "Dolj"), new ArrayList<>());

        company1.addEmployee(new Employee("John", 23, new Address("A", 12, "Craiova", "Dolj"), "Manager"));
        company1.addEmployee(new Employee("Alice", 25, new Address("B", 12, "Craiova", "Dolj"), "Developer"));
        company2.addEmployee(new Employee("Bob", 30, new Address("C", 12, "Craiova", "Dolj"), "Tester"));
        company2.addEmployee(new Employee("Charlie", 35, new Address("D", 12, "Craiova", "Dolj"), "Designer"));
        company3.addEmployee(new Employee("David", 40, new Address("E", 12, "Craiova", "Dolj"), "Manager"));
        company3.addEmployee(new Employee("Eve", 45, new Address("F", 12, "Craiova", "Dolj"), "Developer"));

        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);


        Utility.displayEmployeesAdressesAtCompanyAddress(companies, new Address("X", 12, "Craiova", "Dolj"));
        Utility.displayEmployeesAtCompany(companies, "Dacia");
        Utility.moveEmployee(new Employee("John", 23, new Address("A", 12, "Craiova", "Dolj"), "Manager"), company1, company2, "Tester");
        Utility.displayEmployeesAtCompany(companies, "Ford");
        Utility.displayEmployeesAtCompany(companies, "Dacia");
    }
}
