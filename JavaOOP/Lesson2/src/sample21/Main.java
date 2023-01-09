package sample21;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee employee1 = new Employee("Oleksander", "Ts", 1, "Sci dev");
        Developer developer1 = new Developer("Ol", "Ts", 2, "Dev", "Java");

        Student student1 = new Student("Ol", "Tr", 100);
        System.out.println(employee1.getName());
        System.out.println(employee1.hashCode());
        System.out.println(employee1);

        Person person1 = employee1;

        System.out.println(person1);

        if (person1.getClass().equals(Employee.class)) {

            employee1 = (Employee) person1;
            System.out.println("It is emploeyy");
        } else {
            System.out.println("Oooppss");
        }
    }

}
