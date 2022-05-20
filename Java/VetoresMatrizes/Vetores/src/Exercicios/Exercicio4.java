package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		double soma = 0.0, somaDiagonal = 0.0;
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Insira os valores da Matriz: [%d][%d]", l,c);
				matriz[l][c] = read.nextDouble();
				soma += matriz[l][c];
				
				if (l==c) {
					somaDiagonal += matriz[l][c];
				}
			}
		}
		System.out.println("\nA soma dos valores da Matriz e: " + soma);
		System.out.println("\nA soma da diagonal principal da Matriz e: " + somaDiagonal);
}
}