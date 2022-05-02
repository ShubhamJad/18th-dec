package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashPage;
import Pages.LoginPage;

public class DsahPageTest extends TestBase {

	
	LoginPage login;
	DashPage dash;
	
	
	@BeforeMethod 
	
	public void setup() throws EncryptedDocumentException, InterruptedException, IOException {
		
		 initalization();
		 login = new LoginPage();
		 login.loginZerodhaAcc();
		 dash = new DashPage();
		 
		 
	}
	
	
	@Test (enabled = false)
	
	   public void validatenickNameTest() {
		
		dash.validatenickName();
		
	}
   @Test (enabled = false)
   
     public void valiateusernameBoxTest() {
	   
	   dash.valiateusernameBox();
	   
   }

	@Test (enabled =false)
	public void  validateuserFullnameTest() {
		
		dash.validateuserFullname();
		
	}
	
	@Test  (enabled =false)
	
	public void validateuserEmailTest() {
		
		dash.validateuserEmail();
		
	}
	
	@Test 
	
	public void validateOrderIconTest() {
		
		dash.validateOrderIcon();
		
	}
	
    @Test  
 	
	public void buyShareTest() throws InterruptedException, EncryptedDocumentException, IOException {
		
		dash.buyShare();
		
    }
    
    @AfterMethod
	   public void exit()  {
		 
		   driver.close();
		  
		 
		  
	   }
	
	

}
