import java.util.List;

public class Utility {
    public static boolean moveEmployee(Employee e, Company source, Company destination, String newPosition) {
        if(source.equals(destination)) {
            return false;
        }
        if(source.employees.contains(e)) {
            source.employees.remove(e);
            destination.employees.add(e);
            e.setPosition(newPosition);
            return true;
        }
        return false;
    }

    public static void displayEmployeesAdressesAtCompanyAddress(List<Company> companies, Address address) {
        for(Company company : companies) {
            if(company.getAddress().equals(address)) {
                company.displayAddresses();
                break;
            }
        }
    }

    public static void displayEmployeesAtCompany(List<Company> companies, String name) {
        for(Company company : companies) {
            if(company.getName().equals(name)) {
                company.displayEmployees();
                break;
            }
        }
    }
}
