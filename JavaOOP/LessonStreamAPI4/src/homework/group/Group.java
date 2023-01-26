package homework.group;


import java.util.Iterator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Group {
    private String groupName;
    private SortedSet<Student> students = new TreeSet<>(new SortStudentsByLastName());

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public Group() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SortedSet<Student> getStudens() {
        return students;
    }

    public void setStudents(SortedSet<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String text = "";
        for (Student element : students) {
            if (element != null) {
                text += element + System.lineSeparator();
            }
        }
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupName.equals(group.groupName) && students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, students);
    }

    public void addStudent(Student student) throws GroupOverflowException {
        if (students.size() >= 10) {
            throw new GroupOverflowException("Group is full");
        }
        student.setGroupName(this.groupName);
        students.add(student);
        System.out.println("Student added successful");
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (Iterator<Student> studentIterator = students.iterator(); studentIterator.hasNext(); ) {
            Student next = studentIterator.next();
            if (next.getLastName().equals(lastName))
                return next;
        }
        throw new StudentNotFoundException("Student not found");
    }

    public boolean removeStudentByID(int id) {
        for (Iterator<Student> studentIterator = students.iterator(); studentIterator.hasNext(); ) {
            Student next = studentIterator.next();
            if (next.getId() == id) {
                studentIterator.remove();
                return true;
            }
        }
        return false;
    }

    public class GroupOverflowException extends Exception {

        public GroupOverflowException(String message) {
            super(message);
        }
    }

    public class StudentNotFoundException extends Exception {
        public StudentNotFoundException(String message) {
            super(message);
        }
    }
}
