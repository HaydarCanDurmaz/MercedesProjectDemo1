package GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieAcceptance {
    public static void main(String[] args) {
        // Chrome WebDriver'ı başlat
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // ChromeDriver'ın yolunu doğru şekilde belirtin
        WebDriver driver = new ChromeDriver();

        // Web sitesine git
        driver.get("https://www.mercedes-benz.com.tr");

        // Çerez kabul butonunu bul ve tıkla
        try {
            // Bu butonun CSS selector'ünü veya uygun başka bir seçicisini kullanarak butona tıklayın
            driver.findElement(By.cssSelector("button#accept-cookies")).click(); // Örnek CSS seçici
        } catch (Exception e) {
            System.out.println("Çerez kabul butonu bulunamadı veya tıklanamadı.");
        }

        // Web sayfasının işlemlerini buraya ekleyebilirsiniz

        // İşlemler tamamlandıktan sonra tarayıcıyı kapat
        driver.quit();
    }
}

