package ExerciciosJava;

import java.util.Scanner;

public class Exercicio1DoWhile {
	/*
	 * Crie um programa que leia um número do teclado até que encontre um número
	 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
	 */

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero, soma = 0;
		do {
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			soma += numero;
		} while (numero != 0);
		System.out.printf("A soma dos numeros e de :" + soma);
		
	}

}