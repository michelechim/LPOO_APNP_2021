package controller;

import model.ContaPoupan�a;
import model.ContaCorrente;


public class contaController {
	
	public static void main(String[] args) {
		// conta c = new conta();
		
		ContaPoupan�a cp = new ContaPoupan�a();
		ContaCorrente cc = new ContaCorrente();
		
		cp.deposita(1000.00);
		System.out.println(cp);
		
		cp.deposita(5000.00);
		System.out.println(cc);
	}

}
