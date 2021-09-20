package ProjectLogin;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceStDe {

    FacebPgOj mainClass = new FacebPgOj();

    @Before
    public void launchBrowser() {

        BrowserLaunch.getDriver();
    }
    @Given("Launch the chrome browser and facebook URL")
    public void launch_the_chrome_browser_and_facebook_url() {

        mainClass.launchUrl();
    }
    @When("Enter the valid username and password")
    public void enter_the_valid_username_and_password() {

        mainClass.userCred();
    }
    @Then("Validate the user credentials")
    public void validate_the_user_credentials() {

        mainClass.validUser();
    }
    @Then("Close the browser")
    public void close_the_browser() {

        mainClass.closebrowser();
    }

}