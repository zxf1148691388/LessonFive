package PageObject.LessonFive;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	@DataProvider(name = "loginusr")
	public Object[][] data1(){
		return new Object[][] {
			{"usr1","pwd1"},{"usr2","pwd2"}
		};
	}
	@Test(dataProvider = "loginusr")
	public void TestDemo1(String usr,String pwd){
		System.out.println(usr);
		System.out.println(pwd);
		
	}
}
