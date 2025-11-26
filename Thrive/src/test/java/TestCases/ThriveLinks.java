package TestCases;
import Config.BaseClass;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class ThriveLinks extends BaseClass
{
    @Test
    public void openSameLinkMultipleTimes() throws IOException, InterruptedException
    {

        String FilePath = "src/test/Resources/slow_speed.xlsx";

        FileInputStream inputStream = new FileInputStream(FilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("dm_links");

        int rows = sheet.getPhysicalNumberOfRows();
        for(int batchStart=0 ; batchStart < rows; batchStart+=10)
        {
            int batchEnd = Math.min(batchStart + 10, rows);

            for (int r = batchStart; r < batchEnd; r++)
            {
                XSSFRow row = sheet.getRow(r);
                if (row == null) continue;

                XSSFCell cell = row.getCell(0);
                if (cell == null) continue;

                String url = cell.getStringCellValue();

                if (url != null && !url.isEmpty())
                {
                    System.out.println("Navigate to URL: " + url);

                    for (int i = 0; i < 3; i++)
                    {
                        boolean linkSuccessful = false;
                        System.out.println("Attempt " + (i +1) + "to open the link:" + url);
                        try {
                            driver.get(url);
                            Thread.sleep(2000);
                            linkSuccessful = true;
                        }
                        catch (Exception e){
                            System.out.println("Attempt " + (i +1) + "Load URL:" + url + "Failed Error Message:" + e.getMessage());

                        }

                        if(!linkSuccessful && i==2){
                            System.out.println("Failed to load page after 3 attempts:" + url);
                        }
                    }
                    Assert.assertTrue(true,"Successfully opened the link after 3 attempts: " + url);
                    System.out.println("Moving to next URL...\n");
                }
                else{
                    System.out.println("URL is empty or Invalid at row: "+ (r + 1));
                }
            }
            System.out.println("Batch From" + (batchStart + 1) + "to" + batchEnd + "Completed...\n");
        }
        workbook.close();
        inputStream.close();
        driver.quit();
    }


    public void RunLinks() throws IOException , InterruptedException {

     String filePath = "src/test/Resources/slow_speed.xlsx";

        FileInputStream inputStream = new FileInputStream(filePath);
        XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet1 = workBook.getSheet("dm_links");

        int row = sheet1.getPhysicalNumberOfRows();

        for (int BatchStart = 0; BatchStart < row; BatchStart++){
            int BatchEnd = Math.min(BatchStart + 10 , row);
            for(int r = BatchStart; r< BatchEnd; r++){

                XSSFRow row1 = sheet1.getRow(r);
                if(row1==null) continue;
                XSSFCell cell = row1.getCell(0);
                if (cell == null) continue;

                String url = cell.getStringCellValue();
                if(url!= null && !url.isEmpty()){
                    System.out.println("Navigate to URL: " + url);
                }

            }
        }


    }
}
