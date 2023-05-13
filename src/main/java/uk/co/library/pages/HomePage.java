package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement keywords;
    @FindBy(xpath = "//input[@id='location']")
    WebElement loc;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropdown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitel(String jobTitle) throws InterruptedException {
        Reporter.log("Enter Job title" + keywords.toString());
        CustomListeners.test.log(Status.PASS, "Enter Job title" + keywords.toString());
        Thread.sleep(1000);
        sendTextToElement(keywords, jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter Location" + loc.toString());
        CustomListeners.test.log(Status.PASS, "Enter Location" + loc.toString());
        sendTextToElement(loc, location);
    }

    public void selectDistance(String distance) throws InterruptedException {
        Reporter.log("Select Distance" + distanceDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Select Distance" + distanceDropdown.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(distanceDropdown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on more search options" + moreSearchOptionLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on more search options" + moreSearchOptionLink.toString());
        clickOnElement(moreSearchOptionLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter Minimum salary" + salaryMin.toString());
        CustomListeners.test.log(Status.PASS, "Enter Minimum salary" + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter Maximum salary" + salaryMax.toString());
        CustomListeners.test.log(Status.PASS, "Enter Maximum salary" + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select salary type from dropdown" + salaryTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select salary type from dropdown" + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Select job type" + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select job type" + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        Reporter.log("Click on find jobs button" + findJobsBtn.toString());
        CustomListeners.test.log(Status.PASS, "Click on find jobs button" + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
    }

    public void accpetCookies() throws InterruptedException {
        switchToFrame("gdpr-consent-notice");
        Thread.sleep(1000);
        clickOnElement(acceptCookies);
        switchToDefaultContent();
    }

}
