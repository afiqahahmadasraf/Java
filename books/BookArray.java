//18 March 2021
package afiqah_task2;

public class BookArray {

	public static void main(String[] args) {
		
		//Variable declaration;
		int x;
		
		//Allocates memory for 10 integers 
		Book book [] = new Book[10];
		
		//8. Array that holds fiction and non-fiction books
		book[0] = new Fiction("Little Women by Louisa May Alcott");
		book[1] = new Fiction("Lord of the Flies");
		book[2] = new NonFiction("Silent Spring by Rachel Carson");
		book[3] = new Fiction("The Adventures of Huckleberry Finn by Mark Twain");
		book[4] = new NonFiction("In Cold Blood by Truman Capote");
		book[5] = new Fiction("Kidnapped by Robert Louis Stevenson");
		book[6] = new NonFiction("A Brief History of Time by Stephen Hawking");
		book[7] = new NonFiction("The Double Helix by James Watson");
		book[8] = new NonFiction("The Diary of a Young Girl by Anne Frank");
		book[9] = new Fiction("Frankenstein by Mary Shelley");
		
		for(x = 0; x < book.length; ++x) {
			System.out.println("******************************************************");
			System.out.println("Book: " + book[x].getTitle()); 
			System.out.println("Price: $" + book[x].getPrice());
			System.out.println("******************************************************");
			System.out.println(" ");
		}
	}

}
