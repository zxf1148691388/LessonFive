package PageObject.LessonFive;

public class Rectangle{
	private int width;
	private int length;
	private int code;
	public Rectangle(int width,int length) {
		this.width = width;
		this.length = length;
	}
	
	
	public Rectangle(int width,int length,int code) {
	
		this.width = width;
		this.length = length;
		this.code = code;
	}
	
	
	public int area() {
		int a = width*length;
		return a;
	}
	public int perimeter() {
		int p = 2*(width+length);
		return p;
	}
}
