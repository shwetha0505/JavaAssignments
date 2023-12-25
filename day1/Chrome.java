package week3.day1;

public class Chrome extends Browser{

	
	
	public void openIncognito()
	{
		
		System.out.println("Open in Incognito Mode in Chrome");
	}
	
	
	public void clearCache()
	{
		
		System.out.println("Clear cache in Chrome");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome chrom = new Chrome();
		chrom.OpenURL();
		chrom.closeBrowser();
		chrom.navigateBack();
		chrom.openIncognito();
		chrom.clearCache();
				
		 

	}
	
}
