import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_Excel {
public static void main(String []args) throws IOException
{
	
	m1();
}

public static void m1() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Pranab Roy\\Desktop\\data.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	XSSFCell cell;
	int rowNum=ws.getLastRowNum();
	
	
	for(int i=0;i<rowNum;i++)
	{
		int colNum=ws.getRow(i).getLastCellNum();
		for(int j=0;i<rowNum;j++)
		{
			cell=ws.getRow(i).getCell(j);
			System.out.println(cell.getStringCellValue());
		}
		
	}
	

}
}
