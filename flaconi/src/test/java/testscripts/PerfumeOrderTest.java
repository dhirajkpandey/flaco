package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.PerfumeOrderPOM;
import org.testng.TestNG;

public class PerfumeOrderTest extends BaseTest{
 
	@Test
	public void verify_perfume_order_by_user() {
		
		System.out.println("Order test");
		PerfumeOrderPOM pop = new PerfumeOrderPOM(driver);
		pop.fnVerifyPerfumeOrder(driver);
		Reporter.log("User order test passed successfully");
	}
}
