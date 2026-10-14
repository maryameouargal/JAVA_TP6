package com.example.tp;

public class Rectangle extends Forme {

    private double largeur;
    private double hauteur;
    
//	THE CONSTRUCTEUR USING SOURCE ONLY 
    
	public Rectangle(String couleur, double largeur, double hauteur) {
		super(couleur);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	//METHODE POUR L' Aire 
	
    @Override
    public double aire() {
        return largeur * hauteur;
    }

//  JUST USING TO SRING BY SOURCE AND CHANGING IT TO VOID DESSINER  AND ADDING TO IT 
	
	@Override
	public String toString() {
		return "Dessiner Rectangle "+ couleur 
	            + " -> " + largeur + " x " + hauteur + ", aire=" + aire();
	}


}