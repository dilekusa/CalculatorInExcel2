package operations;

import java.time.LocalDateTime;

import org.junit.Test;

import utilities.SSExcelUtils;

public class CalcTestDDT {
	
	String excelFilePath="./src/test/resources/testData/Calculator.xlsx";

	@Test
	public void CalculatorTest(){
	SSExcelUtils.openExcelFile(excelFilePath, "Sheet1");
	
	int rowNums=SSExcelUtils.getUsedRowsCount();
	System.out.println("The row numbers are: " +rowNums);
	
	
	for(int i=1; i<rowNums; i++){
		String executionFlag=SSExcelUtils.getCellData(i, 0);
		
		String operation=SSExcelUtils.getCellData(i, 1);
		
		
		String number1=SSExcelUtils.getCellData(i,2);
		double num1=Double.parseDouble(number1);
		
		String number2=SSExcelUtils.getCellData(i, 3);
		double num2=Double.parseDouble(number2);
		
		
		if(executionFlag.contains("Y")){
			double result= Calculator.Operate(operation, num1, num2);
			String value=String.valueOf(result);
			SSExcelUtils.setCellData(value, i, 5);
		}else{
			SSExcelUtils.setCellData("Skipped", i, 5);
		}
		
	
		if(SSExcelUtils.getCellData(i, 4).equals(SSExcelUtils.getCellData(i, 5))){
			SSExcelUtils.setCellData("Passed", i, 6);
		}else{
			SSExcelUtils.setCellData("Failed", i, 6);
		}
		
		String now=LocalDateTime.now().toString();
		SSExcelUtils.setCellData(now, i, 7);
	}
		
	}
	
}
