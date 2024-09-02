package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPage extends BasePage {

    public SelenideElement addButton = $("button[id='addNewRecordButton']");
    public SelenideElement firstName = $("input#firstName");
    public SelenideElement lastName = $("input#lastName");
    public SelenideElement email = $("input#userEmail");
    public SelenideElement age = $("input#age");
    public SelenideElement salary = $("input#salary");
    public SelenideElement department = $("input#department");

    public SelenideElement recordName = $("div:nth-child(4) > div > div:nth-child(1)");
    public SelenideElement recordLastName = $("div:nth-child(4) > div > div:nth-child(2)");
    public SelenideElement recordEmail = $("div:nth-child(4) > div > div:nth-child(4)");
    public SelenideElement recordAge = $("div:nth-child(4) > div > div:nth-child(3)");
    public SelenideElement recordSalary = $("div:nth-child(4) > div > div:nth-child(5)");
    public SelenideElement recordDepartment = $("div:nth-child(4) > div > div:nth-child(6)");
//    public SelenideElement updatedElementName = $("div:nth-child(4) > div > div:nth-child(1)");

    public SelenideElement submitButton = $("button[id='submit']");
    public SelenideElement editButton = $("#edit-record-4");
    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }
}
