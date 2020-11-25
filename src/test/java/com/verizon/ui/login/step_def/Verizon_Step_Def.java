package com.verizon.ui.login.step_def;

import com.verizon.ui.login.pages.Verizon_Pages;
import com.verizon.ui.login.utilities.BrowserUtils;
import com.verizon.ui.login.utilities.ConfigurationReader;
import com.verizon.ui.login.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        BrowserUtils.hover(verizon_pages.shopHoverOver);

    }

    @Then("clicks the smartphones")
    public void clicks_the_smartphones() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        verizon_pages.smartPhones.click();

    }


    @Then("user choose the galaksi note{int}+")
    public void user_choose_the_galaksi_note(Integer int1) {
        //Assert.assertTrue(verizon_pages.samsungNote10Price.isDisplayed());
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // BrowserUtils.waitForClickablility(verizon_pages.samsungNote10,500).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='Samsung Galaxy Note10+']"))).click();

    }

//77477

    @Then("user clicks the continue button")
    public void user_clicks_the_continue_button() {
        // BrowserUtils.waitForClickablility(verizon_pages.continueButton,3).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        verizon_pages.continueButton.click();
    }

    @Then("user enter the zipcode")
    public void user_enter_the_zipcode() {

       verizon_pages.zipcode.clear();
       verizon_pages.zipcode.sendKeys("77477"+ Keys.ENTER);

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
