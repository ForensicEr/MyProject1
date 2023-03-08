package day01seleniumGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(ops);

        driver.manage().window().maximize();

        System.out.println("maximize size" + driver.manage().window().getSize());

        System.out.println("maximize position" + driver.manage().window().getPosition());

        driver.manage().window().fullscreen();

        System.out.println("fullscreen size" + driver.manage().window().getSize());

        System.out.println("fullscreen position" + driver.manage().window().getPosition());

    }
}
