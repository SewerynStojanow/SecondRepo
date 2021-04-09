package CucuSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends adminarea.core.BaseTest {
    @Given("the Admin is on the Admin Dashboard Page \\(admin-home)")
    public void theAdminIsOnTheAdminDashboardPageAdminHome() {
        setup();
        pages.adminarea.AdminLogin.navigate();
        pages.adminarea.AdminLogin.login("admin", "parola123!");
        pages.adminarea.AdminDashboard.verifyDashboardHeadingText("Dashboard", "Not Logged In!");
    }

    @When("he clicks the <View More> link on the <Total Orders> field")
    public void heClicksTheViewMoreLinkOnTheTotalOrdersField() {
        // Browser.driver.findElement(By.cssSelector(".col-lg-3:nth-of-type(1) a")).click();
        click(By.cssSelector(".col-lg-3:nth-of-type(1) a"));
    }


    @Then("ensure he is redirected to the <Orders> page a.e. <Orders> header is visible")
    public void ensureHeIsRedirectedToTheOrdersPageAEOrdersHeaderIsVisible() {
        Assert.assertEquals("Orders", getElementText(By.cssSelector("h1")));
        quit();
    }


    @When("he clicks the <View More> link on the <Total Sales> field")
    public void heClicksTheViewMoreLinkOnTheTotalSalesField() {
        click(By.cssSelector(".col-lg-3:nth-of-type(2) a"));
    }


    @When("he clicks the <View More> link on the <Total Customers> field")
    public void heClicksTheViewMoreLinkOnTheTotalCustomersField() {
        click(By.cssSelector(".col-lg-3:nth-of-type(3) a"));
    }

    @Then("ensure he is redirected to the <Customers> page a.e. <Customers> header is visible")
    public void ensureHeIsRedirectedToTheCustomersPageAECustomersHeaderIsVisible() {
        Assert.assertEquals("Customers", getElementText(By.cssSelector("h1")));
        quit();
    }

}
