package com.verizon.ui.login.pages;

import com.verizon.ui.login.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verizon_Pages {
    //    @FindBy(xpath = "//button[text()='Phones list']")
//    public WebElement phonesHoverOver;
    @FindBy(xpath = "(//a[text()='Smartphones'])[1]")
    public WebElement smartPhones;
    @FindBy(xpath = "(//button[@aria-expanded='false'])[1]")
    public WebElement phonesHoverOver;
    @FindBy(xpath = "//div[text()='$39.58/mo']")
    public WebElement price;

    //    @FindBy(xpath = "//a[contains(@id,'thirdLevel00')]")
//    public WebElement smartPhones;
    @FindBy(xpath = "//div[@id=\"tile_dev12240064\"]//div[@class='NHaasTX75Bd marginBottom5']//span")
    public WebElement samsungNote10;
    @FindBy(xpath = "//div[@style='background-color: rgb(215, 215, 215);']")
    public WebElement colour;
    @FindBy(xpath = "//button[@id='ATC-Btn']")
    public WebElement continueButton;


    public Verizon_Pages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
