package ExerciciosJava;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class Exercicio1While {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	 int idade = 0, idade20 = 0, idade50 = 0 ;
	 
	 while (idade <= 98) {
		 System.out.println("Digite uma idade de 1 a 98 :");
		 idade = ler.nextInt();	 
	 
		if (idade < 21) {
			idade20++;
		}
		else if (idade >50 && idade <= 98) {
	        idade50++;
		}
		}
    System.out.println("Total de pessoas com menos de 21 anos: " + idade20);
    System.out.println("Total de pessoas com mais de 50 anos: " + idade50);

}
	 }

