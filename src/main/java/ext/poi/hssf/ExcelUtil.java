package ext.poi.hssf;

import domain.Student;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ExcelUtil {
    public static File generateExcel(String name,List<Student> list) {
        File file = new File(name);
        Workbook workbook =new XSSFWorkbook();
        Objects.requireNonNull(list);
        Sheet sheet= workbook.createSheet();
        int len = list.size();
        for(int i = 0;i<len;i++){
            Row row = sheet.createRow(i);
            for(Student s :list){
              //  row.createCell(i);

            }
        }




        return file;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("tmp.xlsx");

        Workbook wb =new XSSFWorkbook();
        Sheet sheet= wb.createSheet();
//        Row row = sheet.createRow(1);
//        Cell cell = row.createCell(1);
//        cell.setCellValue("zhangshuyi");

        FileOutputStream fileOut = new FileOutputStream(file);
        wb.write(fileOut);
        fileOut.close();
    }
}
