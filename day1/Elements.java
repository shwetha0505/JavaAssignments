package week3.day1;

public class Elements {

	
	public static void main(String[] args) {
		Button bt = new Button();
		bt.click();
		bt.setText("Click Button-->Element Class");
		
		
		 WebElement we = new CheckBoxButton();
		 we.setText("CheckBox-->Element");
		 
		 WebElement we1 = new RadioButton();
		 we1.setText("RadioButton-->Element");
		
		 Button bt1=new CheckBoxButton();
		
		 RadioButton rb1=new RadioButton();
		 rb1.selectRadioButton();
		 bt1.submit();
		 
	
		 
	}
	
	
	
}
