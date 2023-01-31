package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends AbstractTest{
@Test
        void login(){
    WebElement webElement1 = driver.findElement(By.cssSelector("a.s-header-item__link--login"));
    webElement1.click();

    WebElement webElement2 = driver.findElement(By.id("user"));
    webElement2.sendKeys("PetrSid");

    WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
    webElement3.sendKeys("Qwert290690");
    WebElement webElement4 = driver.findElement(By.name("action:login"));
    webElement4.click();

    WebElement userInfo = driver.findElement(By.xpath("//a[@title = 'petrsid']"));
    Assertions.assertEquals("PETRSID", userInfo.getText());
}

}
