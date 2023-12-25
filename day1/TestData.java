package week3.day1;

public class TestData {
	
	public void enterCredentials()
	{
		System.out.println("Enter the Username & Password:");
		
	}
public	 void navigateToHomePage() {
	
	System.out.println("Welcome to Homepage-->TestData");
}

	public static void main(String[] args) {
		
		TestData td=new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
		

	}

}
