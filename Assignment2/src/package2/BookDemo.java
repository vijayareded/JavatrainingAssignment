package package2;

public class BookDemo {
	public static void main(String[] args) {
		BookStore bookStore=new BookStore("harman", 5);
		bookStore.sell("spring in action", 2);
		bookStore.display();
	}
}


