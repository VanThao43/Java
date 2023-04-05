package Bai1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		May may1 = new May("Asus", "Rog Strix g15", "Mới");
		QuanLy quanLy1 = new QuanLy("HNVN2203", "Trần Hải Nam");
		PhongMay phongMay1 = new PhongMay("pt4456", "Phong 12", 1055.32, quanLy1, may1);
		
		System.out.println(phongMay1);
	}

}
