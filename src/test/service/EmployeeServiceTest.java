package test.service;

import repository.EmployeeRepository;
import repository.EmployeeRepositoryImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeServiceTest {
    private final static EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    private final static EmployeeService employeeService = new EmployeeServiceImpl(employeeRepository);

    public static void main(String[] args) {
        testAddEmployee();
    }

    public static void testShowAllEmployees() {
        employeeService.showAllEmployees();
    }

    public static void testAddEmployee() {
        String name = "Adam";
        String age = "19";
        String level = "Middle";
        String address = "Indramayu";
        String country = "Indonesia";
        String salary = "820.5";

        employeeService.addEmployee(name, age, level, address, country, salary);
        employeeService.addEmployee(name, age, level, address, country, salary);

        employeeService.showAllEmployees();
    }

    public static void testShowDetailEmployee() {
        String name = "Adam";
        String age = "19";
        String level = "Middle";
        String address = "Indramayu";
        String country = "Indonesia";
        String salary = "820.5";

        employeeService.addEmployee(name, age, level, address, country, salary);

        employeeService.showDetailEmployee("Adammaaa");
    }

    public static void testDeleteEmployee() {
        String name = "Adam";
        String age = "19";
        String level = "Middle";
        String address = "Indramayu";
        String country = "Indonesia";
        String salary = "820.5";

        employeeService.addEmployee(name, age, level, address, country, salary);
        employeeService.addEmployee(name, age, level, address, country, salary);
        employeeService.addEmployee(name, age, level, address, country, salary);

        employeeService.deleteEmployee("Fuji");
        employeeService.showAllEmployees();
    }

    public static void testUpdateEmployee() {
        String name = "Adam";
        String age = "19";
        String level = "Middle";
        String address = "Indramayu";
        String country = "Indonesia";
        String salary = "820.5";

        employeeService.addEmployee(name, age, level, address, country, salary);

        employeeService.showAllEmployees();
        employeeService.updateEmployee("Adam", "salary", "999.99");
        employeeService.showAllEmployees();
    }
}
