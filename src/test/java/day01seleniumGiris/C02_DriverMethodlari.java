package day01seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.edge.driver", "src/drivers/edgedriver_win64/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);

        driver.close();



    }
}
