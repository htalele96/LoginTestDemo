package practiceLoginTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
	static WebDriver driver=null;
	
	public void goTo() {
		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	public void enterData(String userName,String password) {
		WebElement userNameFiled= driver.findElement(By.id("username"));
		userNameFiled.sendKeys(userName);
		WebElement userPasswordFiled= driver.findElement(By.id("password"));
		userPasswordFiled.sendKeys(password);
		
	
	}

	
	public void submit(){
		
		WebElement submit= driver.findElement(By.id("submit"));
		submit.click();
		
	}
	
public void saveBtn(){
		
		WebElement saveButton= driver.findElement(By.id("save_btn"));
		saveButton.click();
		
	}

public void addBtn(){
	
	WebElement addButton= driver.findElement(By.id("add_btn"));
	addButton.click();
	
}

public void EditBtn(){
	
	WebElement EditButton= driver.findElement(By.id("edit_btn"));
	EditButton.click();
	
}


	
	public String error() {
		
		WebElement errorMsg= driver.findElement(By.id("error"));
		return errorMsg.getText();
	}
	
public String success() {
		
		WebElement successMsg= driver.findElement(By.className("post-title"));
		return successMsg.getText();
	}
	
	
}
