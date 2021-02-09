package com.names.steps;

import com.names.pages.ResultPage;
import com.names.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class SearchScenarioSteps {

    SearchPage searchPage;
    ResultPage resultPage;

    @Given("^user opens the site$")
    public void userOpensSite(){
        searchPage.open();
    }

    @Given("^user clicks on input$")
    public void userClicksOnInput(){
        searchPage.searchFieldClick();
    }

    @When("^user (?:searchers for|searches) (.*)$")
    public void userSearchesName(String text){
        searchPage.searchFieldInput(text);
    }

    @When("^user clicks on Search button$")
    public void userClicksSearchButton(){
        searchPage.searchButtonClick();
    }

    @When("^user sees results$")
    public void userSearchesResult(){
        assertTrue(resultPage.valueDisplayInResults());
    }

    @Then("(.*) should be displayed")
    public void resultPageDisplayed(String expectedName){
        String title = resultPage.getTitle();
        assertTrue(title.contains(expectedName));
    }


}
