package test.view;

import entity.Employee;
import entity.Level;
import repository.EmployeeRepository;
import repository.EmployeeRepositoryImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import view.EmployeeView;

public class EmployeeViewTest {
    private static final EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    private static final EmployeeService employeeService = new EmployeeServiceImpl(employeeRepository);
    private static final EmployeeView employeeView = new EmployeeView(employeeService);
    public static void main(String[] args) {
        testViewShowDetailEmployee();
    }

    public static void testMenuApplicationEmployee() {
        employeeRepository.add(new Employee("Adam", 19, Level.Junior, "Indramayu", "Indonesia", 999.9));
        employeeView.menuApplicationEmployee();
    }

    public static void testViewAddEmployee() {
        employeeView.viewAddEmployee();
    }

    public static void testViewUpdateEmployee() {
        employeeRepository.add(new Employee("Adam", 19, Level.Junior, "Indramayu", "Indonesia", 999.9));
        employeeService.showAllEmployees();
        employeeView.viewUpdateEmployee();
        employeeService.showAllEmployees();
    }

    public static void testViewRemoveEmployee() {
        employeeRepository.add(new Employee("Adam", 19, Level.Junior, "Indramayu", "Indonesia", 999.9));
        employeeService.showAllEmployees();
        employeeView.viewDeleteEmployee();
        employeeService.showAllEmployees();
    }

    public static void testViewShowDetailEmployee() {
        employeeRepository.add(new Employee("Adam", 19, Level.Junior, "Indramayu", "Indonesia", 999.9));
        employeeService.showAllEmployees();
        employeeView.viewShowDetailEmployee();
        employeeService.showAllEmployees();
    }
}
