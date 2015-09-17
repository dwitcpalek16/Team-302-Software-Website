public class test {
	public static void main(String[] args) {

		System.out.println("Hello, world");

		Dog fred = new Dog("fred");
		System.out.println(fred.getName());
	}
}

public class Dog {

private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}