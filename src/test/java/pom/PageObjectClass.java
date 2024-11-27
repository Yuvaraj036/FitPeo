package pom;


import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.BaseClass;


public class PageObjectClass extends BaseClass {
	
	WebDriver driver;
	
	public PageObjectClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//button[@aria-label=\"open drawer\"]")
	private WebElement menuBar;
	
	
	@FindBy(xpath="//span[text()=\"Revenue Calculator\"]")
	private WebElement revenuecalculator;
	
	@FindBy(xpath="//input[@type='range']")
	private WebElement sliderBox;
	
	@FindBy(xpath="//input[@id=\":R57alklff9da:\"]")
	private WebElement inputBox;
	
	@FindBy(xpath="//span[text()=\"57\"]")
	private WebElement checkBox1;
	
	@FindBy(xpath="//span[text()=\"19.19\"]")
	private WebElement checkBox2;
	
	@FindBy(xpath="//span[text()=\"63\"]")
	private WebElement checkBox3;
	
	@FindBy(xpath="//span[text()=\"15\"]")
	private WebElement checkBox4;
	
	@FindBy(xpath="(//p[@class=\"MuiTypography-root MuiTypography-body1 inter css-12bch19\"])[3]")
	private WebElement totalRecurring;
	
	
	public void getmenuBar()
	{
		menuBar.click();
	}
	
	
	public void getRevenueCalculator()
	{
		revenuecalculator.click();
	}
	
	
	public void getSlider()
	{
		int sliderValue=620;
		for(int i=0;i<sliderValue;i++)
		{
			sliderBox.sendKeys(Keys.ARROW_UP);
			
		}
	}
	
	
	public void getInputBox() throws Exception
	{
		inputBox.clear();
		Thread.sleep(5000);
		int inputFieldvalue=260;
		for(int i=0;i<inputFieldvalue;i++)
		{
			sliderBox.sendKeys(Keys.ARROW_DOWN);
			
		}
		
		String expectedvalue="560";
		String actualValue=inputBox.getAttribute("value");
		Assert.assertEquals(actualValue, expectedvalue);
		
	}
	
	
	public void getCPTCode()
	{
		
		checkBox1.click();
		checkBox2.click();
		checkBox3.click();
		checkBox4.click();
	}
	

	public void getTotalRR()
	{
		
		int sliderValue=260;
		for(int i=0;i<sliderValue;i++)
		{
			sliderBox.sendKeys(Keys.ARROW_UP);
			
		}
		
		String expectedvalue="$110700";
		String actualValue = totalRecurring.getText();
		Assert.assertEquals(actualValue, expectedvalue);
		
	}



}
