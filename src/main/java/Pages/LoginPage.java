package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	 @FindBy(xpath="//input[@id='userid']")
	  private WebElement userIdTextbox;
	  @FindBy(xpath="//input[@id=\"password\"]")
	  private WebElement passwordTextbox;
	  @FindBy(xpath="//button[@type='submit']")
	  private WebElement loginBtn;
	  @FindBy(xpath="//img[@src='/static/images/kite-logo.svg']")
	  private WebElement kiteLogo;
	  @FindBy(xpath="//img[@src='/static/images/zerodha-logo.svg']")
	  private WebElement zerodhaLogo;
	  @FindBy(xpath="//input[@id='pin']")
	  private WebElement pinTestbox;
	  @FindBy(xpath="//button[@type='submit']")
	  private WebElement pinButton;
	  
	  
	  
	  public LoginPage() {
		  
		
		PageFactory.initElements(driver,this);
		  
	  }
	  
	  public String validateLoginPageTitle() {
		  
		return driver.getTitle();
		  
	  }
	  
	  public boolean validateKiteLogo() {
		  
		  return kiteLogo.isDisplayed();
		  
	  }
	  
	  public boolean validatezerodhaLogo() {
		  
		 return zerodhaLogo.isDisplayed(); 
		  
	  }
	  
	  public void loginZerodhaAcc() throws InterruptedException, EncryptedDocumentException, IOException {
		  
		  userIdTextbox.sendKeys(p.getProperty("USERID"));
		  Thread.sleep(2000);
		  passwordTextbox.sendKeys(p.getProperty("PASSWORD"));
		  Thread.sleep(2000);
		  loginBtn.click(); 
		  Thread.sleep(2000);
		  pinTestbox.sendKeys(p.getProperty("PIN"));
		  Thread.sleep(2000);
		  pinButton.click();
		  
	  
		  
	  }
	
}
