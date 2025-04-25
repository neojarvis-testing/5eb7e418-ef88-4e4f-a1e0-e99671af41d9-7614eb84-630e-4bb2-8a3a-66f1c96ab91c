package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static FileInputStream filein;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static FileOutputStream fileout;
    public static XSSFRow row;
    public static XSSFCell col;
    public static int rowvalue;
    public static int colvalue;

    public static String readData(String filepath, String sheetname, int rownumber, int colnumber) throws IOException {

        try {
            filein = new FileInputStream(filepath);
            workbook = new XSSFWorkbook(filein);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = workbook.getSheet(sheetname);
        row = sheet.getRow(rownumber);
        col = row.getCell(colnumber);
        String value;
        try {
            DataFormatter formattedData = new DataFormatter();
            value = formattedData.formatCellValue(col);
            return value;
        } catch (Exception e) {
            value = "";
        }
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        filein.close();
        return value;
    }

    public static void writeData(String filepath, String sheetname, int rownumber, int colnumber, String value)
            throws IOException {
        try {
            filein = new FileInputStream(filepath);
            workbook = new XSSFWorkbook(filein);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        sheet = workbook.getSheet(sheetname);
        row = sheet.getRow(rownumber);
        col = row.getCell(colnumber);
        col.setCellValue(value);
        try {
            fileout = new FileOutputStream(filepath);
            workbook.write(fileout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        workbook.close();
        filein.close();
        fileout.close();

    }

    public static String[][] readDataForDataProvider(String filepath, String sheetname) throws IOException {
        try {
            filein = new FileInputStream(filepath);
            workbook = new XSSFWorkbook(filein);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet = workbook.getSheet(sheetname);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        String[][] data = new String[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                col = row.getCell(j);
                DataFormatter formatter = new DataFormatter();
                data[i - 1][j] = formatter.formatCellValue(col);
            }
        }

        workbook.close();
        filein.close();
        return data;
    }

}
