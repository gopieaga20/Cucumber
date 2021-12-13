package Airbnb.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Airbnb.com.Baseclass.Baseclass;

public class Home extends Baseclass {

	@FindBy(xpath = "//a[@aria-label='Airbnb Homepage']")
	private WebElement Home_page;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement cookies_ok_button;
	
	@FindBy(xpath = "//button[contains(@data-testid,'search-button')]")
	private WebElement Home_search;
	
	@FindBy(xpath = "//div[contains(text(),'I’m flexible')]")
	private WebElement Home_Im_flexiable;
	
	public WebElement getHome_Location() {
		return Home_Location;
	}



	public WebElement getHome_Check_in() {
		return Home_Check_in;
	}



	public WebElement getHome_Check_out() {
		return Home_Check_out;
	}



	@FindBy(css = "input[placeholder='Where are you going?']")
	private WebElement Home_Location;
	
	@FindBy(xpath = "//div[text()='Check in']")
	private WebElement Home_Check_in;
	
	@FindBy(xpath = "//div[text()='Check out']")
	private WebElement Home_Check_out;
	
	@FindBy(xpath = "//div[text()='Add guests']")
	private WebElement Home_Add_guest;
	
	@FindBy(css = "button[data-testid='stepper-adults-increase-button']")
	private WebElement Home_Adult_Inc;
	
	@FindBy(xpath = "//h1[contains(text(),'Stays in')]")
	private WebElement Stays_in;
	
	@FindBy(xpath = "(//span[text()='More filters'])[1]")
	private WebElement More_filter;
	
	@FindBy(xpath = "//h1[text()='More filters']")
	private WebElement More_filter_window;
	
	@FindBy(xpath = "(//span[text()='Show all'])[2]")
	private WebElement More_filter_End_showall;
	
	@FindBy(xpath = "//span[text()='Instant Book']")
	private WebElement More_filter_Start;
	
	@FindBy(xpath = "//div[text()='House']")
	private WebElement More_filter_Property_Home;
	
	@FindBy(xpath = "//button[contains(text(),'Show')]")
	private WebElement More_filter_Show_stay_button;
	
	@FindBy(css = "button[aria-label='Show map']")
	private WebElement Search_result_Map;
	
	@FindBy(xpath = "(//div[contains(@style,'--content-mini-box')])[1]")
	private WebElement least_first_price_inMap;
	
	@FindBy(xpath = "(//div[contains(@style,'--content-mini-box')])[1]//following::a[1]")
	private WebElement select_pop_in_least_price;
	
	@FindBy(xpath = "(//div[contains(@style,'--content-mini-box')])[1]//following::li[1]")
	private WebElement Name_Ofthe_stay;
	
	@FindBy(xpath = "(//h2[@tabindex='-1'])[1]")
	private WebElement Stay_Name_and_user;
	
	
	public WebElement getStay_Name_and_user() {
		return Stay_Name_and_user;
	}



	public WebElement getName_Ofthe_stay() {
		return Name_Ofthe_stay;
	}



	public WebElement getSelect_pop_in_least_price() {
		return select_pop_in_least_price;
	}



	public WebElement getLeast_first_price_inMap() {
		return least_first_price_inMap;
	}



	public WebElement getSearch_result_Map() {
		return Search_result_Map;
	}



	public WebElement getMore_filter_Show_stay_button() {
		return More_filter_Show_stay_button;
	}



	public WebElement getMore_filter_Property_Home() {
		return More_filter_Property_Home;
	}



	public WebElement getMore_filter_Start() {
		return More_filter_Start;
	}



	public WebElement getMore_filter_End_showall() {
		return More_filter_End_showall;
	}



	public WebElement getMore_filter_window() {
		return More_filter_window;
	}



	public WebElement getStays_in() {
		return Stays_in;
	}



	public WebElement getMore_filter() {
		return More_filter;
	}



	public WebElement getHome_Add_guest() {
		return Home_Add_guest;
	}



	public WebElement getHome_Adult_Inc() {
		return Home_Adult_Inc;
	}



	public WebElement getHome_search() {
		return Home_search;
	}



	public WebElement getHome_Im_flexiable() {
		return Home_Im_flexiable;
	}



	public WebElement getCookies_ok_button() {
		return cookies_ok_button;
	}



	public WebElement getHome_page() {
		return Home_page;
	}



	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
