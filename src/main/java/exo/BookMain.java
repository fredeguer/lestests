package exo;
import java.util.ArrayList;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Library library = new Library("Biblio", "114 rue lucien faure", "Bordeaux");
		
		for (int i = 0; i < 11; i++) {
			Book book = new Book("title " + i, "autor " + i, (10.0 +i));
			
			try {
				library.addBook(book);
			} catch (Exception e) {
				System.err.println(e.getMessage());
				break;
			}
		}
		
		System.out.println(library);
		System.out.println("Il y a " + library.getTotalBooks() + " livre(s)");
		
		for (Book book : library.getBooks()) {
			System.out.println(book);
		}

	}

}
