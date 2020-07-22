package manager;

public class BottomDTO {
	int no; // 일련번호
	String catego; // 카테고리: 면바지, 청바지, 트레이닝바지, 반바지
	String model; // 상품명
	String brand; // 판매자
	String size; // 사이즈 ex) 28, 30, 32
	String waist; // 허리 둘레(사이즈별 콤마 구분)
	String len; // 전체 기장(사이즈별 콤마 구분)
	String thigh; // 허벅지 둘레(사이즈별 콤마 구분)

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCatego() {
		return catego;
	}

	public void setCatego(String catego) {
		this.catego = catego;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWaist() {
		return waist;
	}

	public void setWaist(String waist) {
		this.waist = waist;
	}

	public String getLen() {
		return len;
	}

	public void setLen(String len) {
		this.len = len;
	}

	public String getThigh() {
		return thigh;
	}

	public void setThigh(String thigh) {
		this.thigh = thigh;
	}

	@Override
	public String toString() {
		return "BottomDTO [no=" + no + ", catego=" + catego + ", model=" + model + ", brand=" + brand + ", size=" + size
				+ ", waist=" + waist + ", len=" + len + ", thigh=" + thigh + "]";
	}
}
