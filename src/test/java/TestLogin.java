
import org.junit.Test;

import junit.framework.Assert;
import practiceLoginTestDemo.LoginPageTest;

public class TestLogin {
	LoginPageTest loginTest=new LoginPageTest();
	@Test
	public void emptyLogin() {
		
		loginTest.goTo();
		loginTest.enterData("" ,"");
		loginTest.submit();
		Assert.assertEquals("Your username is invalid!", loginTest.error());
		
	}

	@Test
	public void emptyUsernameLogin() {
		//LoginPageTest loginTest=new LoginPageTest();
		loginTest.goTo();
		loginTest.enterData("student" ,"");
		loginTest.submit();
		Assert.assertEquals("Your password is invalid!", loginTest.error());
		
	}
	
	@Test
	public void emptyPasswordLogin() {
		//LoginPageTest loginTest=new LoginPageTest();
		loginTest.goTo();
		loginTest.enterData("" ,"Password123");
		loginTest.submit();
		Assert.assertEquals("Your username is invalid!", loginTest.error());
		
	}
	
	@Test
	public void usernamePasswordLogin() {
		//LoginPageTest loginTest=new LoginPageTest();
		loginTest.goTo();
		loginTest.enterData("student" ,"Password123");
		loginTest.submit();
		Assert.assertEquals("Logged In Successfully", loginTest.success());
		
	}
}
