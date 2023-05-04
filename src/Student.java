public class Student {

    private int ID;
    private String name;
    private String surname;

    public int getId(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Student(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

}
