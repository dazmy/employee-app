package view;

import service.EmployeeService;
import util.InputUtil;

public class EmployeeView {
    private final EmployeeService employeeService;

    public EmployeeView(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void menuApplicationEmployee() {
        boolean isMenu = true;
        while (isMenu) {
            System.out.println("----- *** MENU *** -----");
            System.out.println("1. Show All Employees");
            System.out.println("2. Add Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Show Detail Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit Application");

            try {
                int menu = InputUtil.inputMenu("Select");
                switch (menu) {
                    case 1 -> viewShowAllEmployees();
                    case 2 -> viewAddEmployee();
                    case 3 -> viewUpdateEmployee();
                    case 4 -> viewShowDetailEmployee();
                    case 5 -> viewDeleteEmployee();
                    case 6 -> isMenu = false;
                    default -> System.out.println("Unlisted from menu");
                }
            } catch (Throwable e) {
                System.out.println("Unlisted from menu");
            }
        }
    }

    public void viewShowAllEmployees() {
        System.out.println("---- *** ALL EMPLOYEES *** ----");
        employeeService.showAllEmployees();
    }

    public void viewAddEmployee() {
        System.out.println("---- *** ADD EMPLOYEE *** ----");
        String name = InputUtil.inputEmployee("Name");
        String age = InputUtil.inputEmployee("Age");
        String level = InputUtil.inputLevel("Level");
        String address = InputUtil.inputEmployee("Address");
        String country = InputUtil.inputEmployee("Country");
        String salary = InputUtil.inputEmployee("salary");

        employeeService.addEmployee(name, age, level, address, country, salary);
    }

    public void viewUpdateEmployee() {
        System.out.println("---- *** UPDATE EMPLOYEE *** ----");
        String name = InputUtil.inputEmployee("Name");
        String whatUpdate = InputUtil.inputEmployee("What do you want update ?");
        String update = InputUtil.inputEmployee("Update TO");

        employeeService.updateEmployee(name, whatUpdate, update);
    }

    public void viewDeleteEmployee() {
        System.out.println("---- *** DELETE EMPLOYEE *** ----");
        String name = InputUtil.inputEmployee("Name");

        employeeService.deleteEmployee(name);
    }

    public void viewShowDetailEmployee() {
        System.out.println("---- *** DETAIL SHOW EMPLOYEE *** ----");
        String name = InputUtil.inputEmployee("Name");

        employeeService.showDetailEmployee(name);
    }
}
