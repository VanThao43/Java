package jse;

public class exfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, total;
		for (num = 1; num <= 5; num++) {
			System.out.println("Num = " + num);}
		for (num = 0; num <= 100; num += 10) {
			System.out.println("Num = " + num);}
		for (num = 1, total = 0; num <= 10; total += num, ++num){
			System.out.println("Num = "+num+", total = "+total);}
//		for (num = 10; num != 0; num -= 3) {
//		System.out.println("Num = "+ num);}

	}

}
