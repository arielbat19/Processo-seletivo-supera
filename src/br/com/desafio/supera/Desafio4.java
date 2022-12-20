package br.com.desafio.supera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) throws Exception {
		desenbaralhaFrase();
	}

	public static void desenbaralhaFrase() {

		Scanner in = new Scanner(System.in);

		String casosTestes;
		List<String> frase = new ArrayList<>();

		System.out.print("Informe o número de casos de teste: ");
		casosTestes = in.nextLine();
		
		Integer nrCasoTeste = Integer.parseInt(casosTestes);
		
		for (int i = 0; i < nrCasoTeste; i++) {
			System.out.print("Informe a " + (i+1) + "° frase: ");
			frase.add(in.nextLine());
			if (frase.get(i).length()< 2 || frase.get(i).length() > 100) {
				System.out.println("Número de caracteres minimo 2 e máximo 100");
				break;
			}
			
		}
		
		
		System.out.print("Frases desembaralhada(s) ");
		for (int i = 0; i < nrCasoTeste; i++) {
			StringBuilder parte1 = new StringBuilder(frase.get(i).substring(0, frase.get(i).length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.get(i).substring(frase.get(i).length() / 2, frase.get(i).length()));
			
			parte1.reverse();
			parte2.reverse();
			System.out.println(parte1.toString() + parte2.toString());
			
		}

	}

}
