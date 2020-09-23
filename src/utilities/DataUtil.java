package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataUtil {

    public static Object[][] getMyData(String filepath,String sheetName,boolean isHeader) throws IOException {
        FileInputStream fp = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fp);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        int headerCount = 0;

        if(isHeader)
        {
           rowCount--;
           headerCount =1;
        }

        Object[][] data = new Object[rowCount][colCount];

        for(int i=0;i<rowCount;i++)
        {

            for(int j=0;j<18;j++)
            {
               data[i][j] = sheet.getRow(i+headerCount).getCell(j).toString().trim();
            }
        }

        return data;
    }
}
