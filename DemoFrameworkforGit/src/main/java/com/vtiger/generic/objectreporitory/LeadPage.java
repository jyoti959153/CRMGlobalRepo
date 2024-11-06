package com.vtiger.generic.objectreporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {

WebDriver driver;
	
	public LeadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadLink2;
	
	public WebElement getLeadLink2() {
		return leadLink2;
	}

	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}

	@FindBy(xpath="//img[@alt=\"Create Lead...\"]")
	private WebElement createLeadIcon;
}
