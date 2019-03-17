package pageObjects;

public class BookFlightObj_old {
	// validating price
	public static final String table_DepartPrice = " //table/tbody/tr[3]//td[3]/font";
	public static final String table_ReturnPrice = " //table/tbody/tr[6]//td[3]/font";
	public static final String table_NoofPassenger = "//table/tbody/tr[7]/td[2]/font";
	public static final String table_Texes = "//td/table/tbody/tr[8]/td[2]/font";
	public static final String table_TotalPrice = "//table/tbody/tr[9]/td[2]/font/b";
	// Passenger info
	public static final String textbox_FirstName = "//input[contains(@name,'passFirst')]";
	public static final String textbox_LastName = "//input[contains(@name,'passLast')]";
	public static final String dropdown_Meal = "//select[contains(@name,'meal')]";
	// Credit card info
	public static final String dropdown_CardType = "//select[contains(@name,'creditCard')]";
	public static final String textbox_Number = "//input[contains(@name,'creditnumber')]";
	public static final String dropdown_ExpirationMonth = "//select[@name='cc_exp_dt_mn']";
	public static final String dropdown_ExpirationYear = "//select[@name='cc_exp_dt_yr']";
	public static final String textbox_CardCarrierFirstName = "//input[contains(@name,'passFirst')]";
	public static final String textbox_CardCarrierMiddleName = "//input[contains(@name,'cc_mid_name')]";
	public static final String textbox_CardCarrierLastName = "//input[contains(@name,'cc_last_name')]";
	// if ticketless travel
	public static final String Checkbox_TicketLess = "//input[contains(@name,'ticketLess')]";
	// Billing Address
	public static final String textbox_BillingAddress1 = "//input[contains(@name,'billAddress1')]";
	public static final String textbox_BillingCity = "//input[contains(@name,'billCity')]";
	public static final String textbox_BillingState = "//input[contains(@name,'billState')]";
	public static final String textbox_BillingPostalCode = "//input[contains(@name,'billZip')]";
	public static final String dropdown_BillingCountry = "//select[contains(@name,'billCountry')]";
	// if billing adress and delevery address is same
	public static final String checkbox_SameAsBillingAddress = "//tr[14]//td[2]//input[1]";
	// delevery address
	public static final String textbox_DelAddress = "//input[contains(@name,'delAddress1')]";
	public static final String textbox_DelCity = "//input[contains(@name,'delCity')]";
	public static final String textbox_DelState = "//input[contains(@name,'delState')]";
	public static final String textbox_DelPostalcode = "//input[contains(@name,'delZip')]";
	public static final String dropdown_DelCountry = "//select[contains(@name,'delCountry')]";
	public static final String Link_SecurePurchase = "//input[contains(@name,'buyFlights')]";
}
