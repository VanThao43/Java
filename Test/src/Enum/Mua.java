package Enum;

public enum Mua {
	Xuan(3),
	Ha(4),
	Thu(5),
	Dong(6);
	
	private final int quy;

	private Mua(int quy) {
		this.quy = quy;
	}

	public int getQuy() {
		return quy;
	}
	
	
}
