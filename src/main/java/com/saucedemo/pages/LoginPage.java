package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseSauceDemoPage {
    public LoginPage() {
        super("/");
    }

    private final By usernameLocator = By.xpath("//input[@data-test='username']");
    private final By passwordLocator = By.xpath("//input[@data-test='password']");
    private final By loginButtonLocator = By.xpath("//input[@id='login-button']");
    public By swagLabsTextLocator = By.xpath("//div[@class='app_logo']");

    public void submitLoginForm(String username, String pass) {
        WebElement usernameInput = driver().findElement(usernameLocator);
        usernameInput.sendKeys(username);

        WebElement password = driver().findElement(passwordLocator);
        password.sendKeys(pass);

        WebElement loginButton = driver().findElement(loginButtonLocator);
        loginButton.click();
    }


    public boolean isSwagLabsTextVisible() {
        return driver().findElement(swagLabsTextLocator).isDisplayed();
    }
}