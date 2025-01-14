package GWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class Tools {

    public static void wait(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
