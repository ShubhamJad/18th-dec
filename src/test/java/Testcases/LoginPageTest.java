package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage login;
	  
	   @BeforeMethod
	   public void setup() throws IOException  {
		   
		   initalization();
		   login = new LoginPage();
		   
	   }
	   
	   @Test  (enabled = false)
	   public void validateLoginPageTitleTest() {
		   
		  String expZerodhaTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		  String actZerodhaTitle = login.validateLoginPageTitle();
		  Assert.assertEquals(expZerodhaTitle,actZerodhaTitle );
		  Reporter.log("Zerodha Title = " + actZerodhaTitle); 
	   }
		@Test   (enabled = false)
	   public void validateKiteLogoTest() {
	       
		   boolean value = login.validateKiteLogo();
		   Assert.assertEquals(value, true); 
		   Reporter.log("Is kite logo Displayed = " + value); 
		   
		    
		   
	   }
		@Test  (enabled = false)
	   public void  validatezerodhaLogoTest() {
		    boolean value1 = login.validatezerodhaLogo();
		 Assert.assertEquals(value1,true);
		 Reporter.log("Is Zerodha Logo Displayed = " + value1); 
		
		 
	   }
		@Test  
	   public void loginZerodhaAccountTest() throws InterruptedException, EncryptedDocumentException, IOException  {
		 
		   login.loginZerodhaAcc();
		   
	  }
	   
	  
	   @AfterMethod
	   public void exit()  {
		 
		   driver.close();
		  
		 
		  
	   }
	
}
