package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class СreateDelPostTest extends AbstractTest{

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

    void createPost(){

        WebElement webElement5 = driver.findElement(By.cssSelector(".s-header-item__link--user"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.cssSelector("a.lightbutton"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.cssSelector(".text-0-2-179"));
        webElement7.sendKeys("Test post");
        WebElement webElement8 = driver.findElement(By.cssSelector(".aentry-post__block--unstyled"));
        webElement8.sendKeys("Идейные соображения высшего порядка, а также новая модель организационной деятельности играет важную роль в формировании позиций, занимаемых участниками в отношении поставленных задач. С другой стороны дальнейшее развитие различных форм деятельности обеспечивает широкому кругу (специалистов) участие в формировании существенных финансовых и административных условий. С другой стороны сложившаяся структура организации требуют определения и уточнения направлений прогрессивного развития.\n" +
                "\n" +
                "Равным образом сложившаяся структура организации представляет собой интересный эксперимент проверки систем массового участия. Идейные соображения высшего порядка, а также рамки и место обучения кадров играет важную роль в формировании новых предложений. С другой стороны начало повседневной работы по формированию позиции требуют определения и уточнения новых предложений. Задача организации, в особенности же рамки и место обучения кадров требуют от нас анализа форм развития. Равным образом консультация с широким активом позволяет оценить значение дальнейших направлений развития.\n" +
                "\n" +
                "Задача организации, в особенности же постоянный количественный рост и сфера нашей активности способствует подготовки и реализации соответствующий условий активизации. Товарищи! постоянное информационно-пропагандистское обеспечение нашей деятельности в значительной степени обуславливает создание системы обучения кадров, соответствует насущным потребностям. Повседневная практика показывает, что консультация с широким активом позволяет оценить значение систем массового участия. Значимость этих проблем настолько очевидна, что начало повседневной работы по формированию позиции играет важную роль в формировании систем массового участия.");

        WebElement webElement9 = driver.findElement(By.xpath("//*[.='Настроить и опубликовать']"));
        webElement9.click();
        WebElement webElement10 = driver.findElement(By.xpath("//*[.='Опубликовать']"));
        webElement10.click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement namePost = driver.findElement(By.cssSelector(".aentry-post__title-text"));
        Assertions.assertEquals("Test post", namePost.getText());

    }
    @Test
    @Order(3)
    void deletePost(){

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://www.livejournal.com/");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(".s-drop-master"))).build().perform();

        WebElement webElement11 = driver.findElement(By.xpath("//*[.='Управление записями']"));
        webElement11.click();

        WebElement webElement12 = driver.findElement(By.xpath("//*[.='Опубликованные записи']"));
        webElement12.click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement webElement13 = driver.findElement(By.xpath("//a[.='Test post']"));
        webElement13.click();

        WebElement webElement14 = driver.findElement(By.cssSelector(".svgicon--more"));
        webElement14.click();

        WebElement webElement15 = driver.findElement(By.xpath("//*[.='Редактировать запись']"));
        webElement15.click();

        WebElement webElement16 = driver.findElement(By.xpath("//*[.='Удалить пост']"));
        webElement16.click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement webElement17 = driver.findElement(By.xpath("//*[.='Удалить']"));
        webElement17.click();

        Assertions.assertNotNull(driver.findElement(By.xpath("//a[text()='Создать первую запись']")));

    }


}
