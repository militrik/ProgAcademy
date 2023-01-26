package homework.group;

import java.util.Objects;

public class Student extends Human {
    private int id;
    private String groupName;

    public Student(String name, String lastName, Gender gender, Integer age, int id, String groupName) {
        super(name, lastName, gender, age);
        this.id = id;
        this.groupName = groupName;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", groupName='" + groupName + '\'' + "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return id == student.id && groupName.equals(student.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, groupName);
    }

    public class StudentNotFoundException extends Throwable {
        public StudentNotFoundException(String message) {
            super(message);
        }
    }
}
