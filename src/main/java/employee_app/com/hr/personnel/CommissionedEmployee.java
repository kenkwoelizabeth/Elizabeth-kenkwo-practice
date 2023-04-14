package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class CommissionedEmployee extends Employee {
    private double commissionRate;

    private ArrayList<Double> monthlySales;


    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate, ArrayList<Double> monthlySales) {
        super(name, hireDate);
        this.commissionRate = commissionRate;
        this.monthlySales = monthlySales;
    }


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

}
