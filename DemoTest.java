package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//1. Go to https://www.saiglobal.com/
		
		driver.get("https://www.saiglobal.com/");
	
		Thread.sleep(5000);
		//2. Click LOGIN->Infostore
		
		WebElement login = driver.findElement(By.xpath("//div[@class='desktop-login']"));
		WebElement infostore = driver.findElement(By.xpath("//div[@class='desktop-login']/ul/li/a[text()='Infostore']"));

		/* 
		 * driver.findElement(By.xpath("//a[text()='Infostore']")).click();
		 */
		Actions action = new Actions(driver);
		action.moveToElement(login).moveToElement(infostore).click().build().perform();
		
		//3. Type ISO 9001 in the Search box and Search within Standards, then click GO
		
		driver.findElement(By.xpath("//input[@id='globalSearch']")).sendKeys("ISO 9001");   // Type ISO 9001 in the search box
		driver.findElement(By.cssSelector("div.controls:nth-child(3) > div:nth-child(1) > div:nth-child(1) > label:nth-child(3)")).click(); //Click on "Standards RadioButton"
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();   //Click on "GO"

        //4. CLICK ISO 9001:2015 in the search result		
		driver.findElement(By.linkText("ISO 9001:2015")).click();

		//5. Select and Add
		//o PRODUCT FORMAT: Hardcopy – English
		//o QUANTITY: 02
		
		//6. Select and Add
		//o PRODUCT FORMAT: PDF – English
		//o QUANTITY: 01
		
		//7. Click CART top menu item
        driver.findElement(By.xpath("//a[@id='addCartConfirm']")).click();
        
        //8. Click the checkbox I agree to the document licence rules
        //9. Click PROCEED TO CHECKOUT
        driver.findElement(By.cssSelector(".cart-menu-link > span:nth-child(1)")).click();
        driver.findElement(By.xpath("//a[@id='btnCheckOut']")).click();
        
        //10. Click CONTINUE AS A GUEST USER in the login popup
        driver.findElement(By.xpath("//a[text()='CONTINUE AS A GUEST USER']")).click();
        
        //11. Enter all the fields in BILLING DETAILS and Click CONTINUE
        
        driver.findElement(By.cssSelector("#Title_chosen > a:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.xpath("//input[@id='BillFirstName']")).sendKeys("Demo");
        driver.findElement(By.xpath("//input[@id='BillLastName']")).sendKeys("User");
        driver.findElement(By.cssSelector("#billCountry_chosen > a:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.xpath("//input[@id='BillAddressLine1']")).sendKeys("Macquarie");
        driver.findElement(By.xpath("//input[@id='City/Suburb']")).sendKeys("Sydney");
        driver.findElement(By.cssSelector("#BillRegion_chosen > a:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.xpath("//input[@id='BillZipcode']")).sendKeys("2113");
        driver.findElement(By.xpath("//input[@id='BillPhoneNo']")).sendKeys("449858200");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo@gmail.com");
        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		driver.manage().deleteAllCookies();
		
		//12. Click Use my billing details for shipping on SHIPPING ADDRESS page and CLICK CONTINUE
		 driver.findElement(By.xpath("//input[@id='checkboxCopyInvoiceAddress']")).click();
	     driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
	     
	     /* 13. On Checkout page
	     o Verify the Hardcopy product price is the same in the product page (step5)
	     o Verify the PDF product price is the same in the product page (step6)
	     o Verify Products Subtotal is the sum of all selected products
	     o Click CONTINUE */
	     driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

	    /*  14. On Payment Details page
	     o Select Pay By VISA/MasterCard
	     o Purchase Order Number: TEST
	     o Click Continue */
	     driver.findElement(By.xpath("//input[@id='AccountRadio1']")).click();
	     driver.findElement(By.xpath("//input[@id='txtRefOrderNo']")).sendKeys("TEST");
	     driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

	     driver.manage().deleteAllCookies();
	     
	}

}
