package employee_app.com.hr.personnel;

public class Department {
    private Employee[] employees=new Employee[100];
    private String name;
    private String location;
    private int currentIndex = 0;

    public Department(Employee[] employee, String name, String location) {
        this.employees = employee;
        this.name = name;
        this.location = location;
    }


   public void addEmployee(Employee employee){
     this.employees[currentIndex++] =employee;



   }
   public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){

       int numberOfEmployeesWhoWorked = 0;
       for (int i = 0; i < employees.length; i++) {

           if (employees[i] != null) {
               String worked = employees[i].work();
               if (worked.contains("worked")) {

                   numberOfEmployeesWhoWorked++;
               }
           }
       }
       return numberOfEmployeesWhoWorked;
   }



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
