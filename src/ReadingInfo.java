import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadingInfo {

	public static void main(String[] args) throws IOException {
	
		
		FileInputStream exo = new FileInputStream("‪‪C:\\Users\\shobon\\Desktop\\Month.xls");
		
		HSSFWorkbook wbo = new HSSFWorkbook(exo);
	HSSFSheet wso=wbo.getSheet("sheet1");
		
		Row r; 
		for(int i=0;i<5;i++) {
			
			r=wso.createRow(i);
			r.createCell(5).setCellValue("Selenium");
		}
		FileOutputStream data = new FileOutputStream("‪C:\\Users\\shobon\\Desktop\\Month.xls");
		wbo.write(data);
	}
	
}

