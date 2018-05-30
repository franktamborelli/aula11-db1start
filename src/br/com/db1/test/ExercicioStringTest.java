package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.string.ExercicioString;

public class ExercicioStringTest {

	ExercicioString texto = new ExercicioString();

	@Test
	public void retornaMaiusculo() {
		Assert.assertEquals("JOSE", texto.retornaMaiusculo("joSe"));
	}

	@Test
	public void retornaMinusculo() {
		Assert.assertEquals("jose", texto.retornaMinusculo("Jose"));
	}

	@Test
	public void ehLetra() {
		Assert.assertTrue(texto.ehLetra('i'));
		Assert.assertTrue(7 == texto.quantidadedLetra(" DB1START "));
	}

	@Test
	public void primeirasQuatroLetras() {
		Assert.assertEquals("fran", texto.quatroPrimeirasLetras("Frank Tamborelli"));
		Assert.assertEquals("ank tamborelli", texto.nomeTerceiraLetra("Frank Tamborelli"));
		Assert.assertEquals("ALUNO Tamborelli", texto.trocaPrimeiroNome("Frank Tamborelli"));
	}

	@Test
	public void separaTexto() {
		String[] textoQuebrado = texto.separaTexto("banana, maçã, melancia");
		Assert.assertEquals("banana", textoQuebrado[0]);
		Assert.assertEquals("maçã", textoQuebrado[1]);
		Assert.assertEquals("melancia", textoQuebrado[2]);

	}

	@Test
	public void contaVogais() {
		Assert.assertTrue(1 == texto.quantidadeVogal("Frank"));
	}
	
	@Test
	public void reverteString() {
		Assert.assertEquals("arara", texto.imprimeInverso("arara"));
		Assert.assertEquals("gnirts", texto.imprimeInverso("string"));
	}
}
