package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	//Page Factory - OR:
			@FindBy(xpath="//td[contains(text(),'User: Vrushali SONJE')]")
			@CacheLookup
			WebElement userNameLabel;
			
			@FindBy(xpath="//a[contains(text(),'Contacts')]")
			WebElement ContactsLinks;
			
			@FindBy(xpath = "//a[contains(text(),'New Contact')]")
			WebElement newContactLink;
			
			@FindBy(xpath="//a[contains(text(),'Deals')]")
			WebElement DealsLinks;
			
			@FindBy(xpath="//a[contains(text(),'Tasks')]")
			WebElement TasksLink;
			
			public HomePage() {
				PageFactory.initElements(driver, this);
			}
			public String verifyHomePageTitle() {
				return driver.getTitle();
			}
			public boolean verifyCorrectUserName() {
				return userNameLabel.isDisplayed();
			}
			public ContactsPage clickOnContactsLink(){
				ContactsLinks.click();
				return new ContactsPage();
			}
			
			public DealsPage clickOnDealsLink(){
				DealsLinks.click();
				return new DealsPage();
			}
			
			public TasksPage clickOnTasksLink(){
				TasksLink.click();
				return new TasksPage();
			}
			
			public void clickOnNewContactLink(){
				Actions action = new Actions(driver);
				action.moveToElement(ContactsLinks).build().perform();
				newContactLink.click();
				
			}
}
