package GhiDePhuongThuc;

public class Bird extends Animal {
	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("Tôi ăn ngũ cốc!");
	}

	@Override
	public void makeSound() {
		System.out.println("líu lo");
	}

}
