package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

import actions.CommonActions;
import baseSetUp.SetUp;
import elements.CommonElements;
import elements.WebDriverElements;

/**
 * @author suparna_khamaru
 *
 */
public class TraditionalTestsV2 {
	
	private static EyesRunner runner;
	private static Eyes eyes;
	private static BatchInfo batch;
	private static WebDriver driver;
	public static String batchName = "Traditional V2";
	
	CommonActions home = new CommonActions();
	CommonElements element = new CommonElements();
	static SetUp base = new SetUp();
	WebDriverElements driverFunction = new WebDriverElements();
	
	public static String browser = "Chrome";
	public static String viewport = "768x700";
	public static String device = "Tablet";
	
	public static RectangleSize viewportSize = new RectangleSize(768, 700);	
	public static String fileName = "Traditional-V2-TestResults.txt";
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		batch = new BatchInfo(batchName);
		runner = new ClassicRunner();
		driver = new ChromeDriver();
	}
	
	@Before
	public void setUp() throws Exception {
		eyes = new Eyes(runner);
		eyes.setApiKey(element.apiKey); 
		eyes.setBatch(batch);
		base.setUpBrowsers(eyes, batch);
		eyes.setMatchLevel(MatchLevel.STRICT);
		
		driver.get(element.siteUrl_v2);
	}
		
	@Test
    public void task_1() {
		
		eyes.open(driver, 
				element.appName, 
				element.task1, 
				viewportSize);
		
	
		base.checkFullWindow(element.test1, eyes);
		
		Assert.assertTrue(base.generateReport(fileName, 1, 
				element.task1, element.test1, browser, viewport, device, 
				home.verifySearchBar(driver)));
	}

	@Test
	public void task_2() {
		
		eyes.open(driver, 
				element.appName, 
				element.task2, 
				viewportSize);
		
		home.filterBlackShoe(driver);
		
		
		base.checkRegion(driverFunction.productGrid(), 
				element.test2, eyes);
		
		Assert.assertTrue(base.generateReport(fileName, 2, 
				element.task2, element.test2, browser, viewport, device, 
				home.filteredCountOfBlackShoes(driver).size()==2));
	}
	
	@Test
	public void task_3() {
		
		eyes.open(driver, 
				element.appName, 
				element.task3, 
				viewportSize);
		
		home.tapOnFirstBlackShoe(driver);		
		
		base.checkFullWindow(element.test3, eyes);
	
		Assert.assertTrue(base.generateReport(fileName, 3, 
				element.task3, element.test3, browser, viewport, device, 
				home.verifyProductDetails(driver)));
	}
	
	@After
	public void tearDown() throws Exception {
		eyes.closeAsync();
		eyes.abortAsync();
		eyes.abortIfNotClosed();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
		TestResultsSummary allTestResults = runner.getAllTestResults();
		System.out.println(allTestResults);
		
		base.enterLineInReport(fileName);
	}
}
