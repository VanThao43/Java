package GhiDePhuongThuc;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("T�i �n x��ng!");
	}

	@Override
	public void makeSound() {
		System.out.println("G�u g�u");
	}

}
