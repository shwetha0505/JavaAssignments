package week3.day1;

public class Safari extends Browser {
	

	
	public void readerMode()
	{
		
		System.out.println("Reader Mode in Safari");
	}
	
	
	public void fullScreenMode()
	{
		
		System.out.println("Safari in Full Screen Mode");
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari saf = new Safari();
		saf.OpenURL();
		saf.closeBrowser();
		saf.navigateBack();
		saf.readerMode();
		saf.fullScreenMode();
				

}

}
