package utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataProvider {

	public static void main(String args[]) throws IOException {
		FileInputStream fis=new FileInputStream ("./Excel/demo.xls");
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet=workbook.getSheetAt(0);
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		String data1=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
	}
}
