package com.verizon.ui.login.step_def;

import com.verizon.ui.login.pages.Verizon_Pages;
import com.verizon.ui.login.utilities.BrowserUtils;
import com.verizon.ui.login.utilities.ConfigurationReader;
import com.verizon.ui.login.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

public class Verizon_Step_Def {
    Verizon_Pages verizon_pages = new Verizon_Pages();

    String price = "39.58";//we stored the price inside the string

    @Given("user on the verizonwireless.com")
    public void user_on_the_verizonwireless_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user hoverover on the phones")
    public void user_hoverover_on_the_phones() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        BrowserUtils.hover(verizon_pages.phonesHoverOver);

    }

    @Then("clicks the smartphones")
    public void clicks_the_smartphones() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        verizon_pages.smartPhones.click();

    }

    @Given("clicks the phone")
    public void clicks_the_phone() throws InterruptedException {
        //Assert.assertTrue(verizon_pages.samsungNote10Price.isDisplayed());
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // BrowserUtils.waitForClickablility(verizon_pages.samsungNote10,500).click();

        verizon_pages.samsungNote10.click();
    }

//77477

    @Then("user choose the Auro glow colour")
    public void user_choose_the_Auro_glow_colour() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //   BrowserUtils.waitForClickablility(verizon_pages.colour,3).click();
        verizon_pages.colour.click();

    }

    @Then("user clicks the continue button")
    public void user_clicks_the_continue_button() {
        // BrowserUtils.waitForClickablility(verizon_pages.continueButton,3).click();

        //  verizon_pages.continueButton.click();
    }

    @Then("user enter the zipcode")
    public void user_enter_the_zipcode() {

    }

    @Then("user verify the price")
    public void user_verify_the_price() {

    }


    //  @Given("user choose the white colour ");
//    public void user_choose_the_white_colour_and_verify_the_payment_options() throws InterruptedException {
//        WebElement colour = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//div[style='background-color: rgb(255, 255, 255);']")));
//        colour.click();
//        Assert.assertTrue(verizon_pages.payment.isDisplayed());
//    }
//
//    @Given("user clicks the continue")
//    public void user_clicks_the_continue() {
//        verizon_pages.continueButton.click();
//    }
//
//    @Given("user enter the zipcode")
//    public void user_enter_the_zipcode() {
//
//    }


}
