package Pacotejava;

import java.util.Scanner;

public class classeInicio {
	
	public static void main (String [] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3;
		
		
		
		System.out.println(" Entre com o valor de N1: ");
		n1 = ler.nextInt();
		
		System.out.println(" Entre com o valor de N2: ");
		n2 = ler.nextInt();
		
	    System.out.println("Entre com o valor de N3: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1> n3) {
		System.out.println("O primeiro valor e o maior");
	    	
		}else if (n2 > n1 && n2 > n3) {
		System.out.println("O segundo valor e o maior");
		
		}else if (n3 > n1 && n3 > n2) {
		System.out.println("O terceio valor e o maior");
		
	
		}
		
		
		}
}








      
        
        