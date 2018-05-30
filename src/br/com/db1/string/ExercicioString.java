package br.com.db1.string;

import java.util.ArrayList;
import java.util.List;

public class ExercicioString {

	public String retornaMaiusculo(String texto) {
		return texto.toUpperCase();
	}

	public String retornaMinusculo(String texto) {
		return texto.toLowerCase();
	}

	public Boolean ehLetra(char letra) {
		if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
			return true;
		}
		return false;
	}

	public Integer quantidadedLetra(String texto) {
		Integer contador = 0;
		for (Integer letras = 0; letras < texto.length(); letras++) {
			if (ehLetra(texto.charAt(letras))) {
				contador++;
			}
		}
		
		return contador;
	}

	public String quatroPrimeirasLetras(String nome) {
		String auxiliar = null;

		for (short i = 0; i < nome.length(); i++) {
			auxiliar = nome.substring(0, 4).toLowerCase();
		}
		
		return auxiliar;
	}

	public String nomeTerceiraLetra(String nome) {
		String auxiliar = null;

		for (short i = 0; i < nome.length(); i++) {
			auxiliar = nome.substring(2, nome.length()).toLowerCase();
		}
		
		return auxiliar;
	}

	public String trocaPrimeiroNome(String nome) {
		String auxiliar = null;

		for (short i = 0; i < nome.length(); i++) {
			auxiliar = "ALUNO " + nome.substring(6, nome.length());
		}
		
		return auxiliar;
	}

	public String[] separaTexto(String texto) {
		String[] textoSeparado;

		textoSeparado = texto.split(", | ,\\s");

		return textoSeparado;
	}

	public Boolean ehVogal(char vogal) {
		if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u' || vogal == 'A' || vogal == 'E'
				|| vogal == 'I' || vogal == 'O' || vogal == 'U') {
			return true;
		}
		return false;
	}

	public Integer quantidadeVogal(String texto) {
		Integer contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (ehVogal(texto.charAt(i))) {
				contador++;
			}
		}
		
		return contador;
	}

	public String imprimeInverso(String texto) {
		StringBuffer stringBuffer = new StringBuffer(texto);
		return stringBuffer.reverse().toString();
	}

}