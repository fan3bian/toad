package trdLib;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * excel解析工具
 * Created by fangkun on 14-11-13.
 */
public class ExcelAnalysisUtils {

    /**
     * 解析excel文件
     * @param excelInputStream excel文件输入流
     * @return
     */
    public static List<List<String>> analysisExcelForPo(InputStream excelInputStream)  throws IOException {
        List<List<String>> result = null;
        if(excelInputStream == null){
            return result;
        }
        result = new LinkedList<List<String>>();
        //生成工作表对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook( excelInputStream);
        // 循环工作表Sheet
        for(int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt( numSheet);
            if(hssfSheet == null){
                continue;
            }
            int headerCellNum = hssfSheet.getRow( 0).getLastCellNum();
            // 循环行Row
            for(int rowNum = 2; rowNum <= hssfSheet.getLastRowNum(); rowNum++){
                boolean isEmptyRow = true;
                HSSFRow hssfRow = hssfSheet.getRow( rowNum);
                if(hssfRow == null){
                    continue;
                }
                List<String> rowData = new ArrayList<String>();
                //防止数字类型的变更为科学计数法
                DecimalFormat df = new DecimalFormat("0");
                // 循环列Cell
                int currentRowCellNum =  Math.max(hssfRow.getLastCellNum(),headerCellNum);
                for(int cellNum = 0; cellNum <= currentRowCellNum; cellNum++){
                    HSSFCell hssfCell = hssfRow.getCell( cellNum);
                    if(hssfCell == null){
                        rowData.add(null);
                    }else {
                        String cellValue = null;
                        switch (hssfCell.getCellType()) {
                            case HSSFCell.CELL_TYPE_STRING:
                                cellValue = hssfCell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                cellValue = df.format(hssfCell.getNumericCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN:
                                cellValue = String.valueOf(hssfCell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BLANK:
                                cellValue = null;
                                break;
                            default:
                                cellValue = null;
                                break;
                        }
                        //如果每一行中有一个单元格值不为空，则认为该行数据有效
                        if(!StringUtils.isEmpty(cellValue)){
                            isEmptyRow = false;
                        }
                        rowData.add(org.apache.commons.lang.StringUtils.trim(cellValue));
                    }
                }
                //如果是空行，则认为改行数据无效，不添加到解析结果中
                if(!isEmptyRow){
                    result.add(rowData);
                }
            }
        }
        return result;
    }


    public static List<List<String>> analysisExcel(InputStream excelInputStream)  throws IOException {
        List<List<String>> result = null;
        if(excelInputStream == null){
            return result;
        }
        result = new LinkedList<List<String>>();
        //生成工作表对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook( excelInputStream);
        // 循环工作表Sheet
        for(int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt( numSheet);
            if(hssfSheet == null){
                continue;
            }
            int headerCellNum = hssfSheet.getRow( 0).getLastCellNum();
            // 循环行Row
            for(int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++){
                boolean isEmptyRow = true;
                HSSFRow hssfRow = hssfSheet.getRow( rowNum);
                if(hssfRow == null){
                    continue;
                }
                List<String> rowData = new ArrayList<String>();
                //防止数字类型的变更为科学计数法
                DecimalFormat df = new DecimalFormat("0");
                // 循环列Cell
                int currentRowCellNum =  Math.max(hssfRow.getLastCellNum(),headerCellNum);
                for(int cellNum = 0; cellNum <= currentRowCellNum; cellNum++){
                    HSSFCell hssfCell = hssfRow.getCell( cellNum);
                    if(hssfCell == null){
                        rowData.add(null);
                    }else {
                        String cellValue = null;
                        switch (hssfCell.getCellType()) {
                            case HSSFCell.CELL_TYPE_STRING:
                                cellValue = hssfCell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                cellValue = df.format(hssfCell.getNumericCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN:
                                cellValue = String.valueOf(hssfCell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BLANK:
                                cellValue = null;
                                break;
                            default:
                                cellValue = null;
                                break;
                        }
                        //如果每一行中有一个单元格值不为空，则认为该行数据有效
                        if(!StringUtils.isEmpty(cellValue)){
                            isEmptyRow = false;
                        }
                        rowData.add(org.apache.commons.lang.StringUtils.trim(cellValue));
                    }
                }
                //如果是空行，则认为改行数据无效，不添加到解析结果中
                if(!isEmptyRow){
                    result.add(rowData);
                }
            }
        }
        return result;
    }






    public static List<List<String>> analysisExcel(InputStream excelInputStream, int sheet)  throws IOException {
        List<List<String>> result = null;
        if(excelInputStream == null){
            return result;
        }
        result = new LinkedList<List<String>>();
        //生成工作表对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook( excelInputStream);
        // 循环工作表Sheet
        if(hssfWorkbook.getNumberOfSheets() > 0){
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt( sheet);
            if(hssfSheet == null){
                return result;
            }
            int headerCellNum = hssfSheet.getRow( 0).getLastCellNum();
            // 循环行Row
            for(int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++){
                boolean isEmptyRow = true;
                HSSFRow hssfRow = hssfSheet.getRow( rowNum);
                if(hssfRow == null){
                    continue;
                }
                List<String> rowData = new ArrayList<String>();
                //防止数字类型的变更为科学计数法
                DecimalFormat df = new DecimalFormat("0");
                // 循环列Cell
                int currentRowCellNum =  Math.max(hssfRow.getLastCellNum(),headerCellNum);
                for(int cellNum = 0; cellNum <= currentRowCellNum; cellNum++){
                    HSSFCell hssfCell = hssfRow.getCell( cellNum);
                    if(hssfCell == null){
                        rowData.add(null);
                    }else {
                        String cellValue = null;
                        switch (hssfCell.getCellType()) {
                            case HSSFCell.CELL_TYPE_STRING:
                                cellValue = hssfCell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                cellValue = df.format(hssfCell.getNumericCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN:
                                cellValue = String.valueOf(hssfCell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BLANK:
                                cellValue = null;
                                break;
                            default:
                                cellValue = null;
                                break;
                        }
                        //如果每一行中有一个单元格值不为空，则认为该行数据有效
                        if(!StringUtils.isEmpty(cellValue)){
                            isEmptyRow = false;
                        }
                        rowData.add(org.apache.commons.lang.StringUtils.trim(cellValue));
                    }
                }
                //如果是空行，则认为改行数据无效，不添加到解析结果中
                if(!isEmptyRow){
                    result.add(rowData);
                }
            }
        }
        return result;
    }




    /**
     *
     * @param excelInputStream
     * @return
     * @throws IOException
     */
    public static List<Map<String, String>> analysisExcelToMap(InputStream excelInputStream) throws IOException {
        List<Map<String, String>> resultMap = null;
        if (excelInputStream == null) {
            return resultMap;
        }
        resultMap = new ArrayList<Map<String, String>>();
        //生成工作表对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(excelInputStream);
        //取第一个工作表
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
        if (hssfSheet == null) {
            return null;
        }
        List<String> title = new ArrayList<String>();
        HSSFRow hssfRow = hssfSheet.getRow(1);//获得表头
        if (hssfRow == null) {
            return null;
        }
        //解析表头为List
        for (int cellNum = 0; cellNum < hssfRow.getLastCellNum(); cellNum++) {
            HSSFCell hssfCell = hssfRow.getCell(cellNum);
            if (hssfCell == null) {
                throw new NullPointerException("文件表头存在空标题");
            }
            String cellValue = hssfCell.getStringCellValue();
            if (StringUtils.isBlank(cellValue)) {
                throw new NullPointerException("文件表头存在空标题");
            }
            title.add(org.apache.commons.lang.StringUtils.trim(cellValue));
        }

        // 循环行Row,从第三行开始读取数据
        for (int rowNum = 2; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
            boolean isEmptyRow = true;
            hssfRow = hssfSheet.getRow(rowNum);
            if (hssfRow == null) {
                continue;
            }

            Map<String, String> rowDataMap = new HashedMap();
            //防止数字类型的变更为科学计数法
            DecimalFormat df = new DecimalFormat("0.##");
            // 循环列Cell
            for (int cellNum = 0; cellNum < title.size(); cellNum++) {
                HSSFCell hssfCell = hssfRow.getCell(cellNum);
                if (hssfCell == null) {
                    rowDataMap.put(title.get(cellNum),new String(""));
                } else {
                    String cellValue = null;
                    switch (hssfCell.getCellType()) {
                        case HSSFCell.CELL_TYPE_STRING:
                            cellValue = hssfCell.getStringCellValue();
                            break;
                        case HSSFCell.CELL_TYPE_NUMERIC:
                            // 处理日期格式、时间格式
                            if (HSSFDateUtil.isCellDateFormatted(hssfCell)) {
                                SimpleDateFormat sdf = null;
                                if (hssfCell.getCellStyle().getDataFormat() == HSSFDataFormat
                                        .getBuiltinFormat("h:mm")) {
                                    sdf = new SimpleDateFormat("HH:mm:ss");
                                } else {// 日期
                                    sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                }
                                Date date = hssfCell.getDateCellValue();
                                cellValue = sdf.format(date);
                            } else {
                                cellValue = df.format(hssfCell.getNumericCellValue());
                            }
                            break;
                        case HSSFCell.CELL_TYPE_BOOLEAN:
                            cellValue = String.valueOf(hssfCell.getBooleanCellValue());
                            break;
                        case HSSFCell.CELL_TYPE_BLANK:
                            cellValue = null;
                            break;
                        default:
                            cellValue = null;
                            break;
                    }
                    //如果每一行中有一个单元格值不为空，则认为该行数据有效
                    if (!StringUtils.isEmpty(cellValue)) {
                        isEmptyRow = false;
                    }
                    rowDataMap.put(title.get(cellNum), org.apache.commons.lang.StringUtils.trim(cellValue));
                }
            }
            //如果是空行，则认为改行数据无效，不添加到解析结果中
            if (!isEmptyRow) {
                resultMap.add(rowDataMap);
            }
        }
        return resultMap;
    }
    public static List<List<String>> analysisExcel(InputStream excelInputStream,DecimalFormat df)  throws IOException {
        List<List<String>> result = null;
        if(excelInputStream == null){
            return Collections.emptyList();
        }
        if(df==null){
            df = new DecimalFormat("0.##");//浮点数最多保留两位有效数字
        }
        result = new LinkedList<List<String>>();
        //生成工作表对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook( excelInputStream);
        // 循环工作表Sheet
        for(int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt( numSheet);
            if(hssfSheet == null){
                continue;
            }
            int headerCellNum = hssfSheet.getRow( 0).getLastCellNum();
            // 循环行Row
            for(int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++){
                boolean isEmptyRow = true;
                HSSFRow hssfRow = hssfSheet.getRow( rowNum);
                if(hssfRow == null){
                    continue;
                }
                List<String> rowData = new ArrayList<String>();
                //防止数字类型的变更为科学计数法

                // 循环列Cell
                int currentRowCellNum =  Math.max(hssfRow.getLastCellNum(),headerCellNum);
                for(int cellNum = 0; cellNum <= currentRowCellNum; cellNum++){
                    HSSFCell hssfCell = hssfRow.getCell( cellNum);
                    if(hssfCell == null){
                        rowData.add(null);
                    }else {
                        String cellValue = null;
                        switch (hssfCell.getCellType()) {
                            case HSSFCell.CELL_TYPE_STRING:
                                cellValue = hssfCell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                cellValue = df.format(hssfCell.getNumericCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN:
                                cellValue = String.valueOf(hssfCell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BLANK:
                                cellValue = null;
                                break;
                            default:
                                cellValue = null;
                                break;
                        }
                        //如果每一行中有一个单元格值不为空，则认为该行数据有效
                        if(!StringUtils.isEmpty(cellValue)){
                            isEmptyRow = false;
                        }
                        rowData.add(org.apache.commons.lang.StringUtils.trim(cellValue));
                    }
                }
                //如果是空行，则认为改行数据无效，不添加到解析结果中
                if(!isEmptyRow){
                    result.add(rowData);
                }
            }
        }
        return result;
    }

    public static List<List<String>> analysisExcelPoGoodsNumFloat(InputStream excelInputStream, int sheet)  throws IOException {
        List<List<String>> result = null;
        if(excelInputStream == null){
            return result;
        }
        result = new LinkedList<List<String>>();
        //生成工作表对象
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook( excelInputStream);
        // 循环工作表Sheet
        for(int numSheet = 0; numSheet < 1; numSheet++){
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt( numSheet);
            if(hssfSheet == null){
                continue;
            }
            int headerCellNum = hssfSheet.getRow( 0).getLastCellNum();
            // 循环行Row
            for(int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++){
                boolean isEmptyRow = true;
                HSSFRow hssfRow = hssfSheet.getRow( rowNum);
                if(hssfRow == null){
                    continue;
                }
                List<String> rowData = new ArrayList<String>();
                //防止数字类型的变更为科学计数法
                DecimalFormat df = new DecimalFormat("0");
                // 循环列Cell
                int currentRowCellNum =  Math.max(hssfRow.getLastCellNum(),headerCellNum);
                for(int cellNum = 0; cellNum <= currentRowCellNum; cellNum++){
                    HSSFCell hssfCell = hssfRow.getCell( cellNum);
                    if(hssfCell == null){
                        rowData.add(null);
                    }else {
                        String cellValue = null;
                        switch (hssfCell.getCellType()) {
                            case HSSFCell.CELL_TYPE_STRING:
                                cellValue = hssfCell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                hssfCell.setCellType(1);
                                cellValue =  hssfCell.getStringCellValue()+"";
                                break;
                            case HSSFCell.CELL_TYPE_FORMULA:
                                hssfCell.setCellType(1);
                                cellValue =  hssfCell.getStringCellValue()+"";
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN:
                                cellValue = String.valueOf(hssfCell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BLANK:
                                cellValue = null;
                                break;
                            default:
                                cellValue = null;
                                break;
                        }
                        //如果每一行中有一个单元格值不为空，则认为该行数据有效
                        if(!StringUtils.isEmpty(cellValue)){
                            isEmptyRow = false;
                        }
                        rowData.add(org.apache.commons.lang.StringUtils.trim(cellValue));
                    }
                }
                //如果是空行，则认为改行数据无效，不添加到解析结果中
                if(!isEmptyRow){
                    result.add(rowData);
                }
            }
        }
        return result;
    }


}
