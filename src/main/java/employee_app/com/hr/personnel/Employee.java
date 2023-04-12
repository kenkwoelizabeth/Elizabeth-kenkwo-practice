package employee_app.com.hr.personnel;

import java.time.LocalDate;


public class Employee {
    // fields

    private String name;
    private LocalDate hireDate;


    // constructors
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }


    // methods
    public String getEmployeeInfo() {

        return "Name = " + name + ", HireDate = " + hireDate;
    }

    public String work() {
        return name + " worked";
    }

    public int computeNumberOfYearsWorkedSinceHired() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }

    public double computeMonthlyCompensation() {

        return 0.0;
    }


    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }


}
