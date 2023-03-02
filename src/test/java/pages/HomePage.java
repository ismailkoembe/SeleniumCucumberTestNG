package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class HomePage extends BasePage{
    @FindBy(id = "account-menu")
    public WebElement userButton;

    @FindBy (xpath = "//span[contains(text(),'Register')]")
    public WebElement homePageDropDownRegisterButton;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

}
