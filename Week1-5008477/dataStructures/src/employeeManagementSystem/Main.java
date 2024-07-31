package employeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create an EmployeeManagementSystem with a capacity of 5 employees
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        // Add employees
        system.addEmployee(new Employee("E001", "Alice Johnson", "Manager", 75000));
        system.addEmployee(new Employee("E002", "Bob Smith", "Developer", 60000));
        system.addEmployee(new Employee("E003", "Charlie Brown", "Designer", 55000));
        system.addEmployee(new Employee("E004", "Diana Prince", "Tester", 50000));
        system.addEmployee(new Employee("E005", "Edward Blake", "Developer", 62000));

        // Print all employees
        System.out.println("All employees:");
        system.traverseEmployees();

        // Search for an employee by ID
        String searchId = "E003";
        Employee foundEmployee = system.searchEmployee(searchId);
        if (foundEmployee != null) {
            System.out.println("Employee found with ID " + searchId + ": " + foundEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        // Delete an employee by ID
        String deleteId = "E002";
        system.deleteEmployee(deleteId);
        System.out.println("Employees after deletion of ID " + deleteId + ":");
        system.traverseEmployees();
    }
}
