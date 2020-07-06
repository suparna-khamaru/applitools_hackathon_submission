package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
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
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;

import actions.CommonActions;
import baseSetUp.SetUp;
import elements.CommonElements;
import elements.WebDriverElements;

/**
 * @author suparna_khamaru
 *
 */

public class ModernTestsV2 {

	private static EyesRunner runner;
	private static Eyes eyes;
	private static BatchInfo batch;
	private static WebDriver driver;
	private static String modernBatchName = "UFG Hackathon V2";
	public static RectangleSize viewportSize = new RectangleSize(800, 600);
	
	CommonActions home = new CommonActions();
	CommonElements  element = new CommonElements();
	WebDriverElements driverFunction = new WebDriverElements();
	SetUp base = new SetUp();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		batch = new BatchInfo(modernBatchName);
		runner = new VisualGridRunner(10);
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
		
		assertFalse(home.verifySearchBar(driver));
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
		
		assertTrue(home
				.filteredCountOfBlackShoes(driver)
				.size() == 2);
	}
	
	@Test
	public void task_3() {
		
		eyes.open(driver, 
				element.appName, 
				element.task3, 
				viewportSize);
		
		home.tapOnFirstBlackShoe(driver);
		
		base.checkFullWindow(element.test3, eyes);
		
		assertTrue(home.verifyProductDetails(driver));
	}
	
	@After
	public void tearDown() throws Exception {
		eyes.closeAsync();
		eyes.abortAsync();
		eyes.abortIfNotClosed();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		TestResultsSummary allTestResults = runner.getAllTestResults();
		System.out.println(allTestResults);
		driver.quit();
	}

}
