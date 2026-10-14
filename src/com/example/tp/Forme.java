package com.example.tp;

public class Forme {
	protected String couleur;

//	THE CONSTRUCTEUR USING SOURCE ONLY 
	public Forme(String couleur) {
		this.couleur = couleur;
	}
	//METHODE POUR L' Aire 
    public double aire() {
        return 0.0;
    }

//    JUST USING TO SRING BY SOURCE AND CHANGING IT instead of  VOID DESSINER 
	@Override
	public String toString() {
		return "Dessiner une Forme [couleur=" + couleur +", aire=" + aire() + "]";
	}

}
