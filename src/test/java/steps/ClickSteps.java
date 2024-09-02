package steps;

import common.Context;
import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class ClickSteps extends BaseTest {

    PageManager pageManager = new PageManager();

    @Given("Open {string} page")
    public void openElementsPage(String link) {
        switch (link) {
            case "elements":
                pageManager.elementsPage.open();
                break;
            case "Web Table":
                pageManager.webTablesPage.open();
                break;
        }

    }

    @When("Click the {string}")
    public void clickTheButtons(String btn) {
        switch (btn) {
            case "Buttons":
                pageManager.elementsPage.buttons.click();
                break;
            case "Click Me":
                pageManager.elementsPage.clickMeButton.click();
                break;
        }
    }

    @Then("Check the Click Message")
    public void checkTheMessage() {
        assertThat(pageManager.elementsPage.clickMessage.getText()).isEqualTo("You have done a dynamic click");
    }
}



