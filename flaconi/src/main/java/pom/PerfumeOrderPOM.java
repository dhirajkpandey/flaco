package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import generic.WaitStatement;

public class PerfumeOrderPOM {
	
	/**
	 * This is Web Element Repository class
	 * 
	 * According to Page Object Model  design, Page Object should be kept separate from test scripts.
	 * 
	 * 
	 * @author Dhirajkumar.pandey
	 */
	
	//----------------------Web Element Repository started--------------------------------//
	@FindBy(xpath="//nav[@id= 'main-navigation']/ul/li[2]/a")	
	private WebElement homePagePerfumeMenu_link;
	
	@FindBy(xpath="//div[@class ='cookie-box ']/div/a")	
	private WebElement homePageCookieAlertClose_btn;
	
	
	@FindBy(xpath="//figcaption[text() ='Herrenparfum']")	
	private WebElement homePagePerfumeMenuHerrenparfum_link;
	
	@FindBy(xpath="//figcaption[text() ='Düfte']")	
	private WebElement homePagePerfumeMenuHerrenparfumDufte_link;
	
	@FindBy(xpath="//div[@class ='product-item-box']/a/img")	
	private WebElement homePagePerfumeMenuHerrenparfumDufteFirst_link;
	
	@FindBy(xpath="//button[@title = 'In den Warenkorb']")	
	private WebElement cart_btn;
	
	@FindBy(xpath="//div[@class = 'product-brand h5']/a")	
	private WebElement itemInCart_lbl;
	
	//----------------------Web Element Repository ended--------------------------------//
	
	public PerfumeOrderPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public void fnVerifyPerfumeOrder(WebDriver driver) throws StaleElementReferenceException{
		
		WaitStatement.fnExplicitWaitClickable(driver, 10, homePagePerfumeMenu_link);
		homePagePerfumeMenu_link.click();
		Reporter.log("User clicked on PARFUM menu");
		WaitStatement.fnImplicitWait(driver, 10);
				
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,400)");
				   
		if(homePageCookieAlertClose_btn.isDisplayed()){
			   homePageCookieAlertClose_btn.click();
		  }
		WaitStatement.fnExplicitWaitClickable(driver, 15, homePagePerfumeMenuHerrenparfum_link);   
		 homePagePerfumeMenuHerrenparfum_link.click();
		 Reporter.log("User selected Herrenparfum");
		WaitStatement.fnExplicitWaitClickable(driver, 15, homePagePerfumeMenuHerrenparfumDufte_link);
		 homePagePerfumeMenuHerrenparfumDufte_link.click();
		 Reporter.log("User selected Düfte");
		 js.executeScript("window.scrollBy(0,400)");
		WaitStatement.fnExplicitWait(driver, 15, homePagePerfumeMenuHerrenparfumDufteFirst_link);
		 String getSelectedItemLbl = homePagePerfumeMenuHerrenparfumDufteFirst_link.getAttribute("title");
		 //System.out.println(getSelectedItemLbl);
		 homePagePerfumeMenuHerrenparfumDufteFirst_link.click();
		 Reporter.log("User selected first link under Düfte category");
				
		WaitStatement.fnExplicitWait(driver, 15, cart_btn);
		cart_btn.click();
		WaitStatement.fnExplicitWait(driver, 15, itemInCart_lbl);
		String selectedItemInCartLbl = itemInCart_lbl.getText();
		
		//System.out.println(selectedItemInCartLbl);
		if(getSelectedItemLbl.contains(selectedItemInCartLbl)){
			
			Reporter.log("Item in the cart is same as selected by user");
		}
		WaitStatement.fnImplicitWait(driver, 5);

	}
}
