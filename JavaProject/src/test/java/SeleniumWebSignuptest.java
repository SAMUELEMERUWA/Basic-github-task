import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 *
 *
 */


public class SeleniumWebSignuptest {

    //import the selenium WebDriver
    private WebDriver driver;

    @Test(priority = 0)
    public void negativesignup() throws InterruptedException {
        //Test3 verify that user cannot signup with username less than 3 characters
            //5. input your username on the username field
            driver.findElement(By.id("user_username")).sendKeys("ss");
            //6. locate the email address field and input your email on the email field
            driver.findElement(By.id("user_email")).sendKeys("bl9olllonttoasaKOOL1@gmail.com");
            //7. locate your password field and input your password on the password field
            driver.findElement(By.id("user_password")).sendKeys("Omobaba1");
            //8. click on the signup button
            driver.findElement(By.id("submit")).click();
            Thread.sleep(5000);
}
    @Test(priority = 1)
    public void positivesignup() throws InterruptedException {
        //Locate where the ChromeDriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1.open your chrome browser
        driver = new ChromeDriver();
        //2. Input your selenium Demo page URL (https://selenium-blog.herokuapp.com/)
        driver.get("https://selenium-blog.herokuapp.com");
        //Test1 verify the user input the right url and his on the right webpage
        if(driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com"))
            //pass
            System.out.println("correct webpage");
        else
            //fail
            System.out.println("wrong webpage");
        Thread.sleep(5000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. click on signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }

    @BeforeTest
    public void start() throws InterruptedException {
        //Locate where the ChromeDriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1.open your chrome browser
        driver = new ChromeDriver();
        //2. Input your selenium Demo page URL (https://selenium-blog.herokuapp.com/)
        driver.get("https://selenium-blog.herokuapp.com");
        //Test1 verify the user input the right url and his on the right webpage
        if(driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com"))
            //pass
            System.out.println("correct webpage");
        else
            //fail
            System.out.println("wrong webpage");
        Thread.sleep(5000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. click on signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void clickmeaghan() throws InterruptedException {
        //9. click on meaghan item on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //test2. verify that when user clicks on the signup button, the user is directed to the signup page
        String expectedurl = "https://selenium-blog.herokuapp.com/signup";
        String actualurl = driver.getCurrentUrl();
                if(actualurl.contains(expectedurl))
                    //pass
                    System.out.println("Correct Webpage");
                else
                    //fail
                    System.out.println("Wrong Webpage");
        Thread.sleep(5000);
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        //12. Quit the browser
        driver.quit();
        //Test3 verify that user cannot signup with username less than 3 characters
        //5. input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("samksis");
        //6. locate the email address field and input your email on the email field
        driver.findElement(By.id("user_email")).sendKeys("gbajaaKOOL1@gmail.com");
        //7. locate your password field and input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("Omobaba1");
        //8. click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 4)
    public void verifyitem() throws InterruptedException {
            //10. search for an item (using Python with selenium) and confirm if it is present
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]")).click();
            //Test 9 verify that the item searched for on the meaghan page is present
            String expectedpageUrl = "https://selenium-blog.herokuapp.com/users/1";
            String actualpageUrl = driver.getCurrentUrl();
            if(actualpageUrl.contains(expectedpageUrl))
                //pass
                System.out.println("correct meaghanpage");
            else
                //fail
                System.out.println("wrong meaghanpage");
            Thread.sleep(5000);
        }

    @Test(priority = 4)
    public void logoutsucessfully() throws InterruptedException {
            //11. click on logout
                //Test 10 verify that when the user logout he or she is directed back to the home page
                driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
                String expectedTitle = "AlphaBlog";
                String actualTitle = driver.getTitle();
                if(actualTitle.contains(expectedTitle))
                    //pass
                    System.out.println("Correct meaghanpage");
                else
                    //fail
                    System.out.println("Wrong meaghanpage");
                Thread.sleep(5000);
}

@AfterTest
public void closewindow() {
            //12. Quit the browser
            driver.quit();
        }
    }
