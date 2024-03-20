package excle_read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excle {
static FileInputStream f;
static XSSFWorkbook w;
static XSSFSheet s;

	public static String getStringData(int a ,int b) throws IOException
	{
		f = new FileInputStream("C:\\Users\\bijuv\\OneDrive\\Desktop\\corejava\\14-11-23java\\Book1.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("sheet1");
		Row r = s.getRow(a);
		Cell c = r.getCell(b);
		return c.getStringCellValue();
		}
	public static String geIntegerData(int a,int b) throws IOException
	{
		f = new FileInputStream("C:\\Users\\bijuv\\OneDrive\\Desktop\\corejava\\14-11-23java\\Book1.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("sheet1");
		Row r = s.getRow(a);
		Cell c = r.getCell(b);
		int x = (int) c.getNumericCellValue();
		return String.valueOf(x);
	}
}