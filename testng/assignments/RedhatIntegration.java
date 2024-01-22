package testng.assignments;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RedhatIntegration {
public static String[][] readData(String exfileName) throws IOException {
	XSSFWorkbook wb = new XSSFWorkbook("./data/" +exfileName+ ".xlsx");
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowsize=sheet.getLastRowNum();
	int cellsize=sheet.getRow(0).getLastCellNum();
	System.out.println("Total no:of rows: "+rowsize);
	System.out.println("Total no:of columns: "+cellsize);
	String[][] data=new String[rowsize][cellsize];
	
	for (int i = 1; i <= rowsize; i++) {
		
	XSSFRow row = sheet.getRow(i);		
	for (int j = 0; j < cellsize; j++) {
		XSSFCell cell = row.getCell(j);
		String readData = cell.getStringCellValue();
		data[i-1][j]=readData;
	}
	}
	
	
wb.close();
return data;
	
}

}





