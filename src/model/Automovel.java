package model;

public class Automovel {
	// atributos
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//m�todos construtores (Utiliza sobrecarga de fun��o (m�todo))
	//Construtor Padr�o ou Vazio
	public Automovel() {
		
	}
	
	//Construtor Parametrizado
	public Automovel(String marca, String modelo, int anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	//m�todos acessores
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