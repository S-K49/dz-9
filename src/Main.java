import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        group.setHead(2,"Head name 2", "Head surname 2");

        group.addStudent(123,"Name 1","Surname 1");
        group.addStudent(222,"Name 2","Surname 2");

        group.removeStudent(123, "Name 1", "Surname 1");

        if(group.students.contains(123)){
            group.renameStudent(11, "name 4", "surname 4");
        }

        group.addTask("Task for all");

        group.markTaskAsDone();
    }

}
