package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
	
	private By productHeader = By.xpath("//div[@class='product_label']");
	
	public boolean isProductsHeaderDisplayed() {
		return find(productHeader).isDisplayed();
	}

}
