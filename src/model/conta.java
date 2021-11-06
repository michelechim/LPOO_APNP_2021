package model;

public abstract class conta {
	/* atributo */
	protected double saldo;
	
	/* m�todos */
	public void deposita(double valor) {
		saldo  += valor;	
	}
	
	public void saca(double valor) {
		saldo  -= valor;
	}
	
	public void atualiza(double taxa) {
		saldo += saldo * (taxa/100);
	}
	
}
