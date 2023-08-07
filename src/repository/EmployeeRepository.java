package repository;

import entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAll();

    void add(Employee employee);

    boolean update(String name, String whatUpdate, String update);

    boolean delete(String name);

    Employee showDetail(String name);
}
