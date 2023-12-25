package week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername(String uname) {
		System.out.println("Enter Username:"+uname);
	}

	public void enterPassword(String pword) {
		
		System.out.println("Enter Password:"+pword);
	}
	
	public static void main(String[] args) {

LoginTestData ltd=new LoginTestData();
ltd.enterCredentials();
ltd.enterUsername("TestLeaf");
ltd.enterPassword("Welcome@123");
ltd.navigateToHomePage();

	}

}
