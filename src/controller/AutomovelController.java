package controller;

import java.util.ArrayList;
import java.util.List;

import model.Automovel;

public class AutomovelController {

	public static void main(String[] args) {
		Automovel aa = new Automovel("Ford", "Fiesta", 2010);
		System.out.println(aa);
		
		Automovel a1 = new Automovel();
		a1.setMarca("Fiat");
		a1.setModelo("Bravo");
		a1.setAnoFabricacao(2021);
		System.out.println(a1.getMarca() + " " + a1.getModelo() + " " + a1.getAnoFabricacao());

		Automovel a2 = new Automovel();
		System.out.println(a2.getMarca() + " " + a2.getModelo() + " " + a2.getAnoFabricacao());

		Automovel a3 = new Automovel();
		System.out.println(a3.getMarca() + " " + a3.getModelo() + " " + a3.getAnoFabricacao());
		
		//array
		//Criar uma Collection
		List<Automovel> automovelList = new ArrayList<>();
		automovelList.add(a1);
		automovelList.add(a2);
		automovelList.add(a3);
		System.out.println(automovelList);
//		System.out.println(automovelList.get(0));
//		System.out.println(automovelList.get(1));
//		System.out.println(automovelList.get(2));
		automovelList.forEach(
				a -> System.out.println(a)
		);
//		for (int i = 0; i < automovelList.size(); i++) {
//			System.out.println(automovelList.get(i));
//		}
	}

}