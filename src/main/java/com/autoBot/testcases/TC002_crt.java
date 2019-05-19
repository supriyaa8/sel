package com.autoBot.testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.pages.Createlead;
import com.autoBot.pages.HomePage;
import com.autoBot.pages.LoginPage;
import com.autoBot.pages.Myhomep;
import com.autoBot.testng.api.base.Annotations;

public class TC002_crt extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_crt";
		testcaseDec = "Create Lead";
		author = "supriya";
		category = "smoke";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void Createlead(String Compname, String firstname, String Lastname) {
		new LoginPage()
		.enterUserName("Demosalesmanager")
		.enterPassWord("crmsfa") 
		.clickLogin();
		new HomePage()
		.Clickcrm();
		new Myhomep()
		.clickcreate();
		new Createlead()
		.entercompanyname(Compname)
		.enterfirstname(firstname)
		.enterlastname(Lastname)
		.clickcreatebtn();
		
	}
}