import java.util.ArrayList;

public class School {
    private ArrayList<Person> members = new ArrayList<>();

    /*
     I used instanceof in getStudents and getTeachers to differentiate
     students and teachers. If there's a better way
     to implement this then plz open an issue
    */

    public ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();

        for (Person person : members) {
            if (person instanceof Student) {
                students.add((Student) person);
            }
        }

        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        ArrayList<Teacher> teachers = new ArrayList<>();

        for (Person person : members) {
            if (person instanceof Teacher) {
                teachers.add((Teacher) person);
            }
        }

        return teachers;
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        String result = "";

        for (Person member : members) {
            result += member;
        }

        return result;
    }
}
