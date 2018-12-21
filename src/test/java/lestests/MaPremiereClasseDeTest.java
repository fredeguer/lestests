package lestests;

import org.junit.Assert;
import org.junit.Test;

public class MaPremiereClasseDeTest {
	
	@Test
	public void abs_QuandNombrePositif_AlorsLeResultatEstLeNombre() {
		// Arrange
		double leNombre = 2;
		
		// Act
		double resultat = Math.abs(leNombre);
		
		//Assert
		Assert.assertEquals(leNombre, resultat, 0);
	}
	
	@Test
	public void abs_QuandNombreNegatif_AlorsLeResultatEstLOpposeDuNombre() {

		double leNombre = -2;
		
		double resultat = Math.abs(leNombre);
		
		Assert.assertEquals(-leNombre, resultat, 0);
	}
	
	@Test
	public void abs_QuandNombreEstZero_AlorsLeResultatEstZero() {

		double leNombre = 0;
		
		double resultat = Math.abs(leNombre);
		
		Assert.assertEquals(leNombre, resultat, 0);
	}
}