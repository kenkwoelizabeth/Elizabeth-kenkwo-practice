package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    private double monthlySalary;
    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary=monthlySalary;
    }
}
