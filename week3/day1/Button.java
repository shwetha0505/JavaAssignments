package week3.day1;

public class Button extends WebElement{
	
	
	public void submit() {
		System.out.println("Click Submit ");
		
	}
	public static void main(String[] args) {
		
		Button b=new Button();
		b.click();
		b.setText("Click button");
		b.submit();
	}

}
