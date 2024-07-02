package Pranodayd.CalculatorAPI;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMultiplicationFunctionality {
	Calculator Cal;
	int Result;
	@BeforeClass
	public void Init() {
		Cal = new Calculator();
	}
	
	@BeforeMethod
	public void ReInitialise() {
		Result = 0;
	}
	
	@Test(priority=1, groups= {"RegressionTest"})
	public void TestSubtractionWithPositiveNumbers() {
		Result = Cal.Muliplication(10, 10);
		Assert.assertEquals(Result, 100, "Subtraction does not work with 1 Positive and 1 Negative Numbers");
	}
	
	@AfterClass
	public void Teardown() {
		Cal = null;
	}
}
