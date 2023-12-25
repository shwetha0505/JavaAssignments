package week3.day1;

public class Polymorphism {
	
	public void reportStep(String msg, String status)
	{
	
		System.out.println( "This program is:"+msg+status);
	}

	
	public void reportStep(String msg, String status, boolean snap)
	{
	
		System.out.println( "Take a snap shot:"+msg+" "+status+" ,"+snap);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism poly = new Polymorphism();
				poly.reportStep("Poly","morphism");
				poly.reportStep("Snapshot","is taken",true);

	}

}
