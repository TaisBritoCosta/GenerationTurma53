package Pacotejava;

public class Cliente {
   String nome;
   int idade;
   String email;
   boolean comprando;
   void status() {
     System.out.println("Cliente novo!!" + this.nome);
     System.out.println(" Idade do cliente :" + this.idade);
     System.out.println("Email de cadastro: " + this.email);
     System.out.println("Essa cliente esta comprando? " + this.comprando );
   }
    
    void comprando() {
    	this.comprando = true;
    	
    }
   
    void economizando () {
    	this.comprando = false;
    }
   
}
