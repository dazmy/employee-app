package repository;

import entity.Employee;
import entity.Level;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        if (employee != null) employeeList.add(employee);
    }

    @Override
    public boolean update(String name, String whatUpdate, String update) {
        for (Employee item : employeeList) {
            if (item.getName().equals(name)) {
                switch (whatUpdate) {
                    case "name" -> item.setName(update);
                    case "age" -> item.setAge(Integer.valueOf(update));
                    case "level" -> item.setLevel(Level.valueOf(update));
                    case "address" -> item.setAddress(update);
                    case "country" -> item.setCountry(update);
                    case "salary" -> item.setSalary(Double.valueOf(update));
                    default -> {return false;}
                }
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean delete(String name) {
        for (Employee item : employeeList) {
            if (item.getName().equals(name)) {
                employeeList.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee showDetail(String name) {
        for (Employee item : employeeList) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
