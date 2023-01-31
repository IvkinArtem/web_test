package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LogoutTest extends AbstractTest{

    @Test
    @Order(1)
    void loginTest(){

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
    @Test
    void logout(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(By.cssSelector(".s-drop-master")))
                .build()
                .perform();

        WebElement webElement18 = driver.findElement(By.cssSelector(".s-header-sub-list-item__link--logout"));
        webElement18.click();

        WebElement login = driver.findElement(By.cssSelector(".s-header-item__link--login"));
        Assertions.assertEquals("ВОЙТИ", login.getText());
    }


}
