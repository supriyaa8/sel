
package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class Createlead extends Annotations {
	
	public Createlead entercompanyname(String data) {

		WebElement elecompanyname= locateElement("id", "createLeadForm_companyName");
		clearAndType(elecompanyname,data);
		return this;
	}

	public  Createlead enterfirstname(String data) {
		WebElement elefirstname= locateElement("id", "createLeadForm_firstName");
		clearAndType(elefirstname,data);
		return this;
	}
	public  Createlead enterlastname(String data) {
		WebElement elelastname= locateElement("id", "createLeadForm_lastName");
		clearAndType(elelastname,data);	
		return this;
	}
	
	public ViewL clickcreatebtn() {
		WebElement elebutton= locateElement("Class", "smallSubmit");
		click(elebutton);
		return new  ViewL();
	}




}
