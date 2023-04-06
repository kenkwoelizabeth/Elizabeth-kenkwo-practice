package class_practice;

public class Main {

    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Kalisha");
        student1.setMathScore(5.8);
        student1.setScienceScore(6.9);
        student1.setAlgebraScore(7.3);
        StudentRecord student2 = new StudentRecord();
        student2.setName("Kris");
        student2.setMathScore(2.1);
        student2.setScienceScore(4.0);
        student1.setAlgebraScore(8.7);


        int numberOfStudents1 = student1.getStudentCount();
        System.out.println("There are " + numberOfStudents1 + " students");
        System.out.printf(student1.getName() + " has an average score of %.2f\n", student1.getAverageScore());
        System.out.printf(student2.getName() + " has an average score of %.2f\n", student2.getAverageScore());


        // getting the overloaded method
        // first student
        student1.print(student1.getName());
        student1.print(student1.getName(), student1.getAverageScore());

        //second student
        student2.print(student2.getName());
        student2.print(student2.getName(), student2.getAverageScore());


        // constructor output
        StudentRecord1 student3 = new StudentRecord1("Kalisha", 5.8, 6.9, 7.3);
        StudentRecord1 student4 = new StudentRecord1("Kris", 2.1, 4.0, 8.7);
        student3.AverageScore();
        student4.AverageScore();

    }
}

