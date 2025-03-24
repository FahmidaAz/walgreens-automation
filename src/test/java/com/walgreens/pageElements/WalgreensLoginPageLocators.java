package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensLoginPageLocators {

	//Email Id Field
	@FindBy(xpath="//input[@id = 'user_name']")
	public WebElement email;


	//Password  Field
	@FindBy(xpath="//input[@id = 'user_password']")
	public WebElement password;


	//Signin Button
	@FindBy(xpath="//button[@id = 'submit_btn']")
	public WebElement signinbtn;

	



}
