package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensChatNowIframeLocators {


	//ChatNow Link
	@FindBy(xpath="//div[@class = 'chatbutton']")
	public WebElement chatnow;


	//ChatNow Text Field
	@FindBy(xpath="//textarea[@ld-on-input = 'onInput']")
	public WebElement chatnowtxtarea;

	//ChatNow Submit Button
	@FindBy(xpath="//input[@aria-label= 'Send']")
	public WebElement chatnowsubmitbtn;


	//ChatNow Response
	@FindBy(xpath="(//div[@ld-on-click='onBubbleClick']) [2]")
	public WebElement chatnowresponse;
}
