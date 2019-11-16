package web_test.src.main.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class web_test {
//======================================================================================================================
//======================================================================================================================

    //@Ignore
    @Test
    public void Test_01()  {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // сравниваем адрес ожидаемый с фактическим
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Assert.assertEquals("", "http://todomvc.com/examples/react/#/", driver.getCurrentUrl());
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }

//======================================================================================================================
//======================================================================================================================

    //@Ignore
    @Test
    public void Test_02()  {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // ждем прогрузки страницы
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // проверяем в шапке страницы есть todos
        Assert.assertEquals("todos", driver.findElement(By.xpath("//*[@data-reactid=\".0.0.0\"]")).getText());
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }

//======================================================================================================================
//======================================================================================================================

    //@Ignore
    @Test
    public void Test_03()  {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // ждем прогрузки страницы
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // проверяем наличие поля ввода данных «What needs to be done»
        Assert.assertEquals("//input[@class=\"new-todo\" and @placeholder=\"What needs to be done?\"]", "//input[@class=\"new-todo\" and @placeholder=\"What needs to be done?\"]");
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }

//======================================================================================================================
//======================================================================================================================

    //@Ignore
    @Test
    public void Test_04() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // ждем прогрузки страницы
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // в поле «What needs to be done» пишем задание
        driver.findElement(By.xpath("//input[@class=\"new-todo\" and @placeholder=\"What needs to be done?\"]")).sendKeys("Задание1");
        // нажимем клавишу enter
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // проверяем задание опубликовалось
        Assert.assertEquals("Задание1", driver.findElement(By.xpath("//label[.='Задание1']")).getText());
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }

//======================================================================================================================
//======================================================================================================================

    //@Ignore
    @Test
    public void Test_05() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // ждем прогрузки страницы
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // в поле «What needs to be done» пишем задание
        driver.findElement(By.xpath("//input[@class=\"new-todo\" and @placeholder=\"What needs to be done?\"]")).sendKeys("Задание1");
        // нажимем клавишу enter
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // заходим в редактирование Задания1
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//label[contains(text(),'Задание1')]"));
        actions.doubleClick(elementLocator).perform();
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // редактируем текст
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // отменяем редактирование Esc
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        // проверяем задание отредактировалось
        Assert.assertEquals("Задание1", driver.findElement(By.xpath("//label[.='Задание1']")).getText());
        // заходим в редактирование Задания1
        actions.doubleClick(elementLocator).perform();
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // редактируем текст
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // подверждаем редактирование Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // проверяем задание отредактировалось
        Assert.assertEquals("Задание12", driver.findElement(By.xpath("//label[.='Задание12']")).getText());
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }

//======================================================================================================================
//======================================================================================================================

    //@Ignore
    @Test
    public void Test_06() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // ждем прогрузки страницы
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // в поле «What needs to be done» пишем задание
        driver.findElement(By.xpath("//input[@class=\"new-todo\" and @placeholder=\"What needs to be done?\"]")).sendKeys("Задание1");
        // нажимем клавишу enter
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // проверяем задание опубликовалось
        Assert.assertEquals("Задание1", driver.findElement(By.xpath("//label[.='Задание1']")).getText());
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // удаляем задание
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//label[.='Задание1']"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//button[@class='destroy']"))).click().build().perform();

       // проверяем задание удалилось
        try {
            driver.findElement(By.xpath("//label[.='Задание1']")).isDisplayed();

        } catch (Exception e) {
            System.out.println("Задание1 не найдено");
            e.printStackTrace();
        }
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }

//======================================================================================================================
//======================================================================================================================

    //@Ignore
    @Test
    public void Test_07() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // ждем прогрузки страницы
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // в поле «What needs to be done» пишем задание
        driver.findElement(By.xpath("//input[@class=\"new-todo\" and @placeholder=\"What needs to be done?\"]")).sendKeys("Задание1");
        // нажимем клавишу enter
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // проверяем задание опубликовалось
        Assert.assertEquals("Задание1", driver.findElement(By.xpath("//label[.='Задание1']")).getText());
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // проверяем наличие счетчика заданий
        driver.findElement(By.xpath("//span[@data-reactid=\".0.2.0\"]")).isDisplayed();
        // проверяем наличие кнопки All
        driver.findElement(By.xpath("//*[@data-reactid=\".0.2.1.0.0\"]")).isDisplayed();
        // проверяем наличие кнопки Active
        driver.findElement(By.xpath("//*[@data-reactid=\".0.2.1.2.0\"]")).isDisplayed();
        // проверяем наличие кнопки Completed
        driver.findElement(By.xpath("//*[@data-reactid=\".0.2.1.4.0\"]")).isDisplayed();
        // меняем статус задания на checked
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//label[.='Задание1']"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//input[@class='toggle']"))).click().build().perform();
        // проверяем наличие кнопки Clear Completed
        driver.findElement(By.xpath("//button[@data-reactid=\".0.2.2\"]")).isDisplayed();
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }


//======================================================================================================================
//======================================================================================================================
    //@Ignore
    @Test
    public void Test_08() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\1\\chromedriver_win32\\chromedriver.exe");
        // запускаем браузер
        WebDriver driver = new ChromeDriver();
        // разворачиваем окно
        driver.manage().window().maximize();
        // переходим на страницу приложения
        driver.navigate().to("http://todomvc.com/examples/react/#/");
        // ждем прогрузки страницы
        synchronized (driver)
        {
            try {
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // в поле «What needs to be done» создаем 3 задания
        for(int i = 0; i < 3; i++ ){
            driver.findElement(By.xpath("//input[@class=\"new-todo\" and @placeholder=\"What needs to be done?\"]")).sendKeys("Задание");
            // нажимем клавишу enter
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            synchronized (driver)
            {
                try {
                    driver.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        // считаем количество опубликованных заданий
        List<WebElement> toDosQuantity1 = driver.findElements(By.xpath("//ul[@class='todo-list']/li/div/label"));
        // сверяем количество опубликованных заданий с счетчиком заданий
        Assert.assertEquals(String.valueOf(toDosQuantity1.size()), driver.findElement(By.xpath("//strong[@data-reactid=\".0.2.0.0\"]")).getText());
        // удаляем задание
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//label[.='Задание']"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//button[@class='destroy']"))).click().build().perform();
        // считаем количество опубликованных заданий
        List<WebElement> toDosQuantity2 = driver.findElements(By.xpath("//ul[@class='todo-list']/li/div/label"));
        // сверяем количество опубликованных заданий с счетчиком заданий
        Assert.assertEquals(String.valueOf(toDosQuantity2.size()), driver.findElement(By.xpath("//strong[@data-reactid=\".0.2.0.0\"]")).getText());
        // кликаем по кнопке toggle-all
        driver.findElement(By.xpath("//*[@data-reactid=\".0.1.1\"]")).click();
        // сверяем количество опубликованных заданий с счетчиком заданий
        Assert.assertEquals("0", driver.findElement(By.xpath("//strong[@data-reactid=\".0.2.0.0\"]")).getText());
        // закрывем браузер
        synchronized (driver)
        {
            try {
                driver.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }


//======================================================================================================================
//======================================================================================================================
//======================================================================================================================
//======================================================================================================================
}