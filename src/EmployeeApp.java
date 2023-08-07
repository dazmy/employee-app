import repository.EmployeeRepository;
import repository.EmployeeRepositoryImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import view.EmployeeView;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeRepository);
        EmployeeView employeeView = new EmployeeView(employeeService);

        employeeView.menuApplicationEmployee();
    }
}
