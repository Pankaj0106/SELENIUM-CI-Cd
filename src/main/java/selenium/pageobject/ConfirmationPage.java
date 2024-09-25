package selenium.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.abstractComponent.AbstractComponent;

public class ConfirmationPage extends AbstractComponent{
	
	WebDriver driver;
	
	public ConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(css=".hero-primary")
	WebElement confirmationMessage;
	
	public String getComfirmationMessage() {
		return confirmationMessage.getText();
	}

}
