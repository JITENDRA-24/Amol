package Module1_Login;
//pom class 2


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PBMobNumPage
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;
	@FindBy(xpath="(//img[contains(@class,'ce')])[2]") private WebElement country;
	@FindBy(xpath="//ul[@id='central-login-country-list']/li//span[text()='SPAIN']") private WebElement spain;
	
	private WebDriver driver;
   private WebDriverWait wait;
	
	public PBMobNumPage(WebDriver driver)
	{
		this.driver = driver;
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		PageFactory.initElements(driver, this);
	}
	                 
	public void selectCountryCode() throws InterruptedException {
		country.click();
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",spain);
		wait.until(ExpectedConditions.elementToBeClickable(spain));
		Thread.sleep(1000);
		spain.click();
	}
	
	public void inpPBMobNumPageMobNum(String mobileNum)
	{
		mobNum.sendKeys(mobileNum);
	}
	
	public void clickPBMobNumPageSignInWithPwd() 
	{
		signInWithPwd.click();
	}
}
