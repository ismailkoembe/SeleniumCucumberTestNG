package pages;

import Utilities.Driver;
import Utilities.Environments;
import Utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import stepDefinitions.Hooks;

import java.time.Duration;

/**
 * @author Ismail Koembe
 */
@Slf4j
/**
 *
 */
public abstract class BasePage extends Hooks {
    public BasePage() {
        PageFactory.initElements(Driver.get(env), this);
    }


    public void clickWithWait(WebElement element){
        long start = System.currentTimeMillis();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        log.info("Clicked in {}ms", System.currentTimeMillis() - start);
    }


    public void sleep(int millisec) throws InterruptedException {
        Thread.sleep(millisec);
    }

    public void sendKey(WebElement element, String input){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(input);
    }

    public boolean isDisplayed(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
