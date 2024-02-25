package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CarInsuranceNavigation;
import utilityMethods.Screenshots;


public class TestCase_002_CarInsurance extends BaseClass {
	@Test(priority = 3)
	public void NavigatingBack() throws InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		//logger.info("Enter Car Insurance Plans Details");
		navigationDetails.NavigateBack();
		
	}
	@Test(priority = 4)
	public void CarInsurancePage() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		logger.info("Enter Car Insurance Plans Details");
		//navigationDetails.NavigateBack();
		navigationDetails.clickMenu();
		navigationDetails.clickCarInsurance();
		navigationDetails.clickProceed();
		navigationDetails.clickCityName();
		navigationDetails.clickRTO();
		navigationDetails.clickCarBrand();
		navigationDetails.clickCarModel();
		navigationDetails.clickFuelType();
		navigationDetails.clickVarient();
//		Errormsg msg = new Errormsg(driver);
//		msg.EnterAnyName();
//		msg.EnterIncorrectEmail();
//		msg.PrintErrorMessage();
//		logger.info("Error message Printed");
	}
	@Test(priority = 5)
	public void displayErrorMessage() throws IOException, InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.EnterAnyName();
		navigationDetails.EnterIncorrectEmail();
		navigationDetails.clickEnterButton();
		navigationDetails.PrintErrorMessage();
		Screenshots.ErrorMessage(driver);
		logger.info("Error message Printed");
	}

}
