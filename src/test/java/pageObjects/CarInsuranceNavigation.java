package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarInsuranceNavigation  extends BasePage {
	
	
	
	public CarInsuranceNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	@FindBy(xpath="//i[@class=\"arrow\"]") 
	WebElement click;
	@FindBy(xpath="//a[text()=\"Car Insurance\"]") 
	WebElement carInsurance;
	@FindBy(xpath="//span[text()=\"car? Click here\"]") 
	WebElement proceed;
	@FindBy(xpath="//*[@id=\"pre-quote\"]/div[2]/div[3]/div[2]/div[2]/div[3]/div[1]") 
	WebElement city;
	@FindBy(xpath="//label[@data-id=\"481\"]") 
	WebElement rto;
	@FindBy(xpath="//label[@data-id=\"33\"]") 
	WebElement brand;
	@FindBy(xpath="//label[@data-id=\"222\"]") 
	WebElement model;
	@FindBy(xpath="//span[text()=\"Petrol\"]") 
	WebElement fuel;
	@FindBy(xpath="//span[text()=\"Delta AMT\"][@class=\"text\"]") 
	WebElement varient;
	@FindBy(xpath="//input[@id =\"txtName\"]") 
	WebElement randomName;
	@FindBy(xpath="//input[@id =\"txtEmail\"]") 
	WebElement errorEmail;
	@FindBy(xpath="//div[@class=\"button btnOrange\"][text()=\"View Prices \"]")
	WebElement clickEnter;
	@FindBy(xpath="//div[text()=\"Please enter valid email address\"]") 
	WebElement errorMessage;
	
	//Action Methods
	public void NavigateBack() throws InterruptedException {
		driver.navigate().to("https://www.policybazaar.com/");
		   Thread.sleep(1000);
		
	}
	public void clickMenu() {
		//WebDriverWait wait = new WebDriverWait(driver);
		
		JavascriptExecutor js23 = (JavascriptExecutor)driver;
		   
		   js23.executeScript("arguments[0].click()", click);
		
	}
	public void clickCarInsurance() throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor js17 = (JavascriptExecutor)driver;
		   
		   js17.executeScript("arguments[0].click()", carInsurance);
	     //carInsurance.click();
	}
	public void clickProceed() throws InterruptedException
	{
		proceed.click();
		Thread.sleep(2000);
	}
	public void clickCityName() throws InterruptedException
	{
		JavascriptExecutor js170 = (JavascriptExecutor)driver;
		 //  js170.executeScript("window.scrollBy(0,200)");
		   js170.executeScript("arguments[0].click()", city);
		   Thread.sleep(2000);
		//city.click();
	}
	public void clickRTO() throws InterruptedException
	{
		rto.click();
		 Thread.sleep(2000);
	}
	public void clickCarBrand() throws InterruptedException
	{
		brand.click();
		 Thread.sleep(2000);
	}
	public void clickCarModel() throws InterruptedException
	{
		model.click();
		 Thread.sleep(2000);
	}
	public void clickFuelType() throws InterruptedException
	{
		fuel.click();
		 Thread.sleep(2000);
	}
	public void clickVarient() throws InterruptedException
	{
		varient.click();
		 Thread.sleep(2000);
	}
	public void EnterAnyName() throws InterruptedException
	{
		randomName.sendKeys("abc");
		Thread.sleep(2000);
	}
	public void EnterIncorrectEmail() throws InterruptedException
	{
		errorEmail.sendKeys("xyz");
		 Thread.sleep(2000);
		//driver.navigate().to("https://www.policybazaar.com/");
	}
	public void clickEnterButton() throws InterruptedException {
		clickEnter.click();
		 Thread.sleep(2000);
		
	}
	public void PrintErrorMessage() throws IOException, InterruptedException {
		//String File = "C:\\Users\\2303757\\eclipse-workspace\\hackathon\\ExcelFile\\outputFile.xlsx";
		System.out.println(errorMessage.getText());
		 Thread.sleep(2000);
		// Excel.setCellData(path,"Sheet1",1,1, errorMessage.getText());
		//Excel.setCellData(path, "Sheet1", 2, 0,errorMessage.getText());
		//driver.navigate().to("https://www.policybazaar.com/");
	}


}
