package com.verizon.ui.login.pages;

import com.verizon.ui.login.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verizon_Pages {
    public Verizon_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id= "gnav20-Shop-L1")
    public WebElement shopHoverOver;

    @FindBy(partialLinkText = "Smartphones")
    public WebElement smartPhones;


    @FindBy(xpath = "//div[text()='$39.58/mo']")
    public WebElement price;

    //    @FindBy(xpath = "//a[contains(@id,'thirdLevel00')]")
//    public WebElement smartPhones;
   // @FindBy(xpath = "//div[@id=\"tile_dev12240064\"]//div[@class='NHaasTX75Bd marginBottom5']//span")
    @FindBy(xpath = "(//img[@aria-hidden='true'])[14]")
    public WebElement samsungNote10;

    @FindBy(xpath = "//div[@class='positionRelative color-swatch-selected borderRadius50 cursorPointer']")
    public WebElement colour;

    @FindBy(id = "ATC-Btn")
    public WebElement continueButton;

    @FindBy(id = "zipcode")
    public WebElement zipcode;


}
