package Heranca;

public class TesteAnimaisE2 {
   
	public static void main(String[] args) {
	   CachorroE2 cachorroE2 = new CachorroE2 ("Scooby",22,"AuAuAuAu");
	   CavaloE2 cavaloE2 = new CavaloE2 ("Simba", 3, "Pocotopocoto");
	   PreguicaE2 preguicaE2 = new PreguicaE2("Suzana", 1, "ZzZzZzZzzZ");
	   
	   
	   System.out.printf("O cachorro %s tem %d anos e faz %s", cachorroE2.getNome(), cachorroE2.getIdade(), cachorroE2.getSom());
		System.out.printf("\nO cavalo %s tem %d anos e faz %s", cavaloE2.getNome(), cavaloE2.getIdade(), cavaloE2.getSom());
		System.out.printf("\nA preguica %s tem %d anos e faz %s", preguicaE2.getNome(), preguicaE2.getNome(), preguicaE2.getSom());
	}
}
