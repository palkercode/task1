import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        Scanner scanner = new Scanner(new File("C:\\Users\\Eshkere\\IdeaProjects\\untitled1\\students.txt"));

        while (scanner.hasNextLine()) {
            Student student = new Student();

            student.setName(scanner.next());
            student.setSurname(scanner.next());
            student.setAge(Integer.parseInt(scanner.next()));
            student.setGender(scanner.next() == "Male");

            while(scanner.next().equals("\n")) {
                student.addGrade(Integer.parseInt(scanner.next()));
            }

            school.addMember(student);
        }

        scanner = new Scanner(new File("C:\\Users\\Eshkere\\IdeaProject\\untitled1\\teachers.txt"));

        while (scanner.hasNextLine()) {
            Teacher teacher = new Teacher();

            teacher.setName(scanner.next());
            teacher.setSurname(scanner.next());
            teacher.setAge(Integer.parseInt(scanner.next()));
            teacher.setGender(scanner.next() == "Male");
            teacher.setSubject(scanner.next());
            teacher.setYearsOfExperience(Integer.parseInt(scanner.next()));
            teacher.setSalary(Integer.parseInt(scanner.next()));

            school.addMember(teacher);
        }

        System.out.println(school);
    }
}
