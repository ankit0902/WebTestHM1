package HmOrange3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends Utils {

    HomePage homePage = new HomePage();
    @Given("user is on home page")
    public void userIsOnHomePage() {
    }

    @When("user enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String username, String password) {
        //enter username and password
        homePage.enterUsername(username);
        homePage.enterPassword(password);
    }

    @And("user clicks on Login")
    public void userClicksOnLogin() {
        //click on login button
        homePage.clickOnLogin();

    }

    @Then("user should see {string}")
    public void userShouldSee(String ErrorMessage) {
        //compare result error messege display
        homePage.loginErrorMsg(ErrorMessage);
    }
}
