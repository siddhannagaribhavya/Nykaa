package Users;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.Register;


public class Test_Case_01  extends Base_Class{
     @Test
	public void sample() throws IOException, InterruptedException, AWTException
	{
		//WebDriverManager.chromedriver().setup();class=''
	
		//WebDriver driver =new ChromeDriver();
		 Register reg= new Register(driver);
		 reg.getRegister().click();
		 reg.getFemale().click();
		 reg.getFirstname().sendKeys("Bhavya");
         reg.getLastname().sendKeys("Sree");
		reg.getEmail().sendKeys("sreebhavya456@gmail.com");
		reg.getPassword().sendKeys("771998");
		reg.getConfirmpassword().sendKeys("771998");
		reg.getRegisterbutton().click();
		reg.getLog_in().click();
		reg.getMail().sendKeys("sreebhavya456@gmail.com");
		reg.getPwd().sendKeys("771998");
		reg.getRememeberme().click();
		reg.getLogedin().click();
		//reg.getSearch_box().sendKeys("Books");
		//reg.getBooks().click();
		//reg.getBook().click();
		//reg.getActive().click();
		Thread.sleep(3000);
			
     driver.quit();
		
		 
}}
		 
		 
		
		   
	
  
