package week3.day1;

public class TextField extends WebElement{
	
	
	public void getText() {
	System.out.println("Please provide the text to be displayed");	
	}
	public static void main(String[] args) {
		TextField tf=new TextField();
		tf.click();
		tf.setText("Enter the Text");
		tf.getText();
	}

}
