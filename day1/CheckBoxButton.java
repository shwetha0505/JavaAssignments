package week3.day1;

public class CheckBoxButton extends Button{
	
	
	public void clickCheckButton() {
		System.out.println("Click the check box");
	}
	public static void main(String[] args) {
		CheckBoxButton cbb=new CheckBoxButton();
		cbb.click();
		cbb.setText("CheckBox");
		cbb.submit();
		cbb.clickCheckButton();
	}

}
