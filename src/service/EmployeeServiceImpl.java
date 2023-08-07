package service;

import entity.Employee;
import entity.Level;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void showAllEmployees() {
        List<Employee> employees = employeeRepository.getAll();
        if (employees.isEmpty()) System.out.println("No Employees");
        for (Employee item : employees) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void addEmployee(String name, String age, String level, String address, String country, String salary) {
        if (name.isBlank() || age.isBlank() || level.isBlank() || address.isBlank() || country.isBlank() || salary.isBlank()) {
            System.out.println("---- *** Failed add employee *** ----");
        } else {
            try {
                Integer cvAge = Integer.valueOf(age);
                Level cvLevel = Level.valueOf(level);
                Double cvSalary = Double.valueOf(salary);
                Employee newEmployee = new Employee(name, cvAge, cvLevel, address, country, cvSalary);
                employeeRepository.add(newEmployee);
                System.out.println("---- *** Success add employee *** ----");
                System.out.println(newEmployee);
            } catch (Exception e) {
                System.out.println("---- *** Failed add employee *** ----");
                System.out.println("---- *** MESSAGE ERROR : " + e.getMessage() + " *** ----");
            }
        }
    }

    @Override
    public void updateEmployee(String name, String whatUpdate, String update) {
        boolean isSuccessUpdate = employeeRepository.update(name, whatUpdate, update);
        if (isSuccessUpdate) System.out.println("---- *** Success update employee *** ----");
        else System.out.println("---- *** Failed update employee *** ----");
    }

    @Override
    public void deleteEmployee(String name) {
        boolean isSuccessDelete = employeeRepository.delete(name);
        if (isSuccessDelete) System.out.println("---- *** Success delete employee *** ----");
        else System.out.println("---- *** Failed delete employee *** ----");
    }

    @Override
    public void showDetailEmployee(String name) {
        Employee employee = employeeRepository.showDetail(name);

        if (employee != null) {
            System.out.println("---- *** Success show detail employee *** ----");
            System.out.println(employee);
        } else {
            System.out.println("---- *** Failed show detail employee *** ----");
        }

    }
}
