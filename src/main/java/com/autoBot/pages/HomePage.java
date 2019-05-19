package com.autoBot.pages;

import org.openqa.selenium.WebElement;


import com.autoBot.testng.api.base.Annotations;




public class HomePage extends Annotations{ 

	/*public HomePage() {
       PageFactory.initElements(driver, this);
	} 
*/
//	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	public  Myhomep Clickcrm() {
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		/*HomePage hp = new HomePage();
		return hp;*/
		
		return new Myhomep();
	}

	
	
	
	public LoginPage clickLogout() {
		WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);  
		return new LoginPage();
	}

}







