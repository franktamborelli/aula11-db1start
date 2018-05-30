package br.com.db1.exdouble;

public class ExercicioDouble {

	public Double maiorNumero(Double numero1, Double numero2) {
		if (numero1 > numero2) {
			return numero1;
		}
		return numero2;
	}

	public Double maiorNumeroEntreTres(Double numero1, Double numero2, Double numero3) {
		if ((numero1 > numero2) && (numero1 > numero3)) {
			return numero1;
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			return numero2;
		}
		return numero3;
	}
	
	public Double mediaTresNumeros(Double numero1, Double numero2, Double numero3) {
		Double media = ((numero1 + numero2 + numero3)/3);
		
		return media;
	}
	
	public Double areaTriangulo(Double numero1, Double numero2) {
		Double area = ((numero1 * numero2)/2);
		
		return area;
	}
}
