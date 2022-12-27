//18 March 2021
package afiqah_task2;

public class UseBook {
	
	public static void main(String[] args) {
		Fiction fiction = new Fiction("Fiction Book: Strange Case of Dr Jekyll and Mr Hyde by Robert Louis Stevenson\n");
		NonFiction nonfiction = new NonFiction("Non-Fiction Book: I Know Why the Caged Bird Sings by Maya Angelou\n");
		System.out.println("**********************************************************************************");
		System.out.println(fiction.getTitle()+ "Price: $"+ fiction.getPrice());
		System.out.println("**********************************************************************************");
		System.out.println(" ");
		System.out.println("**********************************************************************************");
		System.out.println(nonfiction.getTitle()+ "Price: $"+ nonfiction.getPrice());
		System.out.println("**********************************************************************************");
	}
}
