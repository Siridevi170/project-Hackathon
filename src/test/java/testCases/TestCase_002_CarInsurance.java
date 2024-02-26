package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CarInsuranceNavigation;
import utilityMethods.Screenshots;


public class TestCase_002_CarInsurance extends BaseClass {
	@Test(priority = 11)
	public void NavigatingBack() throws InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		//logger.info("Enter Car Insurance Plans Details");
		navigationDetails.NavigateBack();
		
	}
	@Test(priority = 12)
	public void CarInsurancePage() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		logger.info("Enter Car Insurance Plans Details");
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
	@Test(priority = 13)
	public void CarInsurancePage2() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.clickCityName();
		navigationDetails.clickRTO();
		}
	@Test(priority = 14)
	public void CarInsurancePage3() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.clickCarBrand();
		navigationDetails.clickCarModel();
		}
	@Test(priority = 15)
	public void CarInsurancePage4() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.clickFuelType();
		navigationDetails.clickVarient();
		}
	
	@Test(priority = 16)
	public void displayErrorMessage() throws IOException, InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.EnterAnyName();
		navigationDetails.EnterIncorrectEmail();
//		navigationDetails.clickEnterButton();
//		navigationDetails.PrintErrorMessage();
//		Screenshots.ErrorMessage(driver);
//		logger.info("Error message Printed");
	}
	@Test(priority = 17)
	public void displayErrorMessage2() throws IOException, InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
	    navigationDetails.clickEnterButton();
		navigationDetails.PrintErrorMessage();
		Screenshots.ErrorMessage(driver);
		logger.info("Error message Printed");
		Screenshots.ErrorMessage(driver);
	}
	

}
