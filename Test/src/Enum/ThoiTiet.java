package Enum;

public class ThoiTiet {
	private Mua mua;
	private String nhietDo;

	public ThoiTiet(Mua mua, String nhietDo) {
		this.mua = mua;
		this.nhietDo = nhietDo;
	}

	public Mua getMua() {
		return mua;
	}

	public void setMua(Mua mua) {
		this.mua = mua;
	}

	public String getNhietDo() {
		return nhietDo;
	}

	public void setNhietDo(String nhietDo) {
		this.nhietDo = nhietDo;
	}

	@Override
	public String toString() {
		return "ThoiTiet [mua=" + mua + ", nhietDo=" + nhietDo + "]";
	}
	
}
