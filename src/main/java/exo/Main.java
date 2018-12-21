package exo;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*for  (int i = 0 ; i < 5 ; i++) {
			System.out.print(i +". ");
			for (int j = 0 ; j <= i ; j++) {
				System.out.print(j);
				
			}
			
			System.out.println();
		}*/
		
		Random r = new Random();
		int min = 25;
		int max = 50;
		
		int valeur = min + r.nextInt(max - min);
		
		
		System.out.println("Saisir un texte");
		String chaine = scanner.nextLine();
		System.out.println(chaine.charAt(2));
				
		int result = factorielle(4);
		
		System.out.println(result);
		
	}
	
	static int somme(int valeur) {
		if (valeur == 1) return 1;
		else return valeur = valeur + somme(valeur-1);
	}
	
	static int factorielle(int valeur) {
		
		if (valeur == 1) return 1;
		else return valeur = valeur * factorielle(valeur-1);

	}
}
