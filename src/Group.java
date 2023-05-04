import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {

    private Student head = new Student(1, "Head name", "Head Surname");

    ArrayList<Student> students = new ArrayList<Student>();

    ArrayList<String> tasks = new ArrayList<>();

    public void setHead(int ID, String name, String surname) {
        this.head = new Student(ID, name, surname);
        System.out.println(this.head);
    }

    public void addStudent(int ID, String name, String surname) {
        Student student = new Student(ID, name, surname);
        students.add(student);
        System.out.println(Arrays.toString(students.toArray()));
    }

    public void removeStudent(int ID, String name, String surname) {
        Student student = new Student(ID, name, surname);
        students.remove(student);
        System.out.println(Arrays.toString(students.toArray()));
    }

    public void renameStudent(int ID, String name, String surname) {

        Student student = new Student(ID, name, surname);
        student.setFirstName(name);
        student.setLastName(surname);
        System.out.println(Arrays.toString(students.toArray()));

    }

    public void addTask(String task) {
        tasks.add(task);
    }

}
