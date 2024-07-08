package pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.Helper.Base;

public class comproductpage extends Base{
	
	public comproductpage() {

		PageFactory.initElements(driver, this);}
		
		@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
		WebElement Hyperlinks;
		
		@FindBy(xpath = "//a[@id='item_4_img_link']/../../div[3]/button[@class='btn_primary btn_inventory' and text()]")
		WebElement Addtocartbutton;

		@FindBy(xpath = "//a[@class='shopping_cart_link fa-layers fa-fw']")
		WebElement Addtocart;

		@FindBy(xpath = "//div[text()='Products']")
		WebElement productpage;

		@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
		WebElement productbrandname;

		@FindBy(xpath = "//img[@class='inventory_item_img']")
		List<WebElement> Images;
		
		@FindBy(xpath = "//select[@class='product_sort_container']")
		List<WebElement> Filter;
		
		

		public List<WebElement> getFilter() {
			return Filter;
		}

		public void setFilter(List<WebElement> filter) {
			Filter = filter;
		}

		public WebElement getAddtocart() {
			return Addtocart;
		}

		public void setAddtocart(WebElement addtocart) {
			Addtocart = addtocart;
		}

		public WebElement getProductpage() {
			return productpage;
		}

		public WebElement getHyperlinks() {
			return Hyperlinks;
		}

		public void setHyperlinks(WebElement hyperlinks) {
			Hyperlinks = hyperlinks;
		}

		public WebElement getAddtocartbutton() {
			return Addtocartbutton;
		}

		public void setAddtocartbutton(WebElement addtocartbutton) {
			Addtocartbutton = addtocartbutton;
		}

		public void setProductpage(WebElement productpage) {
			this.productpage = productpage;
		}

		public WebElement getProductbrandname() {
			return productbrandname;
		}

		public void setProductbrandname(WebElement productbrandname) {
			this.productbrandname = productbrandname;
		}

		public List<WebElement> getImages() {
			return Images;
		}

		public void setImages(List<WebElement> images) {
			Images = images;
		}


}