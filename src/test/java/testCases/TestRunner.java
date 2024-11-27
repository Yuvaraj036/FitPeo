package testCases;



import org.testng.annotations.Test;

import baseClass.BaseClass;

import pom.PageObjectClass;

public class TestRunner extends BaseClass {
	
	
	
	
	PageObjectClass page=new PageObjectClass(driver);
	
	
	@Test(priority=0)
	public void homePage()
	{
		
		PageObjectClass page=new PageObjectClass(driver);
		//Navigate to the HomePage
		page.getmenuBar();
		//Navigate to the RevenueCalculatorPage
		page.getRevenueCalculator();
	}
	
	@Test(priority=1)
	public void sliderBarvalue()
	{
		PageObjectClass page=new PageObjectClass(driver);
		//Adjust the Slider
		page.getSlider();
	}
	
	@Test(priority=2)
	public void inputFieldValue() throws Exception
	{
		PageObjectClass page=new PageObjectClass(driver);
		//Update the TextField and Validate the Slider Value
		page.getInputBox();
	}
	
	@Test(priority=3)
	public void getCheckBoxes()
	{
		PageObjectClass page=new PageObjectClass(driver);
		//Select CPT Codes
		page.getCPTCode();
	}

	@Test(priority=4)
	public void validateRecurringReimbursement()
	{
		PageObjectClass page=new PageObjectClass(driver);
		//Validate the Total Recurring Reimbursement
		page.getTotalRR();
	}
}
