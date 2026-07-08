package maven_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Launch {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("userName")).sendKeys("maya");
	  Thread.sleep(2000);
	  driver.findElement(By.name("password")).sendKeys("maya");
	  Thread.sleep(2000);
	  driver.findElement(By.name("submit")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
