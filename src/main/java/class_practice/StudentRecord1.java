package class_practice;

public class StudentRecord1 {

    String name;
    double mathScore;
    double scienceScore;
    double algebraScore;

    // Constructor  (must have the same name with the class)
    public StudentRecord1(String name) {
        this.name = name;
    }

    public StudentRecord1(String name, double mathScore) {

        this.name = name;
        this.mathScore = mathScore;
    }

    public StudentRecord1(String name, double mathScore, double scienceScore,
                          double algebraScore) {
        this.name = name;
        this.scienceScore = scienceScore;
        this.algebraScore = algebraScore;

    }

    void AverageScore() {
        double average = (this.algebraScore + this.mathScore + this.scienceScore) / 3;
        System.out.printf(this.name + " has an average score of %.2f\n", average);
    }
}
