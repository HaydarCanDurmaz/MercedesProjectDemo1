package GWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utily {

    public static WebDriver driver;

     static  {

         AllEndPages();

        Logger logger =  Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        Duration tm = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(tm);
        driver.manage().timeouts().implicitlyWait(tm);



    }



    public static void EndPages(int sn){
try {
Thread.sleep(1000*sn);
}catch (InterruptedException e) {
    throw new RuntimeException(e);
}
    }
    public static void AllEndPages() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
}
