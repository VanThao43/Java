package Interface;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		MayTinhBoTuiInterface mfx = new MayTinhCasioFX500();
		MayTinhBoTuiInterface mvn = new MayTinhVinacal500();
		
		System.out.println("5 + 3 = "+mfx.cong(5, 3));
		System.out.println("4 x 3 = "+mvn.nhan(4, 3));
		System.out.println("4 / 0 = "+mvn.chia(4, 0));
		
		System.out.println("--------------------------------");
		System.out.println("Test câu b: ");
		double []arr1 = new double[] {5,8,1,4,7,2,9,3};
		double arr2[] = new double[] {6,10,3, 5, 2, 9, 15};
		SapXepChen sxchen = new SapXepChen();
		sxchen.sapXepTang(arr1);
		SapXepChon sxchon = new SapXepChon();
		sxchon.sapXepGiam(arr2);
		
		System.out.print("Mảng thứ nhất sau khi sắp xếp: ");
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.print("\nMảng thứ hai sau khi sắp xếp: ");
		for (int i=0; i<arr2.length; i++) {
			System.out.printf(arr2[i]+"\t");
		}
		
		System.out.println("\n-------------------------------");
		System.out.println("Test câu c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println("3 + 3 = "+pmmt.cong(3, 3));
		pmmt.sapXepGiam(arr2);
		System.out.print("Mảng 2 sau khi được sắp xếp là: ");
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"  ");
		}
	}

}
