package GhiDePhuongThuc;

public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}

	@Override
	public void eat() {
		System.out.println("T�i �n c�!");
	}

	@Override
	public void makeSound() {
		System.out.println("meow meow");
	}

}
