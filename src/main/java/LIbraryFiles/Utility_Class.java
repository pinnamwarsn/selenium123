package LIbraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility_Class 
{
	//read the property file data
	public static String gettestdata(String key) throws IOException
	{

		FileInputStream file = new FileInputStream("Properties//propertyfile.properties");

		Properties pr = new Properties();
		pr.load(file);
		String value = pr.getProperty(key);

		return value;


	}

	//screenshot capture
	public static void capturescreenshot(WebDriver driver   ) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest=new File(Utility_Class.gettestdata("screenshot"));

		org.openqa.selenium.io.FileHandler.copy(src,dest);

	}

	//fetch the excel data
	public static String getpfdata(int r ,int c ,String Sheet) throws FileNotFoundException, IOException
	{
		FileInputStream file = new FileInputStream(Utility_Class.gettestdata("excelpath"));
		XSSFWorkbook wb=new XSSFWorkbook(file);
		Sheet sh = wb.getSheet(Sheet);
		

		String ReadExcelData = sh.getRow(r).getCell(c).getStringCellValue();

		return ReadExcelData;

	}
	 
	   public static int getrow(String Sheet) throws FileNotFoundException, IOException
	  {
		FileInputStream file = new FileInputStream(Utility_Class.gettestdata("excelpath"));
		XSSFWorkbook wb=new XSSFWorkbook(file);
		Sheet sh = wb.getSheet(Sheet);
		 int r=sh.getLastRowNum();
		 return r;

	}
	










}
