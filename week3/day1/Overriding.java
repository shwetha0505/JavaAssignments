package week3.day1;

public class Overriding extends Polymorphism{
	
	
	public void reportStep()	{
		
			System.out.println("The result is:");
		}

		public static void main(String[] args)
		{
			Overriding over=new Overriding();
			Polymorphism pm=new Polymorphism();
			over.reportStep();
			pm.reportStep("Method","Overriding", true);
			
							}

	}


