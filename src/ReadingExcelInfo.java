import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadingExcelInfo {

	public static void main(String[] args) throws IOException {
	
		
		FileInputStream exof = new FileInputStream("C:\\Users\\shobon\\Desktop\\Testdata.xls");
		HSSFWorkbook wbos = new HSSFWorkbook(exof);
		HSSFSheet wsos = wbos.getSheetAt(0);
		
		System.out.println(wsos.getRow(0).getCell(0).getStringCellValue());
		System.out.println(wsos.getRow(0).getCell(1).getStringCellValue());
		System.out.println(wsos.getRow(1).getCell(0).getStringCellValue());
		System.out.println(wsos.getRow(2).getCell(0).getStringCellValue());
		System.out.println(wsos.getRow(2).getCell(1).getStringCellValue());
	}

}
