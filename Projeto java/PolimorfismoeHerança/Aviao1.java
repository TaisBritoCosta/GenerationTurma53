package ObjetosPooExAviao;

public class Aviao1 {
	 String modelo;
	 int ano=2010;
    boolean decolando;
    
    {
   	 System.out.println("Modelo do aviao: " + this.modelo);
        System.out.println("O ano do aviao: " + this.ano);
        System.out.println(" O aviao esta decolando? " + this.decolando);
    }
    
  
   void decolar() {
   	this.decolando = true;
   	
   }
  
   void pousar () {
   	this.decolando = false;

}
  
    
}
