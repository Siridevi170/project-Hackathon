package testCases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import pageObjects.StudentInsuranceNavigation;

import utilityMethods.Calender;

public class TestCase_001_StudentInsuranceNavigation extends BaseClass{
	
	
	
	@Test(priority = 1)
	public void VerifyInsurance() throws InterruptedException, IOException{
		
//		driver = new EdgeDriver();
//		
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.policybazaar.com/");
//		driver.manage().window().maximize();
		//Loading log4j2 file
//		logger = LogManager.getLogger(this.getClass());
	
		logger.info("starting TestCase_001_StudentInsurance");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		logger.info("Enter Student TravelInsurance Plan Details");
		navigation.clickTravelInsurance();
		navigation.clickCountry();
		navigation.clickCountryName();
		
		navigation.clickNext1();
	    
//		navigation.EnterStartDate(Calender.date1());
//		navigation.EnterEndDate(Calender.date2());
//		navigation.clickNext2();
	
		
		
//		navigation.clickTravellers();
//		navigation.clickTraveller1();
//		navigation.selectTraveller1Age();
//		navigation.clickTraveller2();
//		navigation.selectTraveller2Age();
//		navigation.clickNextButton();
		
//		navigation.clickYes();	
//		navigation.selectTraveller1();
//		navigation.selectTraveller2();
//		navigation.selectNext();
//		
//		navigation.EnterMobile();
//		navigation.clickEnter();
		
		//navigation.selectPlan();
//		navigation.selectTraveller1CheckBox();
//		navigation.selectTraveller2CheckBox();
//		navigation.selectTravelDuration();
//		navigation.clickApply();
//		navigation.sortFilter();
//		navigation.clickSortPrice();
//		Getplans plans = new Getplans(driver);
//		plans.printCompanyName();
//		plans.printPrices();
//		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
//		logger.info("Enter Car Insurance Plans Details");
//		navigationDetails.clickCarInsurance();
//		navigationDetails.clickProceed();
//		navigationDetails.clickCityName();
//		navigationDetails.clickRTO();
//		navigationDetails.clickCarBrand();
//		navigationDetails.clickCarModel();
//		navigationDetails.clickFuelType();
//		navigationDetails.clickVarient();
//		Errormsg msg = new Errormsg(driver);
//		msg.EnterAnyName();
//		msg.EnterIncorrectEmail();
//		msg.PrintErrorMessage();
//		logger.info("Error message Printed");
//		InsurancePlans planDetails = new InsurancePlans(driver);
//		logger.info("Getting the list of Insurance Product Plans ");
//		planDetails.clickInsuranceProducts();
//		planDetails.healthInsuranceProducts();
//		
//		
		}
	@Test(priority = 2)
	public void EnterDetails1() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.EnterStartDate(Calender.date1());
		navigation.EnterEndDate(Calender.date2());
		navigation.clickNext2();
	 

//		navigation.printCompanyName();
//		navigation.printPrices();
		
	}
	@Test(priority = 3)
	public void EnterDetails2() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.clickTravellers();
		navigation.clickTraveller1();
		navigation.selectTraveller1Age();
		navigation.clickTraveller2();
		navigation.selectTraveller2Age();
		navigation.clickNextButton();
	 

//		navigation.printCompanyName();
//		navigation.printPrices();
		
	}
	@Test(priority = 4)
	public void EnterDetails3() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.clickYes();	
		navigation.selectTraveller1();
		navigation.selectTraveller2();
		navigation.selectNext();

//		navigation.printCompanyName();
//		navigation.printPrices();
		
	}
	@Test(priority = 5)
	public void EnterDetails4() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.EnterMobile();
		navigation.clickEnter();
//		navigation.printCompanyName();
//		navigation.printPrices();
		
	}
	@Test(priority = 6)
	public void EnterDetails5() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.selectPlan();
		
	}
	@Test(priority = 7)
	public void EnterDetails6() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.selectTraveller1CheckBox();
		navigation.selectTraveller2CheckBox();
		
	}
	@Test(priority = 8)
	public void EnterDetails7() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.selectTravelDuration();
		navigation.clickApply();
		
	}
	@Test(priority = 9)
	public void EnterDetails8() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.sortFilter();
		navigation.clickSortPrice();
		
	}
	@Test(priority = 10)
	public void InsurancePlans() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		
		navigation.printCompanyName();
		navigation.printPrices();
		
	}
	
	
}
