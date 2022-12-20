package br.com.desafio.supera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		Integer alvo = null;
		Integer numeroPares = 0;
		Integer tamanhoLista = 0;
		ArrayList<Integer> entrada = new ArrayList<Integer>();

		System.out.printf("Informe o tamanho do lista:");
		tamanhoLista = in.nextInt();
		
		System.out.println("Informe os valores da lista");
		for (int i = 0; i <tamanhoLista; i++) {
			entrada.add(in.nextInt());
		}
		
		System.out.printf("Tamnho lista: " + entrada);
		
		System.out.println();

		System.out.printf("Informe o valor alvo:");
		alvo = in.nextInt();
		
		Collections.sort(entrada);

		int anterior = entrada.get(1);
		for (int i = 0; i < entrada.size(); i++) {
			
				if (entrada.get(i) - (anterior) == alvo) {
					numeroPares++;
				}
			
				anterior = entrada.get(i);
		}
		
		System.out.println("Existem " + numeroPares + " valores cuja diferença é igua ao valor alvo.");

	}

}
