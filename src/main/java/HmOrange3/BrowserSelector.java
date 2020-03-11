package HmOrange3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {


    public void openBrowser () {

        LoadProp loadProp = new LoadProp();
        String browser = "chrome";


        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            //object created from chrome driver
            driver = new ChromeDriver();

            driver.manage().window().fullscreen();
            // add implicitly wait
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers/");

        } else if (browser.equalsIgnoreCase(("Firefox"))) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase(("Edge"))) {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new EdgeDriver();
        }

    }
    public void closeBrowser()
    {
        driver.quit();
    }

}



