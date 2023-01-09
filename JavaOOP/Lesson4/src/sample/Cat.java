package sample;

public class Cat implements GetDateToTextFile{
	private String name;
	private String color;
	private int age;

	public Cat(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	@Override
	public String textRepresentation() {
		return name + ";" + color + ";" + age;
	}
}
