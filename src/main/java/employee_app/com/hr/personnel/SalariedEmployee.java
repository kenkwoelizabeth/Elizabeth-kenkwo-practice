package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    // field
    private double monthlySalary;

    // constructors
    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double computeMonthlyCompensation() {

        return monthlySalary;

    }

    @Override
    public String getEmployeeInfo() {
        // best practice is to create a name attach the statement in that name and return the name.
        return super.getName() + " was hired on " + super.getHireDate()
                + " with a monthly salary of $" + monthlySalary;
    }


    // setters and getters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


}
