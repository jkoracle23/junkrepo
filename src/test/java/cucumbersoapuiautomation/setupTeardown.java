package cucumbersoapuiautomation;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class setupTeardown {
	
	//Report generation stuffs
		public static int rowCounter=0;
		public static DataFormatter formatter2 = new DataFormatter();
		
		public static FileOutputStream fwrite;//earlier it was defined and declared in constructor itself. Giving error that it can't be public and static.
		//so defined outside the constructor
		public static String filepath;
		public static String filename;
		
		public static XSSFWorkbook workbook;
		public static XSSFSheet sheet;
				     
		//End of report generation stuffs
	public static void filesetup()
	{
		
	  try{	
		//String filepath="G:\\automation\\Run_report";
 
		filename = new SimpleDateFormat("yyyyMMddhhmm'.xlsx'").format(new Date());
		fwrite = new FileOutputStream(new File("target/"+filename)); //create XLS file
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("Run result");//creating sheet 
		//create style**********
		 XSSFCellStyle lightblue_style = workbook.createCellStyle();
		 lightblue_style.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());
		 lightblue_style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		 
		 
		 XSSFCellStyle green_style = workbook.createCellStyle();
		 green_style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
		 green_style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		 
		 
		 XSSFCellStyle red_style = workbook.createCellStyle();
		 red_style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
		 red_style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		 
		 
		 

		 XSSFCellStyle yellow_style = workbook.createCellStyle();
		 yellow_style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		 yellow_style.setFillPattern(CellStyle.SOLID_FOREGROUND);
					
		//style creation done

		
		
		//creating header
		Row rowr=sheet.createRow(0);
		Cell cellr=rowr.createCell(0);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("Test SUIT NAME");
		cellr.setCellStyle(green_style);
		
		cellr=rowr.createCell(1);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("TEST CASE NAME");
		cellr.setCellStyle(green_style);
		
		cellr=rowr.createCell(2);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("TEST STEP NAME");
		cellr.setCellStyle(green_style);
		
		cellr=rowr.createCell(3);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("REQUEST NODE NAME");
		cellr.setCellStyle(green_style);
		
		cellr=rowr.createCell(4);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("REQUEST NODE VALUE");
		cellr.setCellStyle(green_style);
		
		cellr=rowr.createCell(5);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("RESPONSE NODE XPATH");
		cellr.setCellStyle(green_style);
		
		cellr=rowr.createCell(6);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("RESPONSE NODE EXPECTED VALUE");
		cellr.setCellStyle(green_style);
		
		cellr=rowr.createCell(7);
		cellr.setCellType(Cell.CELL_TYPE_STRING);
		cellr.setCellValue("RESPONSE NODE ACTUAL VALUE");
		cellr.setCellStyle(green_style);
		
		//header creation done
		rowCounter++;//move to next excel row
		
	  }
	  catch(Exception e)
	  {
		  //write exception to the result file
	  }
	
	}
	
	public static void entryIntoReport(String suiteName,String jtestCaseName,String jtestStepName,String RequestNodeName,
			                           String requestNodeValue,String responseNodeXpath,String responseExpectedValue,String responseActualValue  )
	{
		
			
			Row rowr=setupTeardown.sheet.createRow(setupTeardown.rowCounter);
			Cell cellr=rowr.createCell(0);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(suiteName);
			
			cellr=rowr.createCell(1);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(jtestCaseName);
			
			cellr=rowr.createCell(2);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(jtestStepName);
			
			
			cellr=rowr.createCell(3);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(RequestNodeName);
			
			cellr=rowr.createCell(4);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(requestNodeValue);
			
			cellr=rowr.createCell(5);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(responseNodeXpath);
			
			cellr=rowr.createCell(6);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(responseExpectedValue);
			
			cellr=rowr.createCell(7);
			cellr.setCellType(Cell.CELL_TYPE_STRING);
			cellr.setCellValue(responseActualValue);
			 setupTeardown.rowCounter++;//move to next row
		
		
	}
	public static void closingSteps()
	{
		try{
			workbook.write(fwrite);workbook.close();
			fwrite.close();
		}
		catch(Exception e)
		{
		
		}
		
	}

}
