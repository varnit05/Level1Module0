
public class Dog {
	public static void main(String[] args) {
		Dog bob = new Dog("dave", 35, "white");
		bob.numberofdogs();
		bob.name();
		bob.color();
		bob.info();
		Dog bobe = new Dog("dav", 35, "white");
		Dog bo = new Dog("davea", 35, "white");
		Dog boba = new Dog("da", 35, "white");
		Dog.numberofdogs();
	}

	private String name;
	private int age;
	private String color;
	static int numberofdogs = 0;

	// static means just one
	public Dog(String name, int age, String color) {
		// the constructor is the same as the class name without the word class
		this.age = age;
		this.color = color;
		this.name = name;
		numberofdogs++;

	}

	public static void numberofdogs() {

		System.out.println(numberofdogs);

	}

	public void name() {

		System.out.println(name);

	}

	public void color() {
		
		System.out.println(color);
		
	}

	public void info() {
		System.out.println("Hi, my name is " + name + ".I am " + age + " years old. My fur color is " + color + ".");
	}
}