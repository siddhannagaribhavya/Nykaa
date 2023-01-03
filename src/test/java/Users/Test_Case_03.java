package Users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.Register;

public class Test_Case_03 extends Base_Class {
	@Test
   public void Sample3() {
	
   
	//WebDriverManager.chromedriver().setup();class=''
	
			//WebDriver driver =new ChromeDriver()
			 Register reg= new Register(driver);
			 reg.getSubscribe().click();
			 reg.getLetteremail().sendKeys("sreebhavya456@gmail.com");
			 
}		 
}
			 
