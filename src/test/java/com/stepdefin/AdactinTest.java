package com.stepdefin;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class AdactinTest {


		WebDriver driver;
		@Given("User is on the login page")
		public void a() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
		}
		@When("User should enter {username}, {password}")
		public void a(String username, String password) {
			WebElement txtUserName = driver.findElement(By.id("username"));
			txtUserName.sendKeys(username);
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys(password);
		}
		@When("User should search hotel select for Location, Hotels, Room Type")
		public void b() {
		    WebElement locationSelect = driver.findElement(By.id("location"));
		    Select select = new Select(locationSelect);
		    select.selectByIndex(2);
		    WebElement hotelsSelect = driver.findElement(By.id("hotels"));
		    Select select1 = new Select(hotelsSelect);
		    select1.selectByIndex(1);
		    WebElement roomtypeSelect = driver.findElement(By.id("room_type"));
		    Select select2 = new Select(roomtypeSelect);
		    select2.selectByIndex(1);
		}
		@When("User should click the search button")
		public void c() {
		    WebElement clkSubmit = driver.findElement(By.id("Submit"));
		    clkSubmit.click();
		}
		@When("User should select hotel and click the select radio button")
		public void d() {
		    WebElement clkRadiobutn = driver.findElement(By.id("radiobutton_0"));
		    clkRadiobutn.click();
		}
		@When("User should click the continue button")
		public void e() {
			WebElement clkContinuebtn = driver.findElement(By.id("continue"));
			clkContinuebtn.click();

		}
		@When("User should Book A Hotel {First_Name}, {Last_Name}, {Billing_Address}, {Credit_Card_No}, next select the Credit Card Type, Expiry Date, {CVV_Number}")
		public void f(String First_Name, String Last_Name, String Billing_Address, String Credit_Card_No, String CVV_Number) {
			WebElement txtFirstName = driver.findElement(By.id("first_name"));
			txtFirstName.sendKeys(First_Name);
			WebElement txtLastName = driver.findElement(By.id("last_name"));
			txtLastName.sendKeys(Last_Name);
			WebElement txtAddress = driver.findElement(By.id("address"));
			txtAddress.sendKeys(Billing_Address);
			WebElement txtCardNo = driver.findElement(By.id("cc_num"));
			txtCardNo.sendKeys(Credit_Card_No);
			WebElement selectCCType = driver.findElement(By.id("cc_type"));
			Select s1 = new Select(selectCCType);
		    s1.selectByIndex(2);
			WebElement selectMonths = driver.findElement(By.id("cc_exp_month"));
			Select s2 = new Select(selectMonths);
		    s2.selectByIndex(2);
			WebElement selectYear = driver.findElement(By.id("cc_exp_year"));
			Select s3 = new Select(selectYear);
		    s3.selectByIndex(11);
		    WebElement enterCVV = driver.findElement(By.id("cc_cvv"));
			enterCVV.sendKeys(CVV_Number);
		    			
		}
		@When("User should click the Book Now")
		public void g() {
			WebElement clkBookNow = driver.findElement(By.id("book_now"));
			clkBookNow.click();
			  
		}
		@Then("User should print the valid Order No. display")
		public void i() {
			WebElement orderNo = driver.findElement(By.id("order_no"));
			String orderNoDisplay = orderNo.getAttribute("value");
			System.out.println(orderNoDisplay);

		}




		}

