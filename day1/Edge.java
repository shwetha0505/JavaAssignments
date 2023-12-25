package week3.day1;

public class Edge extends Browser{
	
	
	public void takeSnap()
	{
		
		System.out.println("Take Snap in Edge");
	}
	
	
	public void clearCookies()
	{
		
		System.out.println("Clear Cookies in Edge");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge edg = new Edge();
		edg.OpenURL();
		edg.takeSnap();
		edg.clearCookies();
		edg.closeBrowser();
		edg.navigateBack();
		
				

}
}
