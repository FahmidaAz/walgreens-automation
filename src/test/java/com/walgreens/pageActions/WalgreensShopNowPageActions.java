package com.walgreens.pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.walgreens.pageElements.WalgreensShopNowPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensShopNowPageActions {
	WalgreensShopNowPageLocators WalgreensShopNowPageLocatorsObj;

	public WalgreensShopNowPageActions() {
		WalgreensShopNowPageLocatorsObj = new WalgreensShopNowPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensShopNowPageLocatorsObj);

	}

	public void clickBBChkBx() {
		Actions action = new Actions(SetupDrivers.driver);
		action.click(WalgreensShopNowPageLocatorsObj.bbCreamChkBx).perform();

	}
}
