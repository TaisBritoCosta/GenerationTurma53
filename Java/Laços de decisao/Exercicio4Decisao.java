package Exercicios;

import java.util.Scanner;

public class Exercicio4Decisao {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
    
	int numero;
	
    System.out.println("Digite um numero :");
	numero = ler.nextInt();
	
	if (numero % 2 == 0) {
    System.out.println("O numero e par !" + "Sua raiz quadrada e :" + + Math.sqrt (numero));		
	}
	else {
	System.out.println("O numero é impar! " + "O numero elevado ao quadrado e :" + + Math.pow(numero, 2.0));	
		
	}
	
  }

}
