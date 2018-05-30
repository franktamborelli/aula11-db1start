package br.com.db1.integer;

public class ExercicioInteger {

	public ExercicioInteger() {

	}

	public Double soma(Double valor1, Double valor2) {
		return valor1 + valor2;
	}

	public Double subtrair(Double valor1, Double valor2) {
		return valor1 - valor2;
	}

	public Double Multiplicar(Double valor1, Double valor2) {
		return valor1 * valor2;
	}

	public Double Dividir(Double valor1, Double valor2) {
		Double dividir = 0d;
		if (valor2 != 0) {
			dividir = valor1 / valor2;
		}
		return dividir;
	}
	
	public Boolean ehPar(Integer numero) {
		if(numero % 2==0) {
			return true;
		}
		return false;
	}
	
	public Integer maiorNumero(Integer numero1, Integer numero2) {
		if(numero1 > numero2) {
			return numero1;
		}
		return numero2;
	}
	
	public Boolean ehImpar(Integer numero) {
		if(numero %2 != 0) {
			return true;
		}
		return false;
	}
	
	public void numeroImparAteCem() {
		for(Integer impar = 0 ; impar<=100; impar++) {
			if(ehImpar(impar)) {
				System.out.println("Impar: "+impar);
			}
		}
	}

}
