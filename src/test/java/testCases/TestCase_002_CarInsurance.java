package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.CarInsuranceNavigation;



public class TestCase_002_CarInsurance extends BaseClass {
	@Test(priority = 11,groups = {"smoke Test Two"})
	public void NavigatingBack() throws InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//logger.info("Enter Car Insurance Plans Details");
		navigationDetails.NavigateBack();
		
	}
	@Test(priority = 12,groups= {"regression Test Two"},dependsOnGroups = {"smoke Test Two"})
	public void CarInsurancePage() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		logger.info("Enter Car Insurance Plans Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//navigationDetails.NavigateBack();
		navigationDetails.clickMenu();
		navigationDetails.clickCarInsurance();
		navigationDetails.clickProceed();
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
	}
	@Test(priority = 13,groups= {"regression Test Two"})
	public void CarInsurancePage2() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		navigationDetails.clickCityName();
		navigationDetails.clickRTO();
		}
	@Test(priority = 14,groups= {"regression Test Two"})
	public void CarInsurancePage3() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		navigationDetails.clickCarBrand();
		navigationDetails.clickCarModel();
		}
	@Test(priority = 15,groups= {"regression Test Two"})
	public void CarInsurancePage4() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		navigationDetails.clickFuelType();
		navigationDetails.clickVarient();
		}
	
	@Test(priority = 16,groups= {"regression Test Two"})
	public void displayErrorMessage() throws IOException, InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		navigationDetails.EnterAnyName();
		navigationDetails.EnterIncorrectEmail();
//		navigationDetails.clickEnterButton();
//		navigationDetails.PrintErrorMessage();
//		Screenshots.ErrorMessage(driver);
//		logger.info("Error message Printed");
	}
	@Test(priority = 17,groups= {"regression Test Two"})
	public void displayErrorMessage2() throws IOException, InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    navigationDetails.clickEnterButton();
		navigationDetails.PrintErrorMessage();
		navigationDetails.EnterCorrectEmail() ;
		navigationDetails.clickEnterButton1();
		navigationDetails.ClickSelected();
		navigationDetails.selectCarPrice();
		navigationDetails.clickEnterButton2();
		navigationDetails.clickCoverage();
		//navigationDetails.clickProceedButton();
		navigationDetails.PrintForm();
		//Screenshots.ErrorMessage(driver);
		logger.info("Error message Printed");
		//Screenshots.ErrorMessage(driver);
	}
	

}
