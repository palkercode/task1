import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private int studentIDGen;

    private ArrayList<Integer> grades;
    private float gpa;

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades) {
        super(name, surname, age, gender);
        this.grades = grades;
    }

    public int getStudentID() {
        return studentID;
    }

    public void addGrade(int grade) {
        grades.add(grade);
        calculateGPA();
    }

    public void calculateGPA() {
        
    }
}
