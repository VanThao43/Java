package generic_ep_kieu_du_lieu;

public class box<T> {
	private T value;

	public box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
