package com.vtiger.generic.objectreporitory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class p {
	
	@FindBy(xpath="//a[text()='Sign']")
	private WebElement signout;

	public WebElement getSignout() {
		return signout;
	}

}
