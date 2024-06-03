import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class ExcelFileHandling {
    public static void main(String[] args) throws IOException {

        System.out.println("-----------Data in the existing file: -----------");
        ReadingTheExcelFile();
        System.out.println("-----------After writing in the excel file: -----------");
        WriteInExcelFile();
        ReadingTheExcelFile();
    }

    static void ReadingTheExcelFile() throws IOException {
        String filePath = ".\\ExcelFileHandling Data.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int dataRows = sheet.getLastRowNum();
        int dataColumns = sheet.getRow(1).getLastCellNum();

        for(int rows=0;rows<dataRows;rows++){
            XSSFRow row =sheet.getRow(rows);
            for(int columns=0;columns<dataColumns;columns++){
                XSSFCell cellValue= row.getCell(columns);
                switch (cellValue.getCellType()){
                    case STRING:
                        System.out.print(cellValue.getStringCellValue()+"\t"); break;
                    case NUMERIC:
                        System.out.print(cellValue.getNumericCellValue()+"\t"); break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

    }

    static void WriteInExcelFile() {
        String filePath = ".\\ExcelFileHandling Data.xlsx";
        try {
                FileInputStream inputStream = new FileInputStream(new File(filePath));
                Workbook workbook = WorkbookFactory.create(inputStream);

                Sheet sheet = workbook.getSheetAt(0);

                Object[][] testData = {
                        {"Testing.com", "Test", "Java"},
                        {"Testing1.com", "Test1", "Apache POI"},
                };

                int rowCount = sheet.getLastRowNum();

                for (Object[] RowData : testData) {
                    Row row = sheet.createRow(++rowCount);

                    int columnCount = 0;

                    Cell cell = row.createCell(columnCount);
                    cell.setCellValue(rowCount);

                    for (Object field : RowData) {
                        cell = row.createCell(++columnCount);
                        if (field instanceof String) {
                            cell.setCellValue((String) field);
                        } else if (field instanceof Integer) {
                            cell.setCellValue((Integer) field);
                        }
                    }

                }
                inputStream.close();
                FileOutputStream outputStream = new FileOutputStream(".\\ExcelFileHandling Data.xlsx");
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

            } catch (IOException | EncryptedDocumentException ex) {
                ex.printStackTrace();
            }
        }
    }




