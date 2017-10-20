package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Google {

	private WebDriver driver;

	public Google() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "lst-ib")
	public WebElement search;

	@FindBy(css = "#cwtltblr")
	public WebElement calcBox;

	@FindBy(css = "div.cwmd")
	public WebElement calculator;

	@FindBy(xpath = "//*[@id='cwbt45']/div/span")
	public WebElement equals;

	@FindBy(id = "cwbt14")
	public WebElement num1;

	@FindBy(xpath = "(//div[@class='cwbtpl cwdgb-tpl cwbbts']/span[@class='cwbts'])[4]")
	public WebElement addition;
	
	@FindBy(xpath="(//div[@class='cwbtpl cwdgb-tpl cwbbts']/span[@class='cwbts'])[3]")
	public WebElement subtraction;
	
	@FindBy(xpath="(//div[@class='cwbtpl cwdgb-tpl cwbbts']/span[@class='cwbts'])[2]")
	public WebElement multiplication;
	
	@FindBy(xpath="(//div[@class='cwbtpl cwdgb-tpl cwbbts']/span[@class='cwbts'])[1]")
	public WebElement division;
	
	@FindBy(id = "cwbt15")
	public WebElement num2;

	@FindBy(id = "cwbt06")
	public WebElement clear;

}
