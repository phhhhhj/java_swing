package manager;

public class TopDTO {
	int no; // 일련번호
	String catego; // 카테고리 : 티셔츠, 셔츠, 스웨터, 후드티
	String model; // 상품명
	String brand; // 판매자
	String size; // 사이즈 ex) s, m, l
	String len; // 전체 기장(사이즈별 콤마 구분)
	String width; // 어깨 너비(사이즈별 콤마 구분)
	String chest; // 가슴 둘레(사이즈별 콤마 구분)
	String armlen; // 팔 길이(사이즈별 콤마 구분)
	String armcircle; // 팔 둘레(사이즈별 콤마 구분)

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

	public String getLen() {
		return len;
	}

	public void setLen(String len) {
		this.len = len;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}

	public String getArmlen() {
		return armlen;
	}

	public void setArmlen(String armlen) {
		this.armlen = armlen;
	}

	public String getArmcircle() {
		return armcircle;
	}

	public void setArmcircle(String armcircle) {
		this.armcircle = armcircle;
	}

	@Override
	public String toString() {
		return "TopDTO [no=" + no + ", catego=" + catego + ", model=" + model + ", brand=" + brand + ", size=" + size
				+ ", len=" + len + ", width=" + width + ", chest=" + chest + ", armlen=" + armlen + ", armcircle="
				+ armcircle + "]";
	}
}
