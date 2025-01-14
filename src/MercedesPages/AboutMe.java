package MercedesPages;

import GWD.Utily;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AboutMe extends Utily {

    public static void main(String[] args) {

        List<WebElement> cookiesAccept =driver.findElements(By.linkText("Tümünü kabul et"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        driver.get("https://www.mercedes-benz.com.tr");





        EndPages();


    }
}
