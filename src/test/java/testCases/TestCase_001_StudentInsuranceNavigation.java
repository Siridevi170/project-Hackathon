package testCases;

import org.testng.annotations.Test;
import java.time.Duration;

import pageObjects.StudentInsuranceNavigation;

import utilityMethods.Calender;

public class TestCase_001_StudentInsuranceNavigation extends BaseClass{
	
	
	
	@Test(priority = 1)
	public void VerifyInsurance() throws InterruptedException{
		
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
		navigation.EnterStartDate(Calender.date1());
		navigation.EnterEndDate(Calender.date2());
		navigation.clickNext2();
		
		navigation.clickTravellers();
		navigation.clickTraveller1();
		navigation.selectTraveller1Age();
		navigation.clickTraveller2();
		navigation.selectTraveller2Age();
		navigation.clickNextButton();
		
		navigation.clickYes();	
		navigation.selectTraveller1();
		navigation.selectTraveller2();
		navigation.selectNext();
		navigation.EnterMobile();
		navigation.clickEnter();
		
		navigation.selectPlan();
		navigation.selectTraveller1CheckBox();
		navigation.selectTraveller2CheckBox();
		navigation.selectTravelDuration();
		navigation.clickApply();
		navigation.sortFilter();
		navigation.clickSortPrice();
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
	public void GetInsurancePlans() throws InterruptedException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);

		navigation.printCompanyName();
		navigation.printPrices();
		
	}
	
	
}
