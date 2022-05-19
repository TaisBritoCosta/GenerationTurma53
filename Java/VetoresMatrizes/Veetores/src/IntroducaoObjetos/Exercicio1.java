package IntroducaoObjetos;

import java.util.Scanner;

public class Exercicio1 {
	String nome;
	String email;
	int categoria;
	int metodoPagamento;
	
	void voucher() {
		

		if (categoria == 2 && metodoPagamento == 2 ) {
			System.out.println("\nOl�, " + nome + ". Verificamos seu email " + email 
					+ " e voce recebera um voucher de R$25,00!!!");

		}
		else if (categoria == 1 && metodoPagamento == 2) {
			System.out.println("\nOl� " + nome + ". Verificamos seu email " + email 
					+ " e voc� recebera um voucher de R$15,00!!!");
		}
		else {
		
		System.out.println("\nOl�, " + nome + ". Verificamos seu email " + email 
				+ " e voc� n�o tem direito ao voucher... continue comprando para acumular pontos!!!");
		
		}
	}
}