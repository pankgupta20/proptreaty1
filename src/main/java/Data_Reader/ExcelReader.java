package Data_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private final static Logger logger = Logger.getLogger(ExcelReader.class);
	private static String excellocation = "C:/Selenium/Proportional Treaty/test_data/Test_Data_Prototype.xlsx";
	private static FileInputStream file = null;
	private static XSSFWorkbook wb = null;
	private static XSSFSheet ws = null;
	private static XSSFRow Row = null;
	//private static XSSFCell Cell = null;
	
	public static void setExcelFile(String SheetName) throws IOException {
		try {
			file = new FileInputStream(new File(excellocation));
			wb = new XSSFWorkbook(file);
			ws = wb.getSheet(SheetName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static String getColName(int colPos) throws IOException{
		setExcelFile("Sheet1");
		String colName = ws.getRow(0).getCell(colPos).getStringCellValue();
		return colName;
	}
	
	public static int getRowCount() throws IOException {
		setExcelFile("Sheet1");
		int rcount = ws.getLastRowNum() + 1;
		logger.info("Total no. of rows in sheet are: " + rcount);
		return rcount;
	}

	public static int getColCount() throws IOException {
		setExcelFile("Sheet1");
		int ccount = ws.getRow(0).getLastCellNum();
		logger.info("Total no. of columns in sheet are: " + ccount);
		return ccount;
	}

	public static int getRowNum(int Col, String exptext) throws IOException {
		setExcelFile("Sheet1");
		for (int i = 0; i < ws.getPhysicalNumberOfRows(); i++) {
			//XSSFRow Row = ws.getRow(i);
			Row = ws.getRow(i);
			//Cell Cell = Row.getCell(Col);
			Cell Cell = Row.getCell(Col);
			if (Cell.getStringCellValue().equalsIgnoreCase(exptext)) {
				logger.info("Row no. returned from sheet is: " + i);
				return i;
			}
		}
		return -1;
	}

	public static int getColNum(String expcolname) throws IOException {
		//XSSFRow Row = ws.getRow(0);
		Row = ws.getRow(0);
		for (int i = 0; i < Row.getPhysicalNumberOfCells(); i++) {
			Cell Cell = Row.getCell(i);
			Cell = Row.getCell(i);
			if (Cell.getStringCellValue().equalsIgnoreCase(expcolname)) {
				logger.info("Column no. returned from sheet is: " + i);
				return i;
			}
		}
		return -1;
	}

	public static Object getTestData(int row, int col) throws IOException {
		//XSSFRow rowval = ws.getRow(row);
			Row = ws.getRow(row);
		Cell cell = Row.getCell(col);

		if (cell == null) {
			cell = Row.createCell(col);
			return cell.getStringCellValue();
		} else {
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_NUMERIC:
				logger.info("Cell value on row " + row + " and column " + col + " is: " + cell.getNumericCellValue());
				return cell.getNumericCellValue();
			case Cell.CELL_TYPE_STRING:
				logger.info("Cell value on row " + row + " and column " + col + " is: " + cell.getStringCellValue());
				return cell.getStringCellValue();
			case Cell.CELL_TYPE_BOOLEAN:
				logger.info("Cell value on row " + row + " and column " + col + " is: " + cell.getStringCellValue());
				return cell.getStringCellValue();
			case Cell.CELL_TYPE_FORMULA:
				String cellText  = String.valueOf(cell.getNumericCellValue());
				  if (HSSFDateUtil.isCellDateFormatted(cell)) {
			           // format in form of M/D/YY
					  double d = cell.getNumericCellValue();

					  Calendar cal =Calendar.getInstance();
					  cal.setTime(HSSFDateUtil.getJavaDate(d));
			            cellText =
			             (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
			           cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" +
			                      cal.get(Calendar.MONTH)+1 + "/" + 
			                      cellText;
			         }
			}
		}
		return null;
	}

	public static void setCellData(String Result, int row, int col) throws Exception {
		try {
			Row = ws.getRow(row);
			@SuppressWarnings("static-access")
			Cell Cell = Row.getCell(col, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {
				Cell = Row.createCell(col);
				Cell.setCellValue(Result);
			} else {
				Cell.setCellValue(Result);
			}

			FileOutputStream fileOut = new FileOutputStream(excellocation);
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}
	
	/*  public static void main(String args[]) throws Exception{
	  setExcelFile("Sheet1");
	  setCellData("ABC",1,14);
	  int rowcount = getRowCount(); int colcount =
	  getColCount();
	  
	  for(int i=1;i<rowcount;i++){ for(int j=3;j<colcount;j++){ Object data =
	  getTestData(i,j); if(data.toString().length()>0){ System.out.print(data);
	  System.out.print("|");
	  
	  } else{ break; } } System.out.println(""); } 
	  
	  }*/
	 

}
