package employee_app.com.hr.personnel;

import java.time.LocalDate;


public abstract class Employee {
    // fields

    private String name;
    private LocalDate hireDate;


    // constructors
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }


    // methods
    public abstract String getEmployeeInfo();

    public String work() {
        return name + " worked";
    }

    public int computeNumberOfYearsWorkedSinceHired() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }

    public abstract double computeMonthlyCompensation();


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
