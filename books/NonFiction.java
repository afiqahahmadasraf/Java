//18 March 2021
package afiqah_task2;

public class NonFiction extends Book {

	public NonFiction(String bookTitle) {
		super(bookTitle);
		setPrice();
	}
	
	//7. Set price for non-fiction books and call method
	public void setPrice() {
		price = 37.99;
	}
}
