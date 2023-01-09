package homework.streamIO;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudens() {
        return students;
    }

    public void setStudens(Student[] studens) {
        this.students = studens;
    }

    public void sortStudentsByLastName() {
        Arrays.sort(students, Comparator.nullsFirst(new SortStudentsByLastName()));
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

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                student.setGroupName(this.groupName);
                System.out.println("Student added successful");
                return;
            }
        }
        throw new GroupOverflowException("Group is full");
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getLastName().equals(lastName)) {
                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException("Student not found");
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (id == students[i].getId()) {
                    students[i] = null;
                    return true;
                }
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
