package saiglobaldemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		  
		//System.setProperty("webdriver.gecko.driver","geckodriver");
	    //WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		  driver.get("https://www.saiglobal.com/");
		  Thread.sleep(5000);
		  
		  WebElement login = driver.findElement(By.xpath("//div[@class='desktop-login']"));
		  WebElement infostore = driver.findElement(By.xpath("//div[@class='desktop-login']/ul/li/a[text()='Infostore']"));
	     
		  Actions action = new Actions(driver);
		  action.moveToElement(login).moveToElement(infostore).click().build().perform();
				  Thread.sleep(20000);
				  
		  //driver.findElement(By.cssSelector("[class='desktop-login']")).click();
		//driver.findElement(By.xpath("//div[@class='desktop-login']/ul/li/a[text()='Infostore']")).click();
		
	/* Sharat */
		/*
	 	WebElement loginList= driver.findElement(By.className("desktop-login")); 
		Actions builder = new Actions(driver);
		 builder.moveToElement(loginList).build().perform();

		        WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Infostore")));
		       // wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Infostore")));
		 */
		
		/* Anand */
		/* WebElement login = driver.findElement(By.xpath("//div[@class='desktop-login']"));
		  WebElement infostore = driver.findElement(By.xpath("//div[@class='desktop-login']/ul/li/a[text()='Infostore']"));
			
		  Actions action = new Actions(driver);
		  action.moveToElement(login).moveToElement(infostore).click().build().perform();
		  */
		
		//WebDriverWait wait = new WebDriverWait (driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Infostore"))).click();
		//driver.findElement(By.linkText("Infostore")).click();
	/*	driver.get("https://infostore.saiglobal.com/");
		driver.findElement(By.xpath("//*[@id=\"globalSearch\"]")).sendKeys("ISO 9001");
	//	driver.findElement(By.xpath("//label[contains(text(),'Standards')]")).click();
		driver.findElement(By.cssSelector("div.controls:nth-child(3) > div:nth-child(1) > div:nth-child(1) > label:nth-child(3)")).click(); //Click on "Standards RadioButton"
		//WebDriverWait wait = new WebDriverWait (driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='GO']"))).click();
		WebElement we = driver.findElement(By.xpath("//input[@value='GO']"));
		Actions action = new Actions(driver);
		 action.moveToElement(we).click().build().perform();
		//WebDriverWait wait = new WebDriverWait (driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'GO')]"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnSearch\"]"))).click();
		//driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
		//html[1]/body[1]/form[1]/div[6]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[2]
		//		#btnSearch
	//driver.close();
		
	//	driver.findElement(By.xpath("//input[@id='radio2']")).click();
		
		// driver.findElement(By.xpath("//div[@class='desktop-login']//a[contains(text(),'Infostore')]")).click();
//driver.findElement(By.cssSelector("ul.list-nav-child:nth-child(1) > li:nth-child(1) > a:nth-child(1))")).click();
		//Thread.sleep(3000);
		 //driver.findElement(By.xpath("//div[@class='desktop-login']//ul[contains(@class='no-bullet list-nav-child sub-menu-lv')]")).click();
		// driver.findElement(By.xpath("//ul[contains(@class='no-bullet list-nav-child sub-menu-lv')]//li[1]")).click();
	/*
		 WebElement we = driver.findElement(By.cssSelector("div.list > ul.no-bullet list-nav-child sub-menu-lv li:nth-child(2)"));
				 Actions action = new Actions(driver);
				 action.moveToElement(we).click().build().perform();*/

/*
		WebElement LoginList = driver.findElement(By.xpath("//div[@class='desktop-login']//ul[@class='no-bullet list-nav-child sub-menu-lv']"));
		System.out.println("I am here");
		List<WebElement> LoginTypes = LoginList.findElements(By.tagName("li"));
		System.out.println("I am here after LoginTypes");    
		//LoginTypes.get(0).click();
		for (WebElement li : LoginTypes) {
			System.out.println(li.getText());
			if (li.getText().equalsIgnoreCase("Infostore")) {
				System.out.println("Insied Loop " + li.getText());
				Actions action = new Actions(driver);
				 action.moveToElement(li).click().build().perform();
				//li.click();
				System.out.println("After Clicking");
				break;
			}
		}
	/*	WebElement countryUL= driver.findElement(By.xpath("//[@id='country_id']/ul"));
		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
		for (WebElement li : countriesList) {
		if (li.getText().equals("India (+91")) {
		     li.click();
		   }
		}*/
		/*
		 * //div[@class='desktop-login']//ul[@class='no-bullet list-nav-child
		 * sub-menu-lv'] Select s = new Select(Login);
		 * 
		 * s.selectByVisibleText("Infostore");
		 * 
		 * Actions drpdwn = new Actions(driver); driver.
		 * findElement(By.cssSelector("[class='desktop-login']")).click(); Action
		 * selectobject =
		 * drpdwn.moveToElement(driver.findElement(By.linkText("Infostore"))).click().
		 * build(); selectobject.perform();
		 */
		// div[@class='no-bullet list-nav-child sub-menu-lv']

	}

}
