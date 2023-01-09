package sample21;

public class Developer extends Employee {
    private String stack;

    public Developer(String name, String lastName, int id, String department, String stack) {
        super(name, lastName, id, department);
        this.stack = stack;
    }

}
