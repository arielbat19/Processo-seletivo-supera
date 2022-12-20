/**
 * 
 */
package br.com.desafio.supera;

import java.util.Scanner;

/**
 * @author arielbatis 
 * Classe responsavel por ler a entrada de 10 números e  orenalos de forma crescente e decrescente
 */
public class Desafio2 {

	public static void main(String[] args) {

		Double valor;
		Double restante;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um número: ");
		valor = in.nextDouble();
		
		System.out.println(valor);
		
		//Notas de R$100
		int notas100 = (int) (valor / 100);
		restante = valor - (notas100 * 100);
		
		//Notas de R$50
		int notas50 = (int) (restante / 50);
		restante = restante - (notas50 * 50);
		
		//Notas de R$20
		int notas20 = (int) (restante / 20);
		restante = restante - (notas20 * 20);
		
		//Notas de R$10
		int notas10 = (int) (restante / 10);
		restante = restante - (notas10 * 10);
		
		//Notas de R$5
		int notas5 = (int) (restante / 5);
		restante = restante - (notas5 * 5);
		
		//Notas de R$2
		int notas2 = (int) (restante / 2);
		restante = restante - (notas2 * 2);
		
		//Moedas de R$1
		int moeda1 = (int) (restante / 1);
		restante = restante - (moeda1 * 1);
		
		//Moedas de R$0.50
		int moeda2 = (int) (restante / 0.5);
		restante = restante - (moeda2 * 0.5);
		
		//Moedas de R$0.25
		int moeda3 = (int) (restante / 0.25);
		restante = restante - (moeda3 * 0.25);
		
		//Moedas de R$0.10
		int moeda4 = (int) (restante / 0.10);
		restante = restante - (moeda4 * 0.10);
		
		//Moedas de R$0.05
		int moeda5 = (int) (restante / 0.05);
		restante = restante - (moeda5 * 0.05);
		
		//Moedas de R$0.01
		int moeda6 = (int) (restante / 0.01);
		restante = restante - (moeda6 * 0.01);
		
		System.out.println("NOTAS:\n");
		System.out.println(notas100 + " nota(s) de R$100.00");
		System.out.println(notas50 + " nota(s) de R$50.00");
		System.out.println(notas20 + " nota(s) de R$20.00");
		System.out.println(notas10 + " nota(s) de R$10.00");
		System.out.println(notas5 + " nota(s) de R$5.00");
		System.out.println(notas2 + " nota(s) de R$2.00");
		
		System.out.println();
		
		System.out.println("MOEDAS:\n");
		System.out.println(moeda1 + " moeda(s) de R$1.00");
		System.out.println(moeda2 + " moeda(s) de R$0.50");
		System.out.println(moeda3 + " moeda(s) de R$0.25");
		System.out.println(moeda4 + " moeda(s) de R$0.10");
		System.out.println(moeda5 + " moeda(s) de R$0.05");
		System.out.println(moeda6 + " moeda(s) de R$0.01");

	}

}
