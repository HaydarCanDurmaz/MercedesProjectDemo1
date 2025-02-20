package MercedesPages;

import GWD.Tools;
import GWD.Utily;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AboutMe extends Utily {

    @Test
    public void Test1 ()
    {

        driver.get("https://www.mercedes-benz.com.tr");


        Tools.wait(6);
        List<WebElement> cookiesAccept = driver.findElements(By.xpath("Tümünü kabul et"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();


        WebElement aboutMe = driver.findElement(By.linkText("Hakkımızda"));
        System.out.println("Hakkımızda get" + aboutMe.getText());

        //  EndPages();


    }
}
