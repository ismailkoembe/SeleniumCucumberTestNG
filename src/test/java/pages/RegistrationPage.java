package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class RegistrationPage extends BasePage {

    @FindBy(id = "firstPassword")
    public WebElement newPassword;

    @FindBy (id= "secondPassword")
    public WebElement passwordConfirm;

    @FindBy (id="strengthBar")
    public WebElement strengthBar;

    @FindBy (xpath = "(//li[@class='point'])[1]")
    public WebElement strengthBar1;

    @FindBy (xpath = "(//li[@class='point'])[2]")
    public WebElement strengthBar2;

    @FindBy (xpath = "(//li[@class='point'])[3]")
    public WebElement strengthBar3;

    @FindBy (xpath = "(//li[@class='point'])[4]")
    public WebElement strengthBar4;

    @FindBy (xpath = "(//li[@class='point'])[5]")
    public WebElement strengthBar5;

    public RegistrationPage(){
        PageFactory.initElements(driver, this);
    }
}
