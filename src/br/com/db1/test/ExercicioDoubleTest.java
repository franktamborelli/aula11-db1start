package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exdouble.ExercicioDouble;

public class ExercicioDoubleTest {
	
	ExercicioDouble calcular = new ExercicioDouble();
	
	@Test
	public void maiorNumero() {
		Assert.assertTrue(2 == calcular.maiorNumero(2d, 1d));
		Assert.assertTrue(2 == calcular.maiorNumero(1d, 2d));
		Assert.assertFalse(1 == calcular.maiorNumero(2d, 1d));
	}
	
	@Test
	public void maiorNumeroEntreTres() {
		Assert.assertTrue(3 == calcular.maiorNumeroEntreTres(3d, 2d, 1d));
		Assert.assertTrue(3 == calcular.maiorNumeroEntreTres(2d, 3d, 1d));
		Assert.assertTrue(3 == calcular.maiorNumeroEntreTres(1d, 2d, 3d));
		Assert.assertFalse(1 == calcular.maiorNumeroEntreTres(3d, 2d, 1d));
	}
	
	@Test
	public void mediaEntreTres() {
		Assert.assertTrue(2 == calcular.mediaTresNumeros(3d, 2d, 1d));
		Assert.assertFalse(1 == calcular.mediaTresNumeros(3d, 2d, 1d));
	}
	
	@Test
	public void areaTringulo() {
		Assert.assertTrue(15 == calcular.areaTriangulo(5d, 6d));
		Assert.assertFalse(10 == calcular.areaTriangulo(5d, 6d));
	}
}
