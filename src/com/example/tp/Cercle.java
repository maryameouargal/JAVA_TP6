package com.example.tp;

public class Cercle extends Forme {

    private double rayon;

//	THE CONSTRUCTEUR USING SOURCE ONLY 
    public Cercle(String couleur, double rayon) {
    	super(couleur);
    	this.rayon = rayon;
    }
 // METHODE POUR L' Aire 
    
    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
    
//  JUST USING TO SRING BY SOURCE AND CHANGING IT instead  VOID DESSINER  AND ADDING TO IT 
	@Override
	public String toString()   {
		return "Dessiner Cercle De couleur "+ couleur + "-> rayon=" + rayon +  ", aire=" + aire()+"]";
	}

}