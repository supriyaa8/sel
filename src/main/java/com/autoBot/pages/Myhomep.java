package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class Myhomep  extends Annotations {

	public  Createlead clickcreate() {
		WebElement elecreatleclic = locateElement("link", "Create Lead");
		click(elecreatleclic);
		
		/*HomePage hp = new HomePage();
		return hp;*/
		
		return new Createlead();
	}
}
	
	
