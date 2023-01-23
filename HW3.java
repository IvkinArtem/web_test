package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Logout {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");

        //Вход в ЛК

        WebElement webElement1 = driver.findElement(By.cssSelector("a.s-header-item__link--login"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.id("user"));
        webElement2.sendKeys("PetrSid");

        WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
        webElement3.sendKeys("Qwert290690");
        WebElement webElement4 = driver.findElement(By.name("action:login"));
        webElement4.click();

        /*//Создание поста

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
        webElement10.click();*/

        //Удаление поста


        WebElement webElement11 = driver.findElement(By.xpath("//a[class='s-nav-item__name']"));
        webElement11.isEnabled();

        WebElement webElement12 = driver.findElement(By.xpath("//*[.='Управление записями']"));
        webElement12.click();



        /*//Выход из ЛК

        WebElement webElement5 = driver.findElement(By.cssSelector("li.s-header-item--right"));
        webElement1.click();

        WebElement webElement6 = driver.findElement(By.cssSelector("li.s-header-sub-list-item__link--logout"));
        webElement1.click();*/


        //driver.quit();
    }
}
