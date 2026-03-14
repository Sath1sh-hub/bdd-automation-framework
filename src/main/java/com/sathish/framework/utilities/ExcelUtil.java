package com.sathish.framework.utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static Object[][] getExcelData(String filePath, String sheetName) {

    try {

        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {

            Row row = sheet.getRow(i);

            for (int j = 0; j < cols; j++) {

                data[i - 1][j] = row.getCell(j).toString();
            }
        }

        workbook.close();
        return data;

    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
    }
	
	
	public static String getCellData(String filePath, String sheetName, int row, int col) {
	    try {

	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheet(sheetName);

	        Row r = sheet.getRow(row);
	        Cell c = r.getCell(col);

	        String value = c.toString();

	        workbook.close();

	        return value;

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return null;
	}
}