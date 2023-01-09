package homework.exeption;

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


    @Override
    public String toString() {
        sortBoubleStudent();
        String text = "";
        for (Student element : students) {
            if (element != null) {
                text += element + System.lineSeparator();
            }
        }
        return text;
    }

    private void sortBoubleStudent() {
        int sortedIndex = this.students.length;
        int numberOfSwap;
        do {
            numberOfSwap = 0;
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (this.students[i] != null) {
                    int j = i + 1;
                    for (; j < sortedIndex - 1; j++) {
                        if (this.students[j] != null) {
                            break;
                        }
                    }
                    if (j < sortedIndex) {
                        if (this.students[i].getLastName().compareTo(this.students[j].getLastName()) > 0) {
                            swapInArray(this.students, i, j);
                            numberOfSwap++;
                        }
                    }
                }
            }
        } while (numberOfSwap > 0);
    }

    private void swapInArray(Student[] arr, int a, int b) {
        Student temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                student.setGroupName(this.groupName);
                return;
            }
        }
        throw new GroupOverflowException();
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                if (lastName.equals(students[i].getLastName())) {
                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException();
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
}
