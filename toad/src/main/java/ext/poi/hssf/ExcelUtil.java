package ext.poi.hssf;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtil {
    public static File generateExcel(String name) {
        File file = new File(name);
        Workbook workbook =new HSSFWorkbook();
        return null;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("tmp.xlsx");

        Workbook wb =new XSSFWorkbook();
        Sheet sheet= wb.createSheet();
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(2);
        cell.setCellValue("zhangshuyi");

        FileOutputStream fileOut = new FileOutputStream(file);
        wb.write(fileOut);
        fileOut.close();
    }
}
