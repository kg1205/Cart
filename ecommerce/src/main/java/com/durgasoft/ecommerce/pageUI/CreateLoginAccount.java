package com.durgasoft.ecommerce.pageUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.durgasoft.ecommerce.basepage.basepage;

public class CreateLoginAccount extends basepage{
	@FindBy(linkText = "Sign in")WebElement linkSIgnIN;
	@FindBy(id = "email_create")	WebElement txtEmailID;
	@FindBy(id = "SubmitCreate")WebElement btnCreateAnAccount;
	@FindBy(xpath = "//h1[text()='Create an account']") WebElement txtCreateAnAccount;
}
