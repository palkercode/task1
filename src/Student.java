import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private static int studentIDGen = 1;

    private ArrayList<Integer> grades = new ArrayList<>();
    private float gpa;

    public Student() {
        super();
        this.studentID = studentIDGen++;
    }

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades, float gpa) {
        super(name, surname, age, gender);
        this.grades = grades;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void addGrade(int grade) {
        grades.add(grade);
        calculateGPA();
    }

    private void calculateGPA() {
        // idk how to calculate gpa so i just take the average value of all grades

        float gradeSum = 0;

        for (int grade : grades) {
            gradeSum += grade;
        }

        gpa = gradeSum / grades.size();
    }

    public float getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "I am a student with ID " + studentID + "\n";
    }
}
