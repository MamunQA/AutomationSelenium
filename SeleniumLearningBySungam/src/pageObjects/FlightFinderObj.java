package pageObjects;

public class FlightFinderObj {
	// click on Flight links
	public static final String link_Flights = "//a[contains(text(),'Flights')]";
	// click on radiobtn selecting oneway or roundtrip
	public static final String RadioBtn_oneway = "//input[contains(@value,'oneway')]";
	public static final String RadioBtn_roundtrip = "//input[contains(@value,'roundtrip')]";
	// Noof passenger selecting
	public static final String dropdown_Passengers = "//select[contains(@name,'passCount')]";
	// passenger depart info
	public static final String dropdown_DepartingFrom = "//select[contains(@name,'fromPort')]";
	public static final String dropdown_DepartingOnMonth = "//select[contains(@name,'fromMonth')]";
	public static final String dropdown_DepartingOnDate = "//select[contains(@name,'fromDay')]";
	// passenger arrive city
	public static final String dropdown_ArrivingIn = "//select[contains(@name,'toPort')]";
	// return info
	public static final String dropdown_ReturningOnMonth = "//select[contains(@name,'toMonth')]";
	public static final String dropdown_ReturningOnDate = "//select[contains(@name,'toDay')]";
	public static final String radiobutton_FirstClass = "//input[contains(@value,'First')]";
	public static final String radiobutton_BusinessClass = "//input[contains(@value,'Business')]";
	public static final String radiobutton_EconomyClass = "//input[contains(@value,'Economy')]";
	public static final String button_Continue = "//input[contains(@name,'findFlights')]";
}
