package PageObject.LessonFive;

import org.testng.annotations.Test;

public class ConstructorTest {
	@Test
	public void testG() {
		Rectangle rectangle = new Rectangle(10,12);
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
	}
}
