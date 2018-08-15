
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {

    FileInputStream file;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    XSSFRow row;

    Excel() {
        try {
            file = new FileInputStream(Constant.xlsxPath);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(0);


        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setRow(int rowInt){
        row = sheet.getRow(rowInt);
    }

    public String pullExcelData(int cellNum) {
        cell = row.getCell(cellNum);
        return cell.getStringCellValue();

    }

    public String pullExcelNumeric(int cellNum) {
        cell = row.getCell(cellNum);
        return cell.getNumericCellValue() + "";
    }




}
