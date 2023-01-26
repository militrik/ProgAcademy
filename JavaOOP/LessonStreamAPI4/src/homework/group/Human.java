package homework.group;

import java.util.Objects;

public class Human {
    private String name;
    private String lastName;
    private Gender gender;
    private Integer age;

    public Human(String name, String lastName, Gender gender, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && lastName.equals(human.lastName) && gender == human.gender && age.equals(human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender, age);
    }

    public enum Gender {
        MALE, FEMALE
    }


}


