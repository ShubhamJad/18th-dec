package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashPage extends TestBase {


	@FindBy(xpath="//span[@class='nickname']")
	private WebElement nickName;
	
	@FindBy(xpath="//span[@class='user-id']")  
	public WebElement usernameBox;
	
	@FindBy(xpath="//h4[text()='Shubham Anant Jadhav']")
	private WebElement userFullname;
	
	@FindBy(xpath="//div[@class='email']")
	private WebElement userEmail;
	
	@FindBy(xpath="//button[@type=\"button\"]")
	private WebElement getStartedButton ;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement closeButton;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement searchBox;
	
    @FindBy (xpath = "//li[@class='search-result-item selected']")
    private WebElement TTMLShare;
	
	@FindBy(xpath = "//a[@href='/orders']") 
	private WebElement orderIcon;
	
	@FindBy (xpath = "(//input[@type='number'])[1]")
	private WebElement qtyBox;
	
	@FindBy (xpath = "(//button[@class='button-outline button-blue'])[2]")
	private WebElement buyButton;

	@FindBy (xpath = "(//input[@type='number'])[2]")
	private WebElement priceBox;
	
	@FindBy (xpath ="//button[@type='submit']")
	private WebElement buyButton1;
	
	public DashPage() {
		
		PageFactory.initElements(driver, this);
		 
	}
	
	public String validatenickName() {
		
		return nickName.getText();
		

	}
	
	public String valiateusernameBox() {
		
		return usernameBox.getText();
		
		
	}
	
	
	public String validateuserFullname() {
		
		return userFullname.getText();
		
		
	}
	
	public String validateuserEmail() {
		
		return userEmail.getText() ;
		
		
	}
	
	public void validateOrderIcon() {
		
		orderIcon.click();
		
	}
	
	public void buyShare() throws InterruptedException, EncryptedDocumentException, IOException   {
		
		getStartedButton.click();
		Thread.sleep(5000);
		searchBox.sendKeys(Utility.Util.readExcel(0, 0));
		Thread.sleep(5000);
		TTMLShare.click();
		Thread.sleep(3000);
		buyButton.click();
		Thread.sleep(2000);
		qtyBox.clear();
		Thread.sleep(3000);
		qtyBox.sendKeys(Utility.Util.readExcel(1, 0));
		Thread.sleep(2000);
		priceBox.clear();
		Thread.sleep(2000);
		priceBox.sendKeys(Utility.Util.readExcel(2, 0));
		Thread.sleep(3000);
		buyButton1.click();
		Thread.sleep(5000);
		
		
	}
	
}
