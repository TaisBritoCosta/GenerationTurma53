package Exercicios;

import java.util.Scanner;

public class Exercicio1Decisao {
public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);

		int numero, i,  maior = 0;
	
		
		for (i=0;i<=2;i++) {
		System.out.println("Escreva um numero: ");
		numero = ler.nextInt();
		
		if (numero > maior) {
			maior = numero;
		}
		
		}
		System.out.println("O maior valor �: " + maior);
		ler.close();
	
	
	
}
}
