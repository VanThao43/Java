package GhiDePhuongThuc;

public class Test {

	public static void main(String[] args) {
		System.out.println("kiểm tra: ");
		Dog d = new Dog();
		System.out.println(d.getName());
		d.eat();
		d.makeSound();
		d.sleep();

		System.out.println("-----------------------");
		Cat c = new Cat();
		System.out.println(c.getName());
		c.eat();
		c.makeSound();
		c.sleep();

		System.out.println("-----------------------");
		Bird b = new Bird();
		System.out.println(b.getName());
		b.eat();
		b.makeSound();
		b.sleep();
	}

}
