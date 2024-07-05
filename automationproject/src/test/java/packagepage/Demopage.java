package packagepage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demopage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"login2\"]")
	WebElement log;
	@FindBy(xpath="//*[@id=\"loginusername\"]")
	WebElement username;
	@FindBy(xpath="//*[@id=\"loginpassword\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"itemc\"]")
	WebElement section;
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")
	WebElement phone;
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")
	WebElement addcart;
	@FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[1]/a")
	WebElement backhome;
	@FindBy(xpath="//*[@id=\"cartur\"]")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"itemc\"]")
	WebElement section1;
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")
	WebElement item2;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")
	WebElement placeorder;
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement fname;
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement country;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"card\"]")
	WebElement creditcard;
	@FindBy(xpath="//*[@id=\"month\"]")
	WebElement month;
	@FindBy(xpath="//*[@id=\"year\"]")
	WebElement year;
	@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	WebElement purchase;
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	WebElement conform;
	@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")
	WebElement close;
	@FindBy(xpath="//*[@id=\"logout2\"]")
	WebElement logout;
	public Demopage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void log() {
		log.click();	
	}
	public void demoblazelogin(String Username,String Password)
	{
		username.clear();
		username.sendKeys(Username);
		password.clear();
		password.sendKeys(Password);
		
	}
	public void login()
	{
		loginbtn.click();
	}
	public void scrolldown() throws Exception 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,200)");
        Thread.sleep(1000);
	}
	public void section()
	{
		section.click();
	}
	
	public void additemcart1()
	{
		
		phone.click();
		
	}
	public void addcart()
	{
		addcart.click();
		((JavascriptExecutor) driver).executeScript("window.alert = function(msg) { return true; }");	
	}
	public void backhome()
	{
		backhome.click();
	}
	
	public void cart() {
		cart.click();
	}
	public void placeorder()
	{
		placeorder.click();
	}
	public void order(String firstname, String countryname,String cityname, String creditcardno,String monthno,String yearno)
	
	{
		fname.sendKeys(firstname);
		country.sendKeys(countryname);
		city.sendKeys(cityname);
		creditcard.sendKeys(creditcardno);
		month.sendKeys(monthno);
		year.sendKeys(yearno);
	}
	public void purchase() throws Exception
	{
		purchase.click();
		
	}
	public void confirmation()
	{
		conform.click();
		close.click();
	}
	public void logout()
	{
		logout.click();
	}
	
	
	
}

