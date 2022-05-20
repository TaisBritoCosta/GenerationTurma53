package ExerciciosPOO;

public class EletronicoMolde {

	private String marca;
	private String modelo;
	private String preco;
	boolean carregado;
	
	void comprar () {
		System.out.println("Comprar esse celular");
	}
	void carregar() {
		System.out.println("Carregar esse celular");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String string) {
		this.preco = string;
	}
	
public void carregado1() {
	this.carregado = true;
}

public void carregado() {
	this.carregado = false;


}
}
