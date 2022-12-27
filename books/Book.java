//18 March 2021
package afiqah_task2;

public abstract class Book {
	//1. Create String field and double field for variables
	String title;
	protected double price;
	
	//2. Create constructor
	public Book(String bookTitle) {
		title = bookTitle;
	}
	
	//3. Create get method to return title
	public String getTitle() {
		return title;
	}
	
	//4. Create get method to return price
	public double getPrice() {
		return price;
	}
	
	//5. Method for fiction and non-fiction books
	public abstract void setPrice();
}
