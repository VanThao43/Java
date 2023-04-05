package GhiDePhuongThuc;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("Tôi ãn xýõng!");
	}

	@Override
	public void makeSound() {
		System.out.println("Gâu gâu");
	}

}
