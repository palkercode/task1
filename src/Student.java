import java.util.ArrayList;

public class Student extends Person {
    private static int studentID = 1;
    private int studentIDGen;

    private ArrayList<Integer> grades = new ArrayList<>();
    private float gpa;

    public Student() {
        super();
        this.studentIDGen = studentID++;
    }

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

    private void calculateGPA() {
        int gradeSum = 0;

        for (int grade : grades) {
            gradeSum += grade;
        }

        gpa = (float) gradeSum / grades.size();
    }

    @Override
    public String toString() {
        return "I am a student with ID " + studentID;
    }
}
