package lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum WebDriverType {
    CHROME {
        public WebDriver create(){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
    },
    IE {
        public WebDriver create(){
            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability("ignoreZoomSetting", true);
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver(caps);
        }
    },
    FIREFOX {
        public WebDriver create() {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
    };

    public WebDriver create(){
        return null;
    }
}