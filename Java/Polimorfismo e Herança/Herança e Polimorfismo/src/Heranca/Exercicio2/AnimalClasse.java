package Heranca;

public class AnimalClasse {

	private String nome, som ,acao;
	private int idade;
	
	public AnimalClasse(String nome , int idade ,String som) {
		super();
		this.nome=nome;
		this.idade=idade;
		this.som=som;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome=nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
	    this.som=som;
	}
	public String getAcao() {
		return acao;		
	}
	public void setAcao (String acao) {
		this.acao=acao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
}
