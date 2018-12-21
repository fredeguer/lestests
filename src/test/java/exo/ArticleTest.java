package exo;

import org.junit.Assert;
import org.junit.Test;


public class ArticleTest {
	
	@Test
	public void calculTTC_QuandLePrixHorsTaxeEst1000_AlorsLePrixTTCEst1206() throws Exception {
		
		Article article = new Article("dummy reference", "dummy description", 1000d);
		
		double prixTTC = article.calculTTC();
		
		Assert.assertEquals(1206, prixTTC, 0);
	}
	
	@Test
	public void setPrixHT_QuandLePrixEstNegatif_AlorsPrixNegatifException() throws Exception {
		
		Article article = new Article();
		
		try {
			article.setPrixHT(-10d);
			Assert.fail("PrixnegatifException attendue");
		} catch (PrixNegatifException e) {
			
			Assert.assertEquals(-10, e.getPrix());
		}
	}
}
