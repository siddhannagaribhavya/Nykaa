package pomRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class Register {

	public  Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[@class='ico-register']")
    private WebElement Register;
	
	public WebElement getRegister() {
		return Register;
	}	
  @FindBy(xpath="//label[.='Female']")
  private WebElement Female;
  
  
  public WebElement getFemale() {
		return Female;
	}	
	
  @FindBy(xpath="//input[@id='FirstName']")
  private WebElement Firstname;

public WebElement getFirstname() {
	return Firstname;
}
  
@FindBy(xpath="//input[@id='LastName']")
private WebElement Lastname;

public WebElement getLastname() {
	return Lastname;
}
 public WebElement getPassword() {
	return Password;
}
public void setPassword(WebElement password) {
	Password = password;
}
@FindBy(xpath="//input[@id='Email']")
 private WebElement email;

public WebElement getEmail() {
	return email;
}
@FindBy(xpath="//input[@id='Password']")
private WebElement Password;
	
@FindBy(xpath="//input[@id='ConfirmPassword']")
private WebElement Confirmpassword;

public WebElement getConfirmpassword() {
	return Confirmpassword;
}
@FindBy(xpath="//input[@id='register-button']")
private WebElement Registerbutton;

public WebElement getRegisterbutton() {
	return Registerbutton;
}
//login button
@FindBy(xpath="//a[.='Log in']")
private WebElement Log_in;

public WebElement getLog_in() {
	return Log_in;
}
@FindBy(xpath="//input[@class='email']")
private WebElement mail;

public WebElement getMail() {
	return mail;
}
@FindBy(xpath="//input[@id='Password']")
private WebElement pwd;

public WebElement getPwd() {
	return pwd;
}
@FindBy(xpath="//input[@id='RememberMe']")
private WebElement Rememeberme;

public WebElement getRememeberme() {
	return Rememeberme;
}
@FindBy(xpath="//input[@class='button-1 login-button']")
private WebElement logedin;

public WebElement getLogedin() {
	return logedin;
}
@FindBy(xpath="//input[@class='search-box-text ui-autocomplete-input']")
  private WebElement Search_box;

public WebElement getSearch_box() {
	return Search_box;
}
//@FindBy(xpath="(//div[@class='top-menu-triangle'])[1]")
//private WebElement Books;
//
//public WebElement getBooks() {
//	return Books;
//}
//@FindBy(xpath="//li[@class='active']")
//private WebElement Book;
//
//public WebElement getBook() {
//	return Book;


//@FindBy(xpath="//div[@class='top-menu-triangle active']")
//private WebElement active;
//
//public WebElement getActive() {
//	return active;
//}
@FindBy(xpath="(//a[contains(.,'Book')])[1]")
private WebElement Book;

public WebElement getBook() {
	return Book;
}
@FindBy(xpath="//select[@id='products-orderby']")
private WebElement products;

public WebElement getProducts() {
	return products;
}
@FindBy(xpath="//select[@id='products-pagesize']")
private WebElement size;

public WebElement getSize() {
	return size;
}
@FindBy(xpath="(//span[.='25.00'])[1]")
private WebElement cost;

public WebElement getCost() {
	return cost;
}
@FindBy(xpath="//a[.='Health Book']")
private WebElement HealthBook;

public WebElement getHealthBook() {
	return HealthBook;
}
@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
private WebElement Addtocart;

public WebElement getAddtocart() {
	return Addtocart;
}
@FindBy(xpath="//input[@class='button-1 newsletter-subscribe-button']")
private WebElement subscribe;

public WebElement getSubscribe() {
	return subscribe;
}
@FindBy(xpath="//input[@name='NewsletterEmail']")
private WebElement letteremail;

public WebElement getLetteremail() {
	return letteremail;
}
@FindBy(xpath="//a[.='Fiction']")
private WebElement Fiction;

public WebElement getFiction() {
	return Fiction;
}
@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
private WebElement button;

public WebElement getButton() {
	return button;
}
@FindBy(xpath="//span[.='Shopping cart']")
private WebElement Cart;

public WebElement getCart() {
	return Cart;
}
@FindBy(xpath="//th[contains(.,'Remove')]")
private WebElement remove;

public WebElement getRemove() {
	return remove;
}
@FindBy(xpath="(//input[@name='removefromcart'])[2]")
private WebElement delete;

public WebElement getDelete() {
	return delete;
}
@FindBy(xpath="//input[@class='button-2 update-cart-button']")
private WebElement updatecart;

public WebElement getUpdatecart() {
	return updatecart;
}
}








