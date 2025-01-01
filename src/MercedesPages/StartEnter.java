package MercedesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartEnter {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mercedes-benz.com.tr");
    }
}
