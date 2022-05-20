package ExerciciosPOO;

public class Funcionario2 {
	public static void main(String[] args) {

	Funcionario1 funcionarioNovo = new Funcionario1();
	System.out.println("===== Dados do funcionario=====:");
		
	funcionarioNovo.setNome("Tais");
	funcionarioNovo.setCargo("Desenvolvedora Full Stack");
	funcionarioNovo.setMatricula("7685");
	funcionarioNovo.setSalario("R$ 4.500");
	
	System.out.println("Nome: " + funcionarioNovo.getNome());
	System.out.println("Cargo: " + funcionarioNovo.getNome());
	System.out.println("Matricula: " + funcionarioNovo.getMatricula());
	System.out.println("Salario: " + funcionarioNovo.getSalario());
		
	
	
	funcionarioNovo.folgar();
	

	}	
	
}
