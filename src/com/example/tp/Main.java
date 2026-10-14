package com.example.tp;

public class Main {
	public static void main(String[] args) {

		// Tableau de Forme
		Forme[] formes = { new Cercle("Red", 6.0), new Rectangle("Bleu", 5.0, 4.0), new Triangle("green", 6.0, 2.5),
				new Forme("black") };

		for (Forme f : formes) {
			System.out.println(f);
		}
	}

}
