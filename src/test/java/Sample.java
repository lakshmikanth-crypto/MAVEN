import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// to RAISE A CONFLICT
public class Sample {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\madhu\\eclipse-workspace\\Maven\\ExcelFiles\\data.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook w= new XSSFWorkbook(fi);
	Sheet s=w.getSheet("Sheet1");
	int noofrows =s.getPhysicalNumberOfRows();
	System.out.println("Numberof rows:"+noofrows);
	//for(int i=0;i < s.getPhysicalNumberOfRows();i++) {
	//Row r=s.getRow(0);
	
}
}
