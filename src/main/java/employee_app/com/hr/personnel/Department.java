package employee_app.com.hr.personnel;

public class Department {

    // fields
    private Employee[] employees = new Employee[100];
    private String name;
    private String location;
    private int currentIndex = 0;


    // Constructor
    public Department(Employee[] employee, String name, String location) {
        this.employees = employee;
        this.name = name;
        this.location = location;
    }

    // Methods
    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {

        int numberOfEmployeesWhoWorked = 0;

        // another way to write the loop
     /*   for (int i = 0; i < numberOfEmployeesWhoWorked; i++) {
            if (employees[i].work().contains("worked")) {  // to check for only employee that worked
                numberOfEmployeesWhoWorked++;
  */
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null) {  // to check for only non-empty employee
                String worked = employees[i].work();
                if (worked.contains("worked")) {

                    numberOfEmployeesWhoWorked++;
                }
            }
        }
        return numberOfEmployeesWhoWorked;
    }

    // Compute total monthly compensation of all
// employees in that department

    public double computeDepartmentMonthlyTotalCompensation() {
        double totalCompensation = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            double monthlyCompensation = employees[i].computeMonthlyCompensation();
            totalCompensation += monthlyCompensation;
        }

        return totalCompensation;
    }

// getters and setters

    public Employee[] getEmployee() {
        return employees;
    }

    public void setEmployee(Employee[] employee) {
        this.employees = employee;
    }

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
}
