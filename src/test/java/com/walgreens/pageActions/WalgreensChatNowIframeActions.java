package com.walgreens.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walgreens.pageElements.WalgreensChatNowIframeLocators;

import groovy.time.Duration;
import walgreens.utilities.SetupDrivers;

public class WalgreensChatNowIframeActions {
	
	WalgreensChatNowIframeLocators WalgreensChatNowIframeLocatorsObj;
	
	public WalgreensChatNowIframeActions(){
		WalgreensChatNowIframeLocatorsObj = new WalgreensChatNowIframeLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensChatNowIframeLocatorsObj);
	}
	
	public void loadPage(){
		SetupDrivers.driver.get("https://www.walgreens.com/login.jsp?ru=%2Fsearch%2Fresults.jsp");
	}
	
	public void clickChatNowLink(){
		WalgreensChatNowIframeLocatorsObj.chatnow.click();
	}
	
	public void switchiframe(){
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='inqChatStage']")));
		
		
	}
	
	public void enterText(String greeting) throws Exception{
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 10);
		WebElement chatInput = wait.until(ExpectedConditions.elementToBeClickable(WalgreensChatNowIframeLocatorsObj.chatnowtxtarea));
		Thread.sleep(2000);
		WalgreensChatNowIframeLocatorsObj.chatnowtxtarea.sendKeys(greeting);
	}
	public void clickSubmitButton() throws Exception{
		
		WalgreensChatNowIframeLocatorsObj.chatnowsubmitbtn.click();
		Thread.sleep(2000);
	}
}
