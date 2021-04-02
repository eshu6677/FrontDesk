package Objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReUseable.Baseclass;

public class FrontDeskLoginPage {
	
FrontDeskLoginPage(){
		
		PageFactory.initElements(Baseclass.driver, this);
		
	}
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	public String  enterUserame(String un){
		
		Username.sendKeys(un);
		return un;
		
	}
	
public String  enterpassword(String psw){
		
	Password.sendKeys(psw);
		return psw;
		
	}
	
	
	

}
