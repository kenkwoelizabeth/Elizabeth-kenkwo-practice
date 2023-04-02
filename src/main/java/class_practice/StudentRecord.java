package class_practice;

public class StudentRecord {

    // Declaring my variables
    private String name;
    private double mathScore;
    private double scienceScore;
    private double algebraScore;
    private static int studentCount;

    // Creating a record to get the count
    public StudentRecord(){
        studentCount++;
    }

// Getters and setters for my declared variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(double scienceScore) {
        this.scienceScore = scienceScore;
    }

    public double getAlgebraScore() {
        return algebraScore;
    }

    public void setAlgebraScore(double algebraScore) {
        this.algebraScore = algebraScore;
    }
// getters for student count
    public static int getStudentCount() {
        return studentCount;
    }
    // creating a method to calculate the average
    public double getAverageScore() {

        return (getMathScore()+getScienceScore()+getAlgebraScore())/3;
    }


    // overloaded method

    public void print(String name){
        System.out.println("Student name is : " + getName());
    }

    public void print(String mathScore, double averageScore){
        System.out.printf(getName() + " has an average score of %.2f\n" , getAverageScore());

    }


}


