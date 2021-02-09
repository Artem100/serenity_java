package com.names.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject {

    @FindBy(css = "a[href='/babyname/Mike']")
    WebElementFacade result;

    public boolean valueDisplayInResults(){
        result.waitUntilVisible();
        return result.isDisabled();
    }
}
