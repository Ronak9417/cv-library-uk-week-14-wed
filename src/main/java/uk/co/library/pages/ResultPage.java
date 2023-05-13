package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

@Listeners(CustomListeners.class)
public class ResultPage extends Utility {

    @FindBy(xpath = "//h1")
    WebElement resultText;

    public boolean verifyTheResults(String expected) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Verify the Result" + resultText.toString());
        CustomListeners.test.log(Status.PASS, "Verify the Result" + resultText.toString());
        return resultText.isDisplayed();
    }


}
