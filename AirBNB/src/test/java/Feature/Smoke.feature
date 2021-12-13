Feature: Smoke Test for Airbnb

Scenario: T101_Verify the Search Function
Given User launches AirBnB "https://www.airbnb.co.in/"
And User Verify the home Screen
When User Click on SearchIcon 
Then User is able to see the LocationField will be Enabled
And User enters location , Check in date & Check out date 
Then User select 1 Adult from GuestSection
And User Clicks on SearchIcon

Scenario: T102_SearchFunctionality_ResultPage
Given User confirms "Stays in Chennai" is Present
When User Clicks on morefilter
Then User is able to see the Pop-up in the screen
And User Scroll-down & up till end page
Then User Scrolls-down to PropertyType to select House
And User sees Show "Stays" will be automatically adjusted 
Then User tap on "Stays" Button

Scenario: T103_Successfull_Completion_Of_HotelDetails
Given User Click Map from the result
And User selects first place from the map
When User Click on name from popup 
Then User Check the hotel details is displayed in the next tab