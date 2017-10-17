package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//div[@class='sch']/input[@placeholder='Where do you want to go?']")
    private WebElement whereToInputPlaceHolder;

    @FindBy(how = How.CLASS_NAME, using = "autocomplete-field")
    private WebElement whereToInputClass;

    @FindBy(how = How.CSS, using = "input.a")
    private WebElement whereToInputAnchor;

    @FindBy(how = How.CSS, using = "input.autocomplete-field")
    private WebElement whereToInputCSS;

    public WebElement getWhereToInputPlaceHolder() {
        return whereToInputPlaceHolder;
    }

    public void setWhereToInputPlaceHolder(WebElement whereToInputPlaceHolder) {
        this.whereToInputPlaceHolder = whereToInputPlaceHolder;
    }

    public WebElement getWhereToInputAnchor() {
        return whereToInputAnchor;
    }

    public void setWhereToInputAnchor(WebElement whereToInputAnchor) {
        this.whereToInputAnchor = whereToInputAnchor;
    }

    public WebElement getWhereToInputCSS() {
        return whereToInputCSS;
    }

    public WebElement getWhereToInputClass() {
        return whereToInputClass;
    }
}
