package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.InsurancePlans;

public class TestCase_003_HealthInsurance extends BaseClass {
	@Test(priority = 18)
	public void NavigateHome() throws InterruptedException {
		InsurancePlans NavigatingHome = new InsurancePlans(driver);
		NavigatingHome.NavigateHome();
		
	}
	
	@Test(priority = 19)
	public void HealthInsurancePage() {
		InsurancePlans planDetails = new InsurancePlans(driver);
		logger.info("Getting the list of Insurance Product Plans ");
		planDetails.clickInsuranceProducts();
		//planDetails.healthInsuranceProducts();
		
		
	}
	@Test(priority = 20)
	public void DisplayList() throws IOException {
		InsurancePlans planDetails = new InsurancePlans(driver);
		logger.info("Getting the list of Insurance Product Plans ");
		//planDetails.clickInsuranceProducts();
		planDetails.healthInsuranceProducts();
	}

}
