package Module1_Login;
//pom class 2


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;
//	@FindBy(xpath="(//img[contains(@class,'ce')])[2]") private WebElement country;
	
//	private WebDriver driver;
 //  private WebDriverWait wait;
	
	public PBMobNumPage(WebDriver driver)
	{
	//	this.driver = driver;
	//	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		PageFactory.initElements(driver, this);
	}
	                 
//	public void selectCountryCode() throws InterruptedException {
//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",country);	
//	//wait.until(ExpectedConditions.elementToBeClickable(country));
//	Thread.sleep(2000);
//	country.click();
//	}
	
	public void inpPBMobNumPageMobNum(String mobileNum)
	{
		mobNum.sendKeys(mobileNum);
	}
	
	public void clickPBMobNumPageSignInWithPwd() 
	{
		signInWithPwd.click();
	}
}
