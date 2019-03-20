package data;

import java.util.Random;

public class Constants {
	public static final String CHROMEDRIVER_PATH = "C:\\drivers\\chromedriver.exe";
	public static final String FIREFOXDRIVER_PATH = "C:\\drivers\\geckodriver.exe";
	public static final String BROWSER_TYPE = "chrome";
	public static final String BASE_URL = "http://www.demoaut.com";
	// public static final String DATAPOOL_PATH =
	// "C:\\Users\\bdc_r\\eclipse-workspace\\SeleniumLearningBySungam\\resource\\datapool.xls";
	// public static final String TESTDATAOUTPUT_PATH=
	// "C:\\Users\\bdc_r\\eclipse-workspace\\SeleniumLearningBySungam\\src\\utils\\PropertyUtils.java";
	// =======================================================================================================================
	// resource folderpath
	Random rand = new Random();
	public static String workingDir = System.getProperty("user.dir"); // C:\\AutomationProjects\\TestAutomation_Selenium
	// public static String datapoolPath =
	// "C:\\AutomationProjects\\SeleniumTutorial\\resource\\TestDataPool_Automation.xls";
	public static final String DATAPOOL_PATH = workingDir + "/resource/Datapool.xls";
	public static final String TESTDATAOUTPUT_PATH = workingDir + "\\resource/TestDataOutput.properties";
	public static final String CONFIG_PATH = workingDir + "\\resource/config.properties";
	public static String automationDatapoolPath = workingDir + "\\resources\\TestDataPool_Automation.xls";
	// =======================================================================================================================
	//for screenshot and caption 
	// public static String screenshotFolderPath ="C:\\Selenium_Logs\\Screenshots\\";
	public static String screenshotFolderPath = "C:\\Selenium_Logs\\Screenshots\\";
    //=============================================================================================================================
	//if those folder are in my c drive 
	public static String configPath = "C:\\Users\\bdc_r\\eclipse-workspace\\SeleniumLearningBySungam\\src\\config\\config.properties";
	public static int counter = 0;

	public static String dataPool_Xls = "C:\\Users\\bdc_r\\eclipse-workspace\\SeleniumLearningBySungam\\resource\\datapool.xls";
	public static String dataPool_Xlsx = "C:\\seleniumLogs\\testData\\Datapool.xlsx"; // \\=/

}
