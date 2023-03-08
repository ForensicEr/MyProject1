package day01seleniumGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class C03_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(ops);
        driver.get("http://www.amazon.com");

        System.out.println("Url:"+ driver.getCurrentUrl());
        System.out.println("Title:" + driver.getTitle());
        // amazon anasayfaya gittiginiz test edin

        String expectedIcerik="amazon";
        String actualUrl= driver.getCurrentUrl();

        if(actualUrl.contains(expectedIcerik)) {//amazon anasayfaya gittiysek
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");




    }
}
