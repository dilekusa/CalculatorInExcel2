package step_definitions;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import operations.Calculator;
import pages.Google;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.SSExcelUtils;

public class GoogleCalculator {
	static WebDriver driver;
	Google google=new Google();
	
	@Given("^Navigate to www\\.google\\.com \\(Links to an external site\\.\\)Links to an external site\\. search for keyword: calculator$")
	public void navigate_to_www_google_com_Links_to_an_external_site_Links_to_an_external_site_search_for_keyword_calculator() throws Throwable {
		driver=Driver.getInstance();
		driver.get(ConfigurationReader.getProperty("url"));
		google.search.sendKeys("calculator"+Keys.ENTER);
		
	}

	@When("^On result page verify the calculator displayed$")
	public void on_result_page_verify_the_calculator_displayed() throws Throwable {
		Assert.assertTrue(google.calculator.isDisplayed());
	   System.out.println("This is for git examples ");
	}

	@When("^Test the calculator with one set of data$")
	public void test_the_calculator_with_one_set_of_data() throws Throwable {
//		google.calcBox.sendKeys(ConfigurationReader.getProperty("num1"));
//		Thread.sleep(1000);
//		google.calcBox.sendKeys(ConfigurationReader.getProperty("operator"));
//		Thread.sleep(1000);
//		google.calcBox.sendKeys(ConfigurationReader.getProperty("num2"));
//		Thread.sleep(2000);
//		google.equals.click();
		
		 google.num1.click();
	     google.addition.click();
	     google.num2.click();
	     google.equals.click();
	     Thread.sleep(2000);
	     google.clear.click();
	     

	}

	@Then("^Get the data and operation from excel sheet to create data driven testing as you did in task (\\d+)\\.$")
	public void get_the_data_and_operation_from_excel_sheet_to_create_data_driven_testing_as_you_did_in_task(int arg1) throws Throwable {

		SSExcelUtils.openExcelFile(ConfigurationReader.getProperty("excelFilePath"), "Sheet1");
		
		int rowNums=SSExcelUtils.getUsedRowsCount();
		System.out.println("The row numbers are: " +rowNums);
		
		
		for(int i=1; i<rowNums; i++){
			String executionFlag=SSExcelUtils.getCellData(i, 0);
			
			String operation=SSExcelUtils.getCellData(i, 1);
			
			
			String number1=SSExcelUtils.getCellData(i,2).replace(".0", "");
			
			String number2=SSExcelUtils.getCellData(i, 3).replace(".0", "");

			if(executionFlag.contains("Y")){
				switch (operation){
					case"addition":
					google.calcBox.sendKeys(number1);
					google.addition.click();
					google.calcBox.sendKeys(number2);
					google.equals.click();
					
					case"subtraction":
						google.calcBox.sendKeys(number1);
						google.subtraction.click();
						google.calcBox.sendKeys(number2);
						google.equals.click();
					
					case"multiplication":
						google.calcBox.sendKeys(number1);
						google.multiplication.click();
						google.calcBox.sendKeys(number2);
						google.equals.click();
						
					case"division":
						google.calcBox.sendKeys(number1);
						google.division.click();
						google.calcBox.sendKeys(number2);
						google.equals.click();
				}				

				String value=google.calcBox.getText();
				SSExcelUtils.setCellData(value, i, 8);
			}else{
				SSExcelUtils.setCellData("No Calculation", i, 8);
			}
			
		
			}
		}
	}
		

	

	

