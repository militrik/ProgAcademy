package homework.catcompareto;

import java.util.Comparator;
import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Cat o) {
        if (o == null) {
            throw new NullPointerException();
        }
            Comparator<Cat> nameLengthCmp = Comparator.comparing(cat -> cat.getName().length());
            Comparator<Cat> nameCmp = Comparator.comparing(Cat::getName);
            Comparator<Cat> ageComp = Comparator.comparing(Cat::getAge);;
            Comparator<Cat> result =  nameLengthCmp.thenComparing(ageComp).thenComparing(nameCmp);
            return result.compare(this,o);

    }
}