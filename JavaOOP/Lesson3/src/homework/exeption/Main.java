package homework.exeption;

public class Main {
    public static void main(String[] args) {
        Student[] arrayPolitics = {
                new Student("Leonid", "Kravchuk", Human.Gender.MALE, 1),
                new Student("Leonid", "Kuchma", Human.Gender.MALE, 2),
                new Student("Viktor", "Yuschenko", Human.Gender.MALE, 3),
                new Student("Oleksander", "Turchinov", Human.Gender.MALE, 4),
                new Student("Petro", "Poroshenko", Human.Gender.MALE, 5),
                new Student("Oleksander", "Zelenskii", Human.Gender.MALE, 6),
                new Student("Yulia", "Timoshenko", Human.Gender.FEMALE, 111),
                new Student("Yurii", "Lutsenko", Human.Gender.MALE, 112),
                new Student("Irina", "Farion", Human.Gender.FEMALE, 113),
                new Student("Irina", "Geraschenko", Human.Gender.FEMALE, 114),
                new Student("Viktor", "Yanukovich", Human.Gender.MALE, 666)
        };

        Group groupPolitics = new Group("politics");
        for (Student element : arrayPolitics) {
            try {
                groupPolitics.addStudent(element);
                System.out.println("Student " + element.getName() + " "
                        + element.getLastName() + " was added to group \""
                        + groupPolitics.getGroupName() + "\"");
            } catch (GroupOverflowException e) {
                //e.printStackTrace();
                System.out.println("No space in the group \""
                        + groupPolitics.getGroupName() + "\" for " + element.getName()
                        + " " + element.getLastName());
                //System.out.println(e);
            }
        }

        try {
            System.out.println("Found " + groupPolitics.searchStudentByLastName("Poroshenko").toString());
        } catch (StudentNotFoundException e) {
            System.out.println("Student no found in group \""
                    + groupPolitics.getGroupName() + "\".");
        }

        try {
            System.out.println(groupPolitics.searchStudentByLastName("Yanukovich").toString());
        } catch (StudentNotFoundException e) {
            System.out.println("Student not found in group \""
                    + groupPolitics.getGroupName() + "\".");
        }

        if (groupPolitics.removeStudentByID(111))
            System.out.println("Student was removed by id");
        else
            System.out.println("Student was not removed by id");

        if (groupPolitics.removeStudentByID(666))
            System.out.println("Student was removed by id");
        else
            System.out.println("Student was not removed by id");

        System.out.println(groupPolitics);

        try {
            groupPolitics.addStudent(new Student("Tetiana", "Chornovil", Human.Gender.FEMALE, 115));
            System.out.println("Student was added");
        } catch (GroupOverflowException e) {
            System.out.println("No space in the group");
        }
    }
}
