package ExerciciosJava;
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class Exercicio2DoWhile {
	
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

   int numero, soma = 0, contador = 0;
   
   do {
   System.out.println("Digite um numero ! Ou se quiser sair digite 0");
   numero = ler.nextInt();
 
   if (numero%3==0) {
	   soma= soma + numero;
		contador++;
		soma = soma + numero;
   }
   
   } while (numero != 0);
    System.out.println("A media dos numeros multiplos de 3 e :" + soma / contador);

   }

}

	
	