package BatchTesting;

import org.testng.annotations.Test;

public class ProductPageTest {
//AddProductToWishList
	//AddProductToCart
	//SelectQuantity
	@Test
	public void AddProductToWishList() {
		System.out.println("Product is added to wish list successfully .................");
	}
	@Test
	public void AddProductToCart() {
		System.out.println("Product added to cart successfully ..............");
	}
	@Test
	public void SelectQuantity() {
		System.out.println("Product quantity selected successfully ............");
	}
}
