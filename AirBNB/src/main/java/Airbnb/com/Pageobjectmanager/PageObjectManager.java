package Airbnb.com.Pageobjectmanager;

import Airbnb.com.Baseclass.Baseclass;
import Airbnb.com.Locators.Home;

public class PageObjectManager extends Baseclass {

	private Home Home;

	public Home getHome() {
		if (Home==null) {
			Home=new Home(driver);
		}
		return Home;
	}
	
	
	
}
