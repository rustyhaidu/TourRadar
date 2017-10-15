package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    //html/body/main/div[1]/div[2]/div[2]/input
    //div[@class='sch']/div[@class='autocomplete']/input[@class='a autocomplete-field']"
    /*@FindBy(how = How.XPATH, using = "//div[@class='sch']/div[@class='autocomplete']/input[@class='a autocomplete-field']")
    private WebElement whereToInput;*/

    /*@FindBy(how = How.CLASS_NAME, using = "autocomplete-field")
    private WebElement whereToInput;*/

    @FindBy(how = How.CSS, using = "input.autocomplete-field")
    private WebElement whereToInput;

    @FindBy(how = How.XPATH, using="//*[@id='lst-ib']")
    private WebElement googleInput;

    public WebElement getGoogleInput() {
        return googleInput;
    }

    public WebElement getWhereToInput() {
        return whereToInput;
    }

    public void setWhereToInput(WebElement whereToInput) {
        this.whereToInput = whereToInput;
    }
}
