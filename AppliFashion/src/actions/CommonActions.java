package actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.CommonElements;
import elements.WebDriverElements;

public class CommonActions {

	WebDriverWait wait;
	WebDriverElements find = new WebDriverElements();
	CommonElements commonElement = new CommonElements();

	public void filterBlackShoe(WebDriver driver) {
		
		wait = new WebDriverWait(driver, 20);

		if (!(find.blackCheckBox(driver).isDisplayed())) {
			find.filterIcon(driver).click();
			wait.until(ExpectedConditions
					.elementToBeClickable(find.blackCheckBox()));
		}

		find.blackCheckBox(driver).click();
		find.filterButton(driver).click();
	}

	public void tapOnFirstBlackShoe(WebDriver driver) {
		
		find.firstBlackShoe(driver).click();
	}
	
	public boolean verifySearchBar(WebDriver driver) {
		
		Boolean searchIcon = find
				.searchIcon(driver)
				.isDisplayed() ? true : false;
		
		Boolean searchBar = find
				.searchBar(driver)
				.isDisplayed() ? true : false;
		
		return searchIcon && searchBar ? false : true;
	}
	
	public List<WebElement> filteredCountOfBlackShoes(WebDriver driver) {
		
		List<WebElement> shoes = find.filteredBlackShoes(driver);
		return shoes;
	}
	
	public boolean verifyProductDetails(WebDriver driver) {
				
		Boolean smallSize = find
				.shoeSize(driver)
				.getText()
				.equals("Small (S)");
		
		Boolean largeShoeImage = find
				.blackShoeLargeImage(driver)
				.isDisplayed();
		
		return smallSize && largeShoeImage;
	}
}
