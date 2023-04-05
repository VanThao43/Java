package Interface;

public class SapXepChen implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		double key;
		for (int i = 0; i < n; i++) {
			key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		double key;
		for (int i = 0; i < n; i++) {
			key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

}
