package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MoreTest extends AbstractTest{

    @Test
    void more(){

        WebElement more = driver.findElement(By.xpath("//ul[@class = \"categories__list js--limited-list\"]/li[12]"));
       more.click();


        Assertions.assertNotNull(driver.findElement(By.xpath("//a[.='Развлечения']")));
    }
}
