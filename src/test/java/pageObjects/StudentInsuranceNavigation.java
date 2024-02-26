package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilityMethods.Excel;


public class StudentInsuranceNavigation extends BasePage  {

	//String file = (System.getProperty("user.dir") + "/src/test/resources/Input.xlsx");
	public StudentInsuranceNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	@FindBy(xpath="//*[@class='icon-bg homeIconsBg icon-bg-new ti']") 
	WebElement travelInsurance;
	
	@FindBy(xpath="//input[@type='text']") 
	WebElement searchbar;
	
	@FindBy(xpath="//li[text()='France']") 
	WebElement countrySelect;
	@FindBy(xpath="//button[@class='travel_main_cta']") 
	WebElement next;
	@FindBy(xpath="(//input)[1][@class='MuiInputBase-input MuiOutlinedInput-input']") 
	WebElement startDate;
	@FindBy(xpath="(//input)[2][@class='MuiInputBase-input MuiOutlinedInput-input']") 
	WebElement endDate;
	@FindBy(xpath="//button[@class=\"travel_main_cta\"]") 
	WebElement next2;
	@FindBy(xpath="//label[@for='traveller_2']") 
	WebElement travellers;
	@FindBy(xpath="//div[@id=\"0\"][@class=\"customDropdown \"]") 
	WebElement traveller1;
	@FindBy(xpath="//label[text()='22 years']") 
	WebElement traveller1age;
	@FindBy(xpath="//div[@id=\"1\"][@class=\"customDropdown \"]") 
	WebElement traveller2;
	@FindBy(xpath="//label[text()='21 years']") 
	WebElement traveller2age;
	@FindBy(xpath="//button[@class='travel_main_cta']") 
	WebElement nextbutton;
	@FindBy(xpath="//input[@id='ped_yes']") 
	WebElement selectyes;
	@FindBy(xpath="//input[@id='ped_yes_traveller_0']") 
	WebElement select1;
	@FindBy(xpath="//input[@id='ped_yes_traveller_1']") 
	WebElement select2;
	@FindBy(xpath="//button[@class=\"travel_main_cta\"]") 
	WebElement nxt;
	@FindBy(xpath="//input[@type=\"text\"]") 
	WebElement mobile;
	@FindBy(xpath="//button[@class=\"travel_main_cta\"]") 
	WebElement enter;
	@FindBy(xpath="//input[@id=\"studentTrip\"]") 
	WebElement plan;
	@FindBy(xpath ="//*[@for =\"Traveller_1\"]") 
	WebElement clickingtraveller1;
	@FindBy(css="input#Traveller_2") 
	WebElement clickingtraveller2;
	@FindBy(xpath="//select[@id=\"feet\"]") 
	WebElement duration;
	@FindBy(xpath="//button[@class=\"travel_main_cta\"][text()=\"Apply\"]") 
	WebElement apply;
	//@FindBy(xpath="//div[@class=\"quotesFilters row_wrap zLevel\"]/ul/li[2]") 
	@FindBy(xpath="//p[@class=\"filter_name_heading\"]") 
	WebElement clicksort;
	@FindBy(xpath="//input[@value=\"Premium low to high\"]") 
	WebElement sortprice;
	@FindBy(xpath="//p[@class=\"quotesCard--insurerName\"]") 
	List<WebElement> company;
	@FindBy(xpath="//span[@class=\"premiumPlanPrice\"]") 
	List<WebElement> price;
	
	//Action Methods
	public void clickTravelInsurance()
	{
		JavascriptExecutor js23 = (JavascriptExecutor)driver;
		   js23.executeScript("arguments[0].click()", travelInsurance);
		//travelInsurance.click();
	}
	public void clickCountry() throws IOException
	{
		searchbar.click();
		searchbar.sendKeys(Excel.getcelldata("Sheet1", 1, 0));
	}
	public void clickCountryName()
	{
		//countrySelect.click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].click()", countrySelect);
	}
	public void clickNext1()
	{
		next.click();
	}
	public void EnterStartDate(String futuredate)
	{
		startDate.sendKeys(futuredate);
	}
	public void EnterEndDate(String futuredate2)
	{
		endDate.sendKeys(futuredate2);
	}
	public void clickNext2()
	{
		next2.click();
	}
	public void clickTravellers()
	{
		travellers.click();
	}
	public void clickTraveller1() throws InterruptedException
	{
		traveller1.click();
		Thread.sleep(2000);
	}
	public void selectTraveller1Age() throws InterruptedException
	{
		traveller1age.click();
		Thread.sleep(2000);
	}
	public void clickTraveller2() throws InterruptedException
	{
		traveller2.click();
		Thread.sleep(2000);
	}
	public void selectTraveller2Age() throws InterruptedException
	{
		traveller2age.click();
		Thread.sleep(2000);
	}
	public void clickNextButton()
	{
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		   
		   js5.executeScript("arguments[0].click()", nextbutton);

		
	}
	public void clickYes()
	{
		selectyes.click();
	}
	public void selectTraveller1()
	{
		select1.click();
	}
	public void selectTraveller2()
	{
		select2.click();
	}
	public void selectNext()
	{
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
		   js2.executeScript("window.scrollBy(0,200)");
		   js2.executeScript("arguments[0].click()", nxt);
	}
	public void EnterMobile() throws IOException
	{
		mobile.sendKeys(Excel.getcelldata("Sheet1", 3, 0));
	}
	public void clickEnter()
	{
		enter.click();
	}
	public void selectPlan() throws InterruptedException
	{
		JavascriptExecutor js18 = (JavascriptExecutor)driver;
		   
		   js18.executeScript("arguments[0].click()", plan);
		   Thread.sleep(2000);
		//plan.click();
	}
	public void selectTraveller1CheckBox() throws InterruptedException
	{
		JavascriptExecutor js8 = (JavascriptExecutor)driver;
		   
		   js8.executeScript("arguments[0].click()", clickingtraveller1);
		   Thread.sleep(2000);
		//traveller1.click();
	}
	public void selectTraveller2CheckBox() throws InterruptedException
	{
		JavascriptExecutor js9 = (JavascriptExecutor)driver;
		   
		   js9.executeScript("arguments[0].click()", clickingtraveller2);
		   Thread.sleep(2000);
		//traveller2.click();
	}
	public void selectTravelDuration()
	{
		Select drpdwn = new Select(duration);
		   drpdwn.selectByValue("1");
	}
	public void clickApply() throws InterruptedException
	{
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		   
		   js7.executeScript("arguments[0].click()", apply);
		   //Thread.sleep(2000);
		//apply.click();
	}
	public void sortFilter() throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js71 = (JavascriptExecutor)driver;
		   
		   js71.executeScript("arguments[0].click()", clicksort);

		
	}
	public void clickSortPrice() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor js716 = (JavascriptExecutor)driver;
		   
		   js716.executeScript("arguments[0].click()", sortprice);
		//sortprice.click();
	}
	public void printCompanyName() throws IOException
	{
		List<String> companyname = new ArrayList<String>();
		   for(int i=0;i<3;i++) {
			   companyname.add(company.get(i).getText());
			   Excel.setcelldata("Sheet1",company.get(i).getText() , 0, i);
			   
			   
		   }
		  System.out.println(companyname);
	}
	public void printPrices() throws InterruptedException, IOException
	{
		List<String> prices = new ArrayList<String>();
		   for(int i=0;i<3;i++) {
			   prices.add(price.get(i).getText());
			   Excel.setcelldata("Sheet1",price.get(i).getText() , 1, i);
			   
			  
		   }
		   System.out.println(prices);
		   
//		   driver.navigate().to("https://www.policybazaar.com/");
		   Thread.sleep(1000);
	}


	


}
