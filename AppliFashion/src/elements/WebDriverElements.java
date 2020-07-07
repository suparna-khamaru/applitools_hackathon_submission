package elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author suparna_khamaru
 *
 */
public class WebDriverElements{
	
	public WebElement firstBlackShoe(WebDriver driver) {
		WebElement blackShoe = driver.findElement(By.xpath("//a/h3[text()='Appli Air x Night']"));
		return blackShoe;
	}
	
	public WebElement blackCheckBox(WebDriver driver) {
		WebElement check = driver.findElement(By.cssSelector("#SPAN__checkmark__107"));
		return check;
	}
	
	public WebElement filterIcon(WebDriver driver) {
		WebElement icon = driver.findElement(By.cssSelector("#ti-filter"));
		return icon;
	}
	
	public WebElement filterButton(WebDriver driver) {
		WebElement filter = driver.findElement(By.cssSelector("#filterBtn"));
		return filter;
	}
	
	public WebElement blackShoeLargeImage(WebDriver driver) {
		WebElement image = driver.findElement(By.id("shoe_img"));
		return image;
	}
	
	public By productGrid() {
		By grid = By.id("product_grid");
		return grid;
	}
	
	public By blackCheckBox() {
		By checkBox = By.cssSelector("#SPAN__checkmark__107");
		return checkBox;
	}
	
	public WebElement searchIcon(WebDriver driver) {
		WebElement icon = driver.findElement(By.id("A__btnsearchm__59"));
		return icon;
	}
	
	public WebElement searchBar(WebDriver driver) {
		WebElement bar = driver.findElement(By.id("INPUTtext____42"));
		return bar;
	}
	
	public List<WebElement> filteredBlackShoes(WebDriver driver) {
		List<WebElement> shoes = driver.findElements(By.xpath("//*[@id='product_grid']/div"));
		return shoes;
	}
	
	public WebElement shoeSize(WebDriver driver) {
		WebElement shoeSize = driver.findElement(By.xpath("//*[@id='DIV__customsele__92']/div/span"));
		return shoeSize;
	}
}
