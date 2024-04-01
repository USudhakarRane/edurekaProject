package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebActions;

public class DemoLogin {

	RemoteWebDriver driver;
	
	public DemoLogin(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//Element locators:
	By LinkHomePage=By.id("nava");
	By LinkSignUpButton=By.id("signin2");
	By LinkSignUpPopup=By.id("signInModal");
	By Username=By.id("sign-username");
	By Password=By.id("sign-password");
	By BtnSignUp=By.xpath("//button[text()='Sign up']");
	
	
	//Page Functionality:
	public boolean isHomePageDisplayed() {
		return driver.findElement(LinkHomePage).isDisplayed();	
	}
	
	public void clickOnSignUpButton() {
		driver.findElement(LinkSignUpButton).click();
	}
	
	public boolean isSignUpPopupDisplayed() {
		return driver.findElement(LinkSignUpPopup).isDisplayed();
	}
	
	/*
	 * public void enterUsername(String username) { WebDriverWait wait=new
	 * WebDriverWait(driver, Duration.ofSeconds(10));
	 * wait.until(ExpectedConditions.elementToBeClickable(Username));
	 * driver.findElement(Username).sendKeys(username); }
	 * 
	 * public void enterPassword(String password) { WebDriverWait wait=new
	 * WebDriverWait(driver, Duration.ofSeconds(10));
	 * wait.until(ExpectedConditions.elementToBeClickable(Password));
	 * driver.findElement(Password).sendKeys(password); }
	 */
	
	public void login(String username,String password) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Username));
		WebActions.setText(driver, Username, username);
		WebActions.setText(driver, Password, password);
		//driver.findElement(Username).sendKeys(username);
		//driver.findElement(Password).sendKeys(password);
		WebActions.click(driver, BtnSignUp);
	}
	
	public void clickOnBtn() {
		driver.findElement(BtnSignUp).click();
	}
}
