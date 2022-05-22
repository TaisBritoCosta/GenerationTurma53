package Exercicios;

import java.util.ArrayList;

public class Colecttions {
	

		    public static void main(String[] args) {

		        String estoque1 = "sandalias";
		        String estoque2 = "camisetas";
		        String estoque3 = "vestidos";
		        String estoque4 = "saias";
		        String estoque5 = "calcas jogger";

		        ArrayList<String> loja = new ArrayList<>();

		      //Armazenar dados da List

		        loja.add(estoque1);
		        loja.add(estoque2);
		        loja.add(estoque3);
		        loja.add(estoque4);
		        loja.add(estoque5);

		       //Apresentando dados

		        System.out.println(loja);

		      // removendo dados da lista
		 
		     loja.remove(4);

		      //Apresentando dados atualizados

		        System.out.println(loja);

		      //Atualizar dados da list

		       loja.add("saias");


		//Apresentando dados atualizados
		        System.out.println(loja);


		        for (String i: loja) {

		            System.out.println("Estoque da Loja: " + i);

         }
    }
}

