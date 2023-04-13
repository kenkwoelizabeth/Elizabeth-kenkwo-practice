package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private double[] monthlySales;

    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate, double[] monthlySales) {
        super(name, hireDate);
        this.commissionRate = commissionRate;
        this.monthlySales = monthlySales;
    }

    ;


    // method to get the monthly compensation

    @Override
    public String getEmployeeInfo() {
        return null;
    }

    public double computeMonthlyCompensation() {
        double result = 0.0;
        for (double sale : monthlySales) {
            result += sale;
        }
        return commissionRate * result;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double[] getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double[] monthlySales) {
        this.monthlySales = monthlySales;
    }
}
