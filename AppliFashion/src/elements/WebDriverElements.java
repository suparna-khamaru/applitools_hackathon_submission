package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author skhamaru
 *
 */
public class WebDriverElements{

	// identifiers
	public String searchBarId = "INPUTtext____42";
	public String shoeImageId = "shoe_img";
	public String productGridId = "product_grid";
	public String searchIconId = "A__btnsearchm__59";

	// xpaths
	public String blackShoesXpath = "//*[@id='product_grid']/div";
	public String firstBlackShoeXpath = "//a/h3[text()='Appli Air x Night']";
	public String shoeSizeXpath = "//*[@id='DIV__customsele__92']/div/span";

	// css selectors
	public String blackCheckSelector = "#SPAN__checkmark__107"; 
	public String filterIconSelector = "#ti-filter";
	public String filterButtonSelector = "#filterBtn";

	public WebElement firstBlackShoe(WebDriver driver) {
		WebElement blackShoe = driver.findElement(By.xpath(firstBlackShoeXpath));
		return blackShoe;
	}

	public WebElement blackCheckBox(WebDriver driver) {
		WebElement check = driver.findElement(By.cssSelector(blackCheckSelector));
		return check;
	}

	public WebElement filterIcon(WebDriver driver) {
		WebElement icon = driver.findElement(By.cssSelector(filterIconSelector));
		return icon;
	}

	public WebElement filterButton(WebDriver driver) {
		WebElement filter = driver.findElement(By.cssSelector(filterButtonSelector));
		return filter;
	}

	public WebElement blackShoeLargeImage(WebDriver driver) {
		WebElement image = driver.findElement(By.id(shoeImageId));
		return image;
	}

	public By productGrid() {
		By grid = By.id(productGridId);
		return grid;
	}

	public By blackCheckBox() {
		By checkBox = By.cssSelector(blackCheckSelector);
		return checkBox;
	}

	public WebElement searchIcon(WebDriver driver) {
		WebElement icon = driver.findElement(By.id(searchIconId));
		return icon;
	}

	public WebElement searchBar(WebDriver driver) {
		WebElement bar = driver.findElement(By.id(searchBarId));
		return bar;
	}

	public List<WebElement> filteredBlackShoes(WebDriver driver) {
		List<WebElement> shoes = driver.findElements(By.xpath(blackShoesXpath));
		return shoes;
	}

	public WebElement shoeSize(WebDriver driver) {
		WebElement shoeSize = driver.findElement(By.xpath(shoeSizeXpath));
		return shoeSize;
	}
}