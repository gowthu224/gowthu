package E2E_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.print.DocFlavor.STRING;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.base;

public class inputFormSubmit_testcase3 extends base{
	@BeforeTest
	public void initiation() throws IOException
	{
		
		driver=browserinitiation();
	}
	@Test
	public void inputFormSubmit_tc3_m() throws IOException
	{
		homepage h =new homepage(driver);
		h.pagealert_m().click();
		h.Inputforms_m().click();
		inputFormSubmit form=new inputFormSubmit(driver);
		form.inputFormSubmitpage_m().click();
		
		//Extacting data from Excel sheet user.dir file= Testdata1,  sheet=Inputformsubmit_testdata
		FileInputStream fis=new FileInputStream("C:\\Users\\Rajasekar.Murugesan\\eclipse-workspace\\E2E-project\\Testdata1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//System.out.println(workbook);
		int sheetcount=workbook.getNumberOfSheets();
		System.out.println(sheetcount);
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<sheetcount;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase(prop.getProperty("DesiredSheet")))
			{
				XSSFSheet sheet=workbook.getSheetAt(i); //has all rows
				Iterator<Row> rows=sheet.iterator();	//sheet is collection of rows
				Row firstrow=rows.next();				
				Iterator<Cell> firstrowcells=firstrow.cellIterator(); //row is collection of cells
				int k=0;
				int column=0;
				while(firstrowcells.hasNext())
				{
					Cell value=firstrowcells.next();
					if(value.getStringCellValue().equalsIgnoreCase("Testdata"))
					{
						column=k;
					}
					k++;
				}
				System.out.println(column);
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(prop.getProperty("Testdata")))
					{
						Iterator<Cell> cellvalues=r.cellIterator();
						while(cellvalues.hasNext())
						{
							Cell desiredValue=cellvalues.next();
							if(desiredValue.getCellTypeEnum() == CellType.NUMERIC)
								{
							a.add(NumberToTextConverter.toText(desiredValue.getNumericCellValue()));
								} else {
									a.add(desiredValue.getStringCellValue());
								}
					}
				}
				
				
			}
		}
			for(int j=0;j<a.size();j++)
			{
				System.out.println("a["+j+"]"+a.get(j));
			}
			
	}
	form.firstName_m().sendKeys(a.get(1));
	form.lastName_m().sendKeys(a.get(2));
	form.email_m().sendKeys(a.get(3));
	form.phone_m().sendKeys(a.get(4));
	form.address_m().sendKeys(a.get(5));
	form.city_m().sendKeys(a.get(6));
		Select S=new Select(form.state_m());
		S.selectByVisibleText(a.get(7));
	form.zip_m().sendKeys(a.get(8));
	form.website_m().sendKeys(a.get(9));
	if(a.get(10).equalsIgnoreCase("yes"))
	{
		form.hosting_yes_m().click();
	}else {
		form.hosting_no_m().click();
	}
	form.description_m().sendKeys(a.get(11));
	form.send_m().click();

}
	@AfterTest
	public void termination()
	{
		driver.close();
	}
}

