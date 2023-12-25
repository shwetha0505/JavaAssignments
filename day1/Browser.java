package week3.day1;

public class Browser {

	
	String browserName;
	int browserversion;
	
	public void OpenURL()
	{
		
		System.out.println("Open URL");
	}
	
	public void closeBrowser()
	{
		
		System.out.println("CloseBrowser");
	}
	
	public void navigateBack()
	{
		
		System.out.println("Navigateback");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser brow = new Browser();
		brow.OpenURL();
		brow.closeBrowser();
		brow.navigateBack();
				
		 

	}

}
