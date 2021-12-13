package Stepdefinition;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;

import Airbnb.com.Baseclass.Baseclass;
import Airbnb.com.Pageobjectmanager.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;

public class Home extends Baseclass{

	static Map<String, String> tdata=new HashMap<>();
	PageObjectManager pom=new PageObjectManager();
	

@Given("^User launches AirBnB \"([^\"]*)\"$")
public void user_launches_AirBnB(String url) throws Throwable{
	   Browser_launch(url);
	}

	@Given("^User Verify the home Screen$")
	public void user_Verify_the_home_Screen() throws Throwable {
	   Assert_true_with_Isdisplayed(pom.getHome().getHome_page());
	   element_Click(pom.getHome().getCookies_ok_button());
	}

	@When("^User Click on SearchIcon$")
	public void user_Click_on_SearchIcon() throws Throwable {
	   element_Click(pom.getHome().getHome_search());
	    
	}

	@Then("^User is able to see the LocationField will be Enabled$")
	public void user_is_able_to_see_the_LocationField_will_be_Enabled() throws Throwable {
	   Assert_true_with_Isdisplayed(pom.getHome().getHome_Im_flexiable());
	    
	}

	@Then("^User enters location , Check in date & Check out date$")
	public void user_enters_location_Check_in_date_Check_out_date() throws Throwable {
	   element_Click(pom.getHome().getHome_Location());
		element_Senkeys(pom.getHome().getHome_Location(), "Chennai");
	   element_Click(pom.getHome().getHome_Check_in());
	   element_Click(driver.findElement(By.xpath("(//div[text()='22'])[2]")));
	   element_Click(driver.findElement(By.xpath("(//div[text()='10'])[3]")));
	   
	   
	    
	}

	@Then("^User select (\\d+) Adult from GuestSection$")
	public void user_select_Adult_from_GuestSection(int a) throws Throwable {
		element_Click(pom.getHome().getHome_Add_guest());
	   for (int i = 0; i <a; i++) {
		element_Click(pom.getHome().getHome_Adult_Inc());
	}
	    
	}

	@Then("^User Clicks on SearchIcon$")
	public void user_Clicks_on_SearchIcon() throws Throwable {
	   
		element_Click(pom.getHome().getHome_search());
	}

//TC-2
	
	
	@Given("^User confirms \"([^\"]*)\" is Present$")
	public void user_confirms_is_Present(String arg1) throws Throwable {
		Assert_true_with_Isdisplayed(pom.getHome().getStays_in());
	    Assert.assertEquals(arg1, pom.getHome().getStays_in().getText().trim());
	}

	@When("^User Clicks on morefilter$")
	public void user_Clicks_on_morefilter() throws Throwable {
	    element_Click(pom.getHome().getMore_filter());
	    
	}

	@Then("^User is able to see the Pop-up in the screen$")
	public void user_is_able_to_see_the_Pop_up_in_the_screen() throws Throwable {
	    
	    Assert_true_with_Isdisplayed(pom.getHome().getMore_filter_window());
	}

	@Then("^User Scroll-down & up till end page$")
	public void user_Scroll_down_up_till_end_page() throws Throwable {
	    scroll(pom.getHome().getMore_filter_End_showall());
	    scroll(pom.getHome().getMore_filter_Start());
	}

	@Then("^User Scrolls-down to PropertyType to select House$")
	public void user_Scrolls_down_to_PropertyType_to_select_House() throws Throwable {
	    
	    element_Click(pom.getHome().getMore_filter_Property_Home());
	}

	@Then("^User sees Show \"([^\"]*)\" will be automatically adjusted$")
	public void user_sees_Show_will_be_automatically_adjusted(String arg1) throws Throwable {
	    
	    Assert_true_with_Isdisplayed(pom.getHome().getMore_filter_Show_stay_button());
	}

	@Then("^User tap on \"([^\"]*)\" Button$")
	public void user_tap_on_Button(String arg1) throws Throwable {
	    
		element_Click(pom.getHome().getMore_filter_Show_stay_button());
	}

//TC-3
	
@Given("^User Click Map from the result$")
public void user_Click_Map_from_the_result() throws Throwable {
    
    element_Click(pom.getHome().getSearch_result_Map());
}

@Given("^User selects first place from the map$")
public void user_selects_first_place_from_the_map() throws Throwable {
    
    element_Click(pom.getHome().getLeast_first_price_inMap());
}

@When("^User Click on name from popup$")
public void user_Click_on_name_from_popup() throws Throwable {
	String stay_name = pom.getHome().getName_Ofthe_stay().getText().trim();
	//System.out.println(stay_name);
	tdata.put("Stay name", stay_name);
    AClick(pom.getHome().getSelect_pop_in_least_price());
}

@Then("^User Check the hotel details is displayed in the next tab$")
public void user_Check_the_hotel_details_is_displayed_in_the_next_tab() throws Throwable {
    window_handle("Airport/ IT HUB/Taramani/Kitchen/Break Fast/F Wifi - Houses for Rent in Chennai, Tamil Nadu, India");
   Assert_true_with_Isdisplayed(pom.getHome().getStay_Name_and_user());
    String trim = pom.getHome().getStay_Name_and_user().getText().trim();
    Assert.assertTrue(trim.contains(tdata.get("Stay name")));
}


	
}


