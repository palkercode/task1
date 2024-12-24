import java.util.ArrayList;
import java.util.Collections;

public class School {
    private ArrayList<Person> members = new ArrayList<>();

    public ArrayList<Person> getMembers() {
        return members;
    }

    public void addMember(Person person) {
        members.add(person);
    }

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

    public void sortMembersBySurname() {
        for (int i = 0; i < members.size() - 1; i++) {
            for (int j = 0; j < members.size() - i - 1; j++) {
                if (members.get(j).getSurname().charAt(0) > members.get(j+1).getSurname().charAt(0)) {
                    Collections.swap(members, j, j+1);
                }
            }
        }
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
