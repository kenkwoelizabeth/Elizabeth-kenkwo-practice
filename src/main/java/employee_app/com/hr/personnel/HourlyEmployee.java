package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // fields
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    // constructors
    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }


    // methods
    @Override
    public double computeMonthlyCompensation() {

        return hourlyRate * hoursWorkedPerMonth;

    }

    @Override
    public String getEmployeeInfo() {
        // best practice is to create a name attach the statement in that name and return the name.
        return super.getName() + " was hired on " + super.getHireDate()
                + " with an hourly rate of $" + hourlyRate + " and so far have worked for "
                + hoursWorkedPerMonth + " every month";
    }

    // setters and getters
    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
