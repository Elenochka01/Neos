import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Neos {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oea16\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.neosconsulting.com/");
        driver.manage().window().maximize();
        System.out.println("Open Website");

        Thread.sleep(3000);
        WebElement joinOurTeam = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(joinOurTeam).perform();

        Thread.sleep(3000);
        WebElement carrerOp = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]"));
        carrerOp.click();
        System.out.println("Open Career Opportunities page");

        Thread.sleep(3000);
        joinOurTeam = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/a[1]"));
        actions.moveToElement(joinOurTeam).perform();

        Thread.sleep(3000);
        WebElement sumOfBen = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]"));
        sumOfBen.click();
        System.out.println("Open Summary of Benefits page");

        Thread.sleep(3000);
        WebElement employeeBen = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
        employeeBen.click();
        System.out.println("Open File with benefits");

        Thread.sleep(3000);
        String originalTab = driver.getWindowHandle();

        for (String newTab : driver.getWindowHandles()) {
            if (!newTab.equals(originalTab)) {
                driver.switchTo().window(newTab);
                break;
            }
        }
        Thread.sleep(3000);
        driver.switchTo().window(originalTab);
        System.out.println("Switching back to original window");

        Thread.sleep(3000);
        joinOurTeam = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/a[1]"));
        actions.moveToElement(joinOurTeam).perform();

        Thread.sleep(3000);
        WebElement faq = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]"));
        faq.click();
        System.out.println("Open FAQ Page");

        Thread.sleep(3000);
        driver.quit();

        System.out.println("Test is passed");

    }

}
