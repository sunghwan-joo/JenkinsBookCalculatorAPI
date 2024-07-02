package Pranodayd.CalculatorAPI;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMultiplicationFunctionality {
	Calculator Cal;
	int Result;
	@BeforeClass
	public void init() {
		Cal = new Calculator();
	}
	
	@BeforeMethod
	public void ReinitalisingResult() {
		Result = 0;
	}
	
	@Test(priority=1, dataProvider = "ProvidePositiveIntergerValues", groups = {"RegressionTest"})
	public void TestMultiplicationWithPositiveValues(int Number1, int Number2, int ExpectedResult) {
		Result = Cal.Muliplication(Number1, Number2);
		Assert.assertEquals(Result, ExpectedResult, "Multiplication does not work with positive numbers");
	}
	
	@DataProvider
	public Object[][] providePositiveIntegerValues(){
		Object [][] SetOfValues=new Object[4][3];
		
		SetOfValues[0][0] = 1;
		SetOfValues[0][1] = 2;
		SetOfValues[0][2] = 2;
		
		SetOfValues[1][0] = 10;
		SetOfValues[1][1] = 20;
		SetOfValues[1][2] = 200;
		
		SetOfValues[2][0] = 1000;
		SetOfValues[2][1] = 2000;
		SetOfValues[2][2] = 2000000;
		
		SetOfValues[3][0] = 100;
		SetOfValues[3][1] = 200;
		SetOfValues[3][2] = 20000;
		
		return SetOfValues;
	}
	
}
