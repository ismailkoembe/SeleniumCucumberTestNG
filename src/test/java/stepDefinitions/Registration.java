package stepDefinitions;

import Utilities.PropManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.HomePage;
import pages.RegistrationPage;

/**
 * @author Ismail Koembe
 */
public class Registration {
    private final HomePage homePage = new HomePage();
    private final RegistrationPage registrationPage = new RegistrationPage();

    @Given("Go to home page")
    public void goToHomePage() {
        homePage.driver.get(PropManager.getProperties(homePage.env,"medunna_url"));
    }

    @When("Click Signin button at the top")
    public void click_signin_button_at_the_top() {
        homePage.clickWithWait(homePage.userButton);

    }

    @Then("Click Register button")
    public void click_register_button() {
        homePage.clickWithWait(homePage.homePageDropDownRegisterButton);
    }

    @And("I wait {string} ms")
    public void i_wait_ms(String millisec) throws InterruptedException {
        homePage.sleep(Integer.parseInt(millisec));
    }


    @When("User enters four digit {string}")
    public void userEntersFourDigit(String input) {
        homePage.sendKey(registrationPage.newPassword, input);
    }

    @Then("Assert that Password strength line is in the first line")
    public void assertThatPasswordStrengthLineIsInTheFirstLine() {
        Assert.assertTrue(homePage.isDisplayed(registrationPage.strengthBar1));
    }

}
