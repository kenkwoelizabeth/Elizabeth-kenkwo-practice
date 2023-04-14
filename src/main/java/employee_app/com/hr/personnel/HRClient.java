package employee_app.com.hr.personnel;


import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Arrays;

// main methods of the projects
public class HRClient {
    public static void main(String arg[]) {

        // Object for first employee and calling business method
        //  Employee employee1 = new Employee("Mike", LocalDate.of(2020, 02, 03));
        // System.out.println(employee1.getEmployeeInfo());
        // System.out.println(employee1.work());

        // Object for second employee and calling business method
        //   Employee employee2 = new Employee("Lizzy", LocalDate.of(2023, 05, 06));
        //   System.out.println(employee2.getEmployeeInfo() + " and " + employee2.work());


        // To get the difference between the current year and first employee hired year
        //  System.out.println("The difference between the current year and the employee " + employee1.getName() + " hired year is: "
        //       + employee1.computeNumberOfYearsWorkedSinceHired());

        // To get the difference between the current year and first employee hired year
        // System.out.println("The difference between the current year and the employee " + employee2.getName() + " hired year is: "
        //        + employee2.computeNumberOfYearsWorkedSinceHired());


        // object for first salaried employee and one hourly employee
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Mike", LocalDate.of(2020,
                02, 03), 5000.0);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Lizzy", LocalDate.of(2023,
                05, 06), 5500.0);

        // object for our hourly employee
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike", LocalDate.of(2020, 02, 03),
                70, 35.0);


        Department department = new Department("Accounting", "Georgia");

        department.addEmployee(salariedEmployee1);
        department.addEmployee(salariedEmployee2);
        department.addEmployee(hourlyEmployee);

        System.out.println("We have " + department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() +
                " employee that have worked in the " + department.getName() + " department " + " at our "
                + department.getLocation() + " Location" + " and their total monthly compensation is "
                + "$" + department.computeDepartmentMonthlyTotalCompensation());


        // To get monthly Employee Compensation
        CommissionedEmployee employee3 = new CommissionedEmployee("Mike", LocalDate.of(2020, 02, 03),
                55.2, new ArrayList<>(Arrays.asList(25.0, 74.0)));
        System.out.println("The monthly compensation of " + employee3.getName() + "'s commission is "
                + "$" + employee3.computeMonthlyCompensation());


        // To the abstract result for customer information of Salaried Employee
        System.out.println(salariedEmployee2.getEmployeeInfo());

        // To the abstract result for customer information of hourly Employee
        System.out.println(hourlyEmployee.getEmployeeInfo());


    }
}
