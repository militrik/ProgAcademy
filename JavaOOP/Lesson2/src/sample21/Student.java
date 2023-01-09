package sample21;


public class Student extends Person {
    private int id;

    public Student(String name, String lastName, int id) {
        super(name, lastName);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }

}