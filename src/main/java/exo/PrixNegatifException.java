package exo;

public class PrixNegatifException extends Exception {
	
	private Double prixHT;
	
	public PrixNegatifException(Double prixHT) {
		super("Prix négatif trouvé : "+prixHT);
		this.prixHT = prixHT;
	}
		
	public Object getPrix() {
		// TODO Auto-generated method stub
		return prixHT;
	}

}
