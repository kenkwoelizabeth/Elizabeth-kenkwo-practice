package employee_app.com.hr.personnel;

import java.time.LocalDate;


public class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo(){

        return "Name = " + name + ", HireDate = " + hireDate;
    }
    public String work(){
        return name + " worked";
    }


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






    public int computeNumberOfYearsWorkedSinceHired() {
        return  LocalDate.now().getYear()- hireDate.getYear();
    }


}
