package com.orggroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoJoFb1  extends Grouptest1{
	public PoJoFb1() {
		PageFactory.initElements(driver,this);
		
	}	
	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	@FindBy(id = "email")
	private WebElement txtusername;
	
	@FindBy(id = "pass")
	private WebElement txtpass;
	
	@FindBy(name = "login")
	private WebElement btnlogin;


}
