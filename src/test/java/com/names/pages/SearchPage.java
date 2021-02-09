package com.names.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://nameberry.com/")
public class SearchPage extends PageObject {

    @FindBy(css = "form.search-form input[name='q']")
    WebElementFacade searchInput;

    @FindBy(css = "form.search-form g>path")
    WebElementFacade searchButton;

    public void searchFieldInput(String text){
        searchInput.type(text);
    }

    public void searchFieldClick(){
        searchInput.click();
    }

    public void searchButtonClick(){
        searchButton.click();
    }


}
