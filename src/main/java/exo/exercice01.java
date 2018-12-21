package exo;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class exercice01 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for (;;) {
			
			System.out.println("Saisir un chaine à tester");
			String chaine = scanner.nextLine();

			if (isPalindrom(chaine)) {
				System.out.println("le chaine " + chaine + " est un palindrome");
			}
			else {
				System.out.println("le chaine " + chaine + " n'est pas un palindrome");
			}
		}*/
		
		Random r = new Random();
		int max = 49;
		int rd = 0;
		
		
		
		Set<Integer> tirage = new TreeSet<>();
		
		for (int i = 0; i < 6; i++) {
			
			
			do {
				rd = r.nextInt( max + 1);
			} while (tirage.contains(rd));
			
			tirage.add(rd);
		}
		
		System.out.println(tirage);
		
		
	}
	
	static Boolean isPalindrom(String chaine) {
		if (chaine.isEmpty()) {
			return false;
		}
		
		/*String inverse = "";
		
		for (int i = (chaine.length() - 1); i >= 0; i--) {
			inverse += chaine.charAt(i);
		}
		
		return chaine.toLowerCase().equals(inverse.toLowerCase());*/
		
		String traite = chaine.replace(" ", "").toLowerCase();
		
		int i = 0;
	    int j = traite.length() - 1;
	    while (i < j) {
	        if (traite.charAt(i) != traite.charAt(j)) {
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}

	
}
