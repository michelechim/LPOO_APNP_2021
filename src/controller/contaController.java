package controller;

import model.ContaPoupanša;
import model.ContaCorrente;


public class contaController {
	
	public static void main(String[] args) {
		// conta c = new conta();
		
		ContaPoupanša cp = new ContaPoupanša();
		ContaCorrente cc = new ContaCorrente();
		
		cp.deposita(1000.00);
		System.out.println(cp);
		
		cp.deposita(5000.00);
		System.out.println(cc);
	}

}
