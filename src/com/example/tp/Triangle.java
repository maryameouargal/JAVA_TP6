package com.example.tp;

public class Triangle extends Forme {

    private double base;
    private double hauteur;
    
//	THE CONSTRUCTEUR USING SOURCE ONLY 
	public Triangle(String couleur, double base, double hauteur) {
		super(couleur);
		this.base = base;
		this.hauteur = hauteur;
	}
//  METHODE POUR L' Aire 
	
    @Override
    public double aire() {
        return (base * hauteur) / 2;
    }
	
//  JUST USING TO SRING BY SOURCE AND CHANGING IT instead  VOID DESSINER  AND ADDING TO IT 

	@Override
	public String toString() {
		return "Dessiner Triangle"+ couleur 
	            + " -> base = " + base + ", hauteur = " + hauteur+ ", aire=" + aire();
	}
	
    
}
