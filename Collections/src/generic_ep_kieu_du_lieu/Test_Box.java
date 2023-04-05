package generic_ep_kieu_du_lieu;

public class Test_Box {

	public static void main(String[] args) {
		box<Integer> b1 = new box<Integer>(15);
		box<String> b2 = new box<String>("Xin chào!");
		box<Double> b3 = new box<Double>(3.03);

		System.out.println("Giá trị: " + b1.getValue());
		System.out.println("Giá trị: " + b2.getValue());
		System.out.println("Giá trị: " + b3.getValue());

	}

}
