package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.integer.ExercicioInteger;

public class ExercicioIntegerTest {

	ExercicioInteger calcular = new ExercicioInteger();

	@Test
	public void somar() {
		Assert.assertTrue(20 == calcular.soma(15d, 5d));
	}
	
	@Test
	public void subtrair() {
		Assert.assertTrue(10 == calcular.subtrair(15d, 5d));
	}
	
	@Test
	public void multiplicar() {
		Assert.assertTrue(150 == calcular.Multiplicar(15d, 10d));
	}
	
	@Test
	public void dividir() {
		Assert.assertTrue(3 == calcular.Dividir(15d, 5d));
	}
	
	@Test
	public void ehPar() {
		Assert.assertTrue(calcular.ehPar(10));
		Assert.assertFalse(calcular.ehPar(11));
	}
	
	@Test
	public void maior() {
		calcular.maiorNumero(11, 10);
	}
	
	@Test
	public void exercicio07() {
		Assert.assertTrue(calcular.ehImpar(1));
		calcular.numeroImparAteCem();
	}
	
	
	
	

}
