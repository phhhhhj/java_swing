package login;

public class NoticeDTO {
	int no;
	String type;
	String title;
	String writter;
	String day;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "bbs_DTO [no=" + no + ", type=" + type + ", title=" + title + ", write=" + writter + ", day=" + day + "]";
	}
	
	
	
}
