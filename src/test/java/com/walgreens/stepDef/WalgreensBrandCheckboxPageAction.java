package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensBrandFilterCheckboxPageActions;

import cucumber.api.java.en.When;

public class WalgreensBrandCheckboxPageAction {
	WalgreensBrandFilterCheckboxPageActions WalgreensBrandFilterCheckboxPageActionsObj = new WalgreensBrandFilterCheckboxPageActions();
	@When("^From Brand section click on \"([^\"]*)\" checkbox$")

	public void from_Brand_section_click_on_checkbox(String arg1) throws Throwable {
		WalgreensBrandFilterCheckboxPageActionsObj.filterWalgreeenBrand();
	}
}
