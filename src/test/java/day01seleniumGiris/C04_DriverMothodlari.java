package day01seleniumGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04_DriverMothodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.get("http://www.wisequarter.com");


        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getPageSource());

        // sayfa kodlari " 2 hours weekly meeting with the team" iceriyor mu test edin

        String expectedIcerik= "2 hours weekly meeting with the team";
        String actualSayfaKodlari= driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.quit();
        }



    }

