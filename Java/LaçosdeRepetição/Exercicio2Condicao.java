package ExerciciosJava;

import java.util.Scanner;

//Ler 10 numeros e imprimir quantos sao pares e quantos sao impares.

public class Exercicio2Condicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	int i,numero ,nPares = 0, nImpares = 0;
		
		for (i=1; i<=10; i++) {
		System.out.println("\nDigite os numeros: ");
		numero= ler.nextInt();	
			
		if (numero % 2 == 0) {
			nPares++;
		
	}else {
		nImpares++;
	}
	
	}
      System.out.println("O total de numeors pares sao:" + nPares);
      System.out.println("O total de numeors pares sao:" + nImpares);
	

}
	}