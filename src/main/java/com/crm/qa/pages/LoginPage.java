package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	  
	   
		//Page Factory - OR:
		@FindBy(xpath="//input[@placeholder='Username']")
		WebElement Username;
	    
		//Page Factory - OR:
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement Password;

		@FindBy(xpath="//input[@type='submit']")
		WebElement loginBtn;
		
		//Page Factory - OR:
		@FindBy(xpath="//a[contains(text(),'Sign Up')]")
		WebElement signUpBtn;
		
		@FindBy(xpath="(//img[@class='img-responsive'])[1]")
		WebElement crmLogo;
		
		//Initiallizing the page objects
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		public String validateLoginPageTitle() {
			System.out.println(driver.getTitle());
			return driver.getTitle();
		}
		
		public boolean validateCRMImage(){
			return crmLogo.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
			Username.sendKeys(un);
			Password.sendKeys(pwd);
			loginBtn.click();
			    //	JavascriptExecutor js = (JavascriptExecutor)driver;
			    //	js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
		}
}
