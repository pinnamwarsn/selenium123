package LIbraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility_Class1
{
    static WebDriver driver;
    
	//Read the Property File Data
	public static String GetTestData(String path) throws IOException
	{
		FileInputStream File=new FileInputStream("Properties//propertyfile.properties");
		
		Properties pr=new Properties();
		
		pr.load(File);
		
		String Value=pr.getProperty(path);
		
		return Value;
		
	}
	//Capture Screenshot
	public static void CaptureScreenshot() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	
		
		 File dest=new File(Utility_Class1.GetTestData("screenshot"));
		 
		 FileUtils.copyFile(src, dest);
		
		
		
		
	}
	
	public static String GetPfData(int r,int c, String sheet) throws FileNotFoundException, IOException
	{
		FileInputStream file=new FileInputStream(Utility_Class1.GetTestData("excelpath"));
		XSSFWorkbook wb=new XSSFWorkbook(file);
		 Sheet sh = wb.getSheet(sheet);
		String ReadDataFromExcel = sh.getRow(r).getCell(c).getStringCellValue();
		
		return ReadDataFromExcel;
		
		
	}
	
	
	
	
	
	
	
	
	
}
