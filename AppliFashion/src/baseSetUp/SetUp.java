package baseSetUp;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.openqa.selenium.By;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;

import elements.CommonElements;

public class SetUp {
	
	CommonElements element = new CommonElements();
	
	public void setUpBrowsers(Eyes eyes, BatchInfo batch) {
		
		Configuration config = new Configuration();
		config.setBatch(batch);
		
		config.addBrowser(1200, 700, BrowserType.CHROME)
			.addBrowser(1200, 700, BrowserType.FIREFOX)
			.addBrowser(1200, 700, BrowserType.EDGE_CHROMIUM)
			.addBrowser(768, 700, BrowserType.CHROME)
			.addBrowser(768, 700, BrowserType.FIREFOX)
			.addBrowser(768, 700, BrowserType.EDGE_CHROMIUM)
			.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT)
			.setMatchLevel(MatchLevel.LAYOUT);
		
		eyes.setConfiguration(config);
	}
	
	public void checkFullWindow(String stepName, Eyes eyes) {
		eyes.check(stepName, 
				Target.window().fully(true));
	}
	
	public void checkRegion(By id, String stepName, Eyes eyes) {
		eyes.check(stepName, 
				Target.region(id));
	}

	public boolean generateReport(String fileName, int task, String testName, 
			String domId, String browser, String viewport, 
			String device, boolean comparisonResult) {
		
	    try(var writer = new BufferedWriter(new FileWriter(fileName, true))){
	        writer.append("Task: " + task + ", "
	        		+ "Test Name: " + testName +", "
	        		+ "DOM Id: " + domId + ", "
	        		+ "Browser: " + browser + ", "
	        		+ "Viewport: " + viewport + ", "
	        		+ "Device: " + device + ", "
	        		+ "Status: " + (comparisonResult ? "Pass" : "Fail"));
	        writer.newLine();
	        writer.close();
	    }
	    catch(Exception e){
	        System.out.println("Error writing logs to report file");
	        e.printStackTrace();
	    }
		return comparisonResult;
	}
	
	public void enterLineInReport(String fileName) {
		
	    try(var writer = new BufferedWriter(new FileWriter(fileName, true))){
	        writer.append("----------------------------------");
	        writer.newLine();
	        writer.close();
	    }
	    catch(Exception e){
	        System.out.println("Error writing dash to report file");
	        e.printStackTrace();
	    }
		
	}
}
