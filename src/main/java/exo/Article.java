package exo;

public class Article implements GestionTVA{

	private String reference;
	private String designation;
	private Double prixHT;
	//static final Double tva = 20.0;



	public Article() {
	}

	public Article(String reference, String designation) {
		this.reference = reference;
		this.designation = designation;
		this.prixHT = 0.0;
	}
	
	public Article(String reference, String designation, Double prixHT) throws PrixNegatifException {
		
		// if(prixHT < 0) throw new PrixNegatifException();
		
		this.reference = reference;
		this.designation = designation;
		//this.prixHT = prixHT;
		setPrixHT(prixHT);
	}
	
	public Article(Article article) {
		this.reference = article.getReference() + " COPIE";
		this.designation = article.getDesignation();
		this.prixHT = article.getPrixHT();
	}
	
	public Double calculTTC() {
		return this.prixHT + ((this.prixHT * TVA) / 100);
	}

	@Override
	public String toString() {
		return "Article [reference=" + reference + ", designation=" + designation + ", prixHT=" + prixHT + ", tva="
				+ TVA + ", Prix TTC= " + this.calculTTC() + "]";
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(Double prixHT) throws PrixNegatifException {
		
		if (prixHT < 0) throw new PrixNegatifException(prixHT);
		this.prixHT = prixHT;
	}

}
