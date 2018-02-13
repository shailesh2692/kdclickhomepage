package com.kdclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage 
{
	public WebDriver driver;
	  
	  public boolean isElementVisible(WebDriver driver,By by)
	  {
	   boolean value = false;    
	   if(driver.findElement(by).isDisplayed()) 
	   {
	     value = true;
	   }
	    return value;
	  }
	  
	  @BeforeTest
	  public void launchbrwsr()
	  {
	    System.setProperty("webdriver.chrome.driver","D:\\Shailesh\\My Life\\SQUAD INFOTECH\\Eclipse & Selenium\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.kdclick.com/");
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	  }
	    
	 @Test(priority = 2)
	  public void topnavhover() throws Exception
	  {
	    Actions a = new Actions(driver);
	    WebElement we1 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/mens.html']"));
	    a.moveToElement(we1).perform();
	    Thread.sleep(3000);
	    WebElement we3 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/kids.html']"));
	    a.moveToElement(we3).perform();
	    Thread.sleep(3000);
	    WebElement we4 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/sports.html']"));
	    a.moveToElement(we4).perform();
	    Thread.sleep(3000);
	    WebElement we5 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/accessories.html']"));
	    a.moveToElement(we5).perform();
	    Thread.sleep(3000);
	    WebElement we6 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/fitness.html']"));
	    a.moveToElement(we6).perform();
	    Thread.sleep(3000);   
	    WebElement we7 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/deals.html']"));
	    a.moveToElement(we7).perform();
	    Thread.sleep(3000);
	    WebElement we8 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/t-shirt-printing.html']"));
	    a.moveToElement(we8).perform();
	    Thread.sleep(3000);
	    WebElement we2 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/ladies.html']"));
	    a.moveToElement(we2).perform();
	    Thread.sleep(3000);
	    WebElement click1 = driver.findElement(By.linkText("Badminton Shoes"));
	    a.moveToElement(click1).click().perform();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.id("solrbridge-price-from")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.id("solrbridge-price-from")).sendKeys("1500");
	    Thread.sleep(3000);
	    driver.findElement(By.id("solrbridge-price-to")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.id("solrbridge-price-to")).sendKeys("5000");
	    Thread.sleep(3000);
	    driver.findElement(By.id("solrbridge-price-btn")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//a[@title='Yonex SHB 34EX Badminton Shoes']")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    Select drpsize = new Select(driver.findElement(By.id("attribute210")));
	    drpsize.selectByVisibleText("Ind/Uk 9");
	    Thread.sleep(3000);
	    driver.findElement(By.id("add_to_cart")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.kdclick.com");
	    System.out.println(driver.getTitle());
	  }
	  
	  @Test(priority = 1)
	  public void topsearch() throws Exception
	  {
		driver.findElement(By.id("search")).sendKeys("foot");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.id("sbs_search_product_index_0"));
		act.moveToElement(we).click().perform();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//button[@title='Continue Shopping']")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.id("search")).sendKeys("cric");
	    Thread.sleep(5000);
	    driver.findElement(By.id("sbs_search_closed_button")).click();
	  }
	   
	  @Test(priority = 3)
	  public void homebottom() throws Exception
	  {
	    Actions ac = new Actions(driver);
		WebElement w = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[6]/div/div/div[1]/div/div[3]/div/div/div[1]/div/ul[2]/li[1]/div"));
		ac.moveToElement(w).perform();
		Thread.sleep(5000);
		Boolean iselementpresent = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div[6]/div/div/div[1]/div/div[3]/div/div/div[1]/div/ul[2]/li[1]/div")).size()!=0;
		System.out.println("Quickview button is displayed");
		if(iselementpresent == true)
		{
		  WebElement w1 = driver.findElement(By.xpath("//a[@href='https://www.kdclick.com/magicshop/quickview/view/id/23']"));		
		  ac.moveToElement(w1).click(w1).perform();
		  System.out.println("Element Is Present");
		  Thread.sleep(5000);
		  Boolean popUp = isElementVisible(driver,By.xpath(".//*[@id='product_addtocart_form']/div[2]/div"));
		  System.out.println(popUp);
		  if (popUp == true) 
		  { 
		    driver.findElement(By.id("add_to_cart")).click();
		    System.out.println("Pop up is displayed");
		  }
		  
		  else 
		  {
		    System.out.println("pop up isn't displayed");
		  }
	   
		}  
		 
		else
		{
		  System.out.println("Element Isn't present");	
		}
	  }	  
	 @AfterTest()
	 public void close()
	 {
		driver.close();
	 }
}	 

