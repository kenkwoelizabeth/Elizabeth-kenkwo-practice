package employee_app.com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Department {


    // fields
    private List<Employee> employees = new ArrayList<>();
    private String name;
    private String location;
    private int currentIndex = 0;


    // Constructor

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Methods
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {

        int numberOfEmployeesWhoWorked = 0;

        // another way to write the loop
        for (Employee employee : employees) {
            if (employee.work().equals("worked")) {  // to check for only employee that worked
                numberOfEmployeesWhoWorked++;
            }

        }
        return numberOfEmployeesWhoWorked;
    }

    // Compute total monthly compensation of all
// employees in that department

    public double computeDepartmentMonthlyTotalCompensation() {
        double totalCompensation = 0.0;
        for (Employee employee : employees) {
            totalCompensation += employee.computeMonthlyCompensation();
        }

        return totalCompensation;
    }

// getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
