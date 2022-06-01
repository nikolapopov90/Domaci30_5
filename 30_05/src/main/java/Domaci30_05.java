import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Domaci30_05 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.strela.co.rs/");
        WebElement shop = driver.findElement(By.xpath("//*[@id='ctl00_RadMenu1']/ul/li[2]"));
        shop.click();
        WebElement bows = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_GrupeRadTreeView\"]/ul/li[1]/div/span[3]"));
        bows.click();
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_MainContent_ListView1_ctrl193_Panel1")));
        WebElement bowSamickSage = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ListView1_ctrl35_Panel1']/figure"));
        bowSamickSage.click();

        WebElement samickSageBowPage = driver.findElement(By.id("ctl00_MainContent_ItemListView_ctrl0_ItemNazivLabel"));

        if (samickSageBowPage.getText().contains("Samick")) {
            System.out.println("Bow name contains the word Samick!");
        } else {
            System.out.println("Bow name doesn't contain the word Samick!");
        }

        Thread.sleep(5000);

        driver.close();
    }

}
