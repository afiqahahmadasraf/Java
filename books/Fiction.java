//18 March 2021
package afiqah_task2;

public class Fiction extends Book {
	
	public Fiction(String bookTitle) {
		super(bookTitle);
		setPrice();
	}
	
	//6. Set price for fiction books and call method
	public void setPrice() {
		price = 24.99;
	}
}
