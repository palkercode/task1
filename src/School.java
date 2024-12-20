import java.util.ArrayList;

public class School {
    private ArrayList<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        String result = "";

        for (Person member : members) {
            result += member.toString();
        }

        return result;
    }
}
