package employee_app.com.hr.personnel;

import java.sql.SQLOutput;
import java.time.LocalDate;

// main methods of the projects
public class HRClient {
    public static void main(String arg[]) {

        // Object for employee
        Employee employee1 = new Employee("Mike", LocalDate.of(2020, 02, 03));

        Employee employee2 = new Employee("Lizzy", LocalDate.of(2023, 05, 06));
        System.out.println(employee1.getEmployeeInfo());
        System.out.println(employee2.getEmployeeInfo());
        System.out.println("The difference between the current year and the employee " + employee1.getName() + " hired year is: "
                + employee1.computeNumberOfYearsWorkedSinceHired());
        System.out.println("The difference between the current year and the employee " + employee2.getName() + " hired year is: "
                + employee2.computeNumberOfYearsWorkedSinceHired());


          // object for 2 salaried employee and one hourly employee
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Mike", LocalDate.of(2020,
                02, 03), 5000.0);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Lizzy", LocalDate.of(2023,
                05, 06), 5500.0);



        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike", LocalDate.of(2020, 02, 03),
                70, 35.0);


        Department department = new Department(new Employee[]{salariedEmployee1, salariedEmployee2, hourlyEmployee},
                "Accounting", "Georgia");

        department.addEmployee(salariedEmployee1);
        department.addEmployee(salariedEmployee2);
        department.addEmployee(hourlyEmployee);

        System.out.println("We have " + department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() +
                " employee that have worked in the " + department.getName() + " department " + " at our " + department.getLocation() + " Location");

    }
}
