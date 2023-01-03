package Users;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import genericLibrary.Base_Class;
import pomRepository.Register;

public class Test_case_02 extends Base_Class {
@Test
	public void sample1() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();class=''
	
		//WebDriver driver =new ChromeDriver();
		 Register reg= new Register(driver);
		 reg.getBook().click();
		 reg.getProducts().click();                                               
		WebElement product= reg.getProducts();
		
		Select s1=new Select(product);
		s1.selectByIndex(2);
		WebElement size= reg.getSize();
		Select s2=new Select(size);
		
		s2.selectByVisibleText("12");
		Thread.sleep(2000);
		reg.getCost().click();
	    reg.getHealthBook().click();
	    Thread.sleep(2000);
        reg.getAddtocart().click();
        
        
        reg.getFiction().click();
        reg.getButton().click();
        reg.getCart().click();
        //removing product from the cart
       reg.getRemove().click();
       reg.getDelete().click();
       reg.getUpdatecart().click();
        
        
        
        
        
        
        
        
        
        
        
        
}

}