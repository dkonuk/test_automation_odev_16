package steps;

import common.Context;
import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTableSteps  {
    PageManager pageManager = new PageManager();

    @When("Insert a new record to Web Table")
    public void insertANewRecordToWebTable() {
        pageManager.webTablesPage.addButton.click();
        pageManager.webTablesPage.firstName.setValue("John");
        pageManager.webTablesPage.lastName.setValue("Doe");
        pageManager.webTablesPage.email.setValue("j6JpW@example.com");
        pageManager.webTablesPage.age.setValue("30");
        pageManager.webTablesPage.salary.setValue("5000");
        pageManager.webTablesPage.department.setValue("IT");
        pageManager.webTablesPage.submitButton.click();
    }
    @Then("New Record Added to Web Table")
    public void checkTheNewRecordInWebTable() {
        assertThat(pageManager.webTablesPage.recordName.getText()).isEqualTo("John");
        assertThat(pageManager.webTablesPage.recordLastName.getText()).isEqualTo("Doe");
        assertThat(pageManager.webTablesPage.recordEmail.getText()).isEqualTo("j6JpW@example.com");
        assertThat(pageManager.webTablesPage.recordAge.getText()).isEqualTo("30");
        assertThat(pageManager.webTablesPage.recordSalary.getText()).isEqualTo("5000");
        assertThat(pageManager.webTablesPage.recordDepartment.getText()).isEqualTo("IT");

    }

    @Then("Update the record in Web Table")
    public void updateTheRecordInWebTable() {
        pageManager.webTablesPage.editButton.click();
        pageManager.webTablesPage.firstName.setValue("Jane");
        pageManager.webTablesPage.lastName.setValue("Doe");
        pageManager.webTablesPage.email.setValue("j6JpW@example.com");
        pageManager.webTablesPage.age.setValue("30");
        pageManager.webTablesPage.salary.setValue("5000");
        pageManager.webTablesPage.department.setValue("IT");
        pageManager.webTablesPage.submitButton.click();
    }
    @Then("Record Updated in Web Table")
    public void checkTheUpdatedRecordInWebTable() {
        assertThat(pageManager.webTablesPage.recordName.getText()).isEqualTo("Jane");
        assertThat(pageManager.webTablesPage.recordLastName.getText()).isEqualTo("Doe");
        assertThat(pageManager.webTablesPage.recordEmail.getText()).isEqualTo("j6JpW@example.com");
        assertThat(pageManager.webTablesPage.recordAge.getText()).isEqualTo("30");
        assertThat(pageManager.webTablesPage.recordSalary.getText()).isEqualTo("5000");
        assertThat(pageManager.webTablesPage.recordDepartment.getText()).isEqualTo("IT");
    }
}
