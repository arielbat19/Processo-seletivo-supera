/**
 * 
 */
package br.com.desafio.supera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author arielbatis 
 * Classe responsavel por ler a entrada de 10 números e  orenalos de forma crescente e decrescente
 */
public class Desafio1 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> numerosPar = new ArrayList<Integer>();
		List<Integer> numerosImpar = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);

		for (Integer i = 0; i <= 9; i++) {

			System.out.println("Informe o " + (i + 1) + "° número: ");
			numeros.add(in.nextInt());

		}

		for (Integer i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 0) {
				numerosPar.add(numeros.get(i));
			} else if (numeros.get(i) % 2 == 1) {
				numerosImpar.add(numeros.get(i));
			} 
		}

		System.out.println();
		
		System.out.println("Números pares: ");
		for (int i = 0; i < numerosPar.size(); i++) {
			Collections.sort(numerosPar);
			System.out.println(numerosPar.get(i));
			
		}
		
		System.out.println();
		
		System.out.println("Números Impares: ");
		for (int j = 0; j < numerosImpar.size(); j++) {
			Collections.sort(numerosImpar, Collections.reverseOrder());
			System.out.println( numerosImpar.get(j));
			
		}
	}

}
