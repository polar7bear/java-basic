package sec4;

public class Board {
	private int num;
	private int title;
	private String content;
	private String author;
	private String resdate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content="
				+ content + ", author=" + author + ", resdate=" + resdate + "]";
	}
	
}
