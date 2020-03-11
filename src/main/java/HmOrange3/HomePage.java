package HmOrange3;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _username = By.id("txtUsername");
    private By _password = By.id("txtPassword");
    private By _loginbuttonField = By.xpath("//input[@type=\"submit\"]");
    private By _errorMsgField = By.id("spnMessage");


    public void enterUsername(String username) {

        timeDelay(2);

        driver.findElement(By.id("txtUserName")).sendKeys(username);
    }


    public void enterPassword(String password) {

        timeDelay(2);

        driver.findElement(By.id("divPassword")).sendKeys(password);
    }

    public void clickOnLogin(){clickOnElement(_loginbuttonField);}


    public void loginErrorMsg(String ErrorMessage){

        String expected = ErrorMessage;

        assertTextMessage("",expected,_errorMsgField);
    }


    }




