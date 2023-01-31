package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewFacesTest extends AbstractTest{
    @Test
    void newFace(){

        WebElement newFace = driver.findElement(By.xpath("//ul[@class = \"categories__list js--limited-list\"]/li[1]"));
        newFace.click();


        Assertions.assertNotNull(driver.findElement(By.xpath("//h1[text()='Новые лица']")));

    }
}
