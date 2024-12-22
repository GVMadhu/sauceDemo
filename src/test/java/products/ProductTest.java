package products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.ProductsPage;

import sauceDemo.BaseTest;

public class ProductTest extends BaseTest {
	
	@Test
	public void testProductHeaderIsDisplayed() {
		
		ProductsPage productPage =loginPage.LogIntoApplication("standard_user", "secret_sauce");
		Assert.assertTrue(productPage.isProductsHeaderDisplayed());
		
		
		
	}

}
