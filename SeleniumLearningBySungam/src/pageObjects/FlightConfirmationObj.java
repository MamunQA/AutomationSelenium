package pageObjects;

public class FlightConfirmationObj {
	public static final String text_Confirmation = "//font[contains(text(),'itinerary has been booked!')]";
	public static final String text_FlightConfirmNo = "//font[contains(text(),'Flight ')]";
	public static final String text_FlightConfirmDateAndTime = "//table[1]/tbody[1]/tr[1]/td[2]/font[1]/b[1]";
	
	public static final String text_DepartingInfo = "//table/tbody/tr[3]/td/font";
	public static final String text_ReturningInfo = "//table/tbody/tr[5]/td/font";
	public static final String text_PassengerInfo = "//table/tbody/tr[7]/td/font";
	public static final String text_Tax = "//table/tbody/tr[1]/td[2]/font/font/font/b/font";
	public static final String text_TotalPrice = "//table/tbody/tr[2]/td[2]/font/b/font/font/b/font";
	
	//logout element
	public static final String link_Logout = "//img[contains(@src,'Logout')]";
}
