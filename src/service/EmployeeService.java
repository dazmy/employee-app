package service;

public interface EmployeeService {
    void showAllEmployees();

    void addEmployee(String name, String age, String level, String address, String country, String salary);

    void updateEmployee(String name, String whatUpdate, String update);

    void deleteEmployee(String name);

    void showDetailEmployee(String name);
}
