package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//div[@class='sch']/input[@placeholder='Where do you want to go?']")
    private WebElement whereToInputPlaceHolder;

    /*@FindBy(how = How.CLASS_NAME, using = "autocomplete-field")
    private WebElement whereToInput;*/

    @FindBy(how = How.CSS, using = "input.autocomplete-field")
    private WebElement whereToInput;

    public WebElement getWhereToInputPlaceHolder() {
        return whereToInputPlaceHolder;
    }

    public void setWhereToInputPlaceHolder(WebElement whereToInputPlaceHolder) {
        this.whereToInputPlaceHolder = whereToInputPlaceHolder;
    }

    public WebElement getWhereToInput() {
        return whereToInput;
    }

    public void setWhereToInput(WebElement whereToInput) {
        this.whereToInput = whereToInput;
    }
}
