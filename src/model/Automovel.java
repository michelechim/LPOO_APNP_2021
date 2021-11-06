package model;

public class Automovel {
	// atributos
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//métodos construtores (Utiliza sobrecarga de função (método))
	//Construtor Padrão ou Vazio
	public Automovel() {
		
	}
	
	//Construtor Parametrizado
	public Automovel(String marca, String modelo, int anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	//métodos acessores
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
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public String toString() {
		return "\nAutomovel [marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + "]";
	}

	
		
} //fim de Automovel