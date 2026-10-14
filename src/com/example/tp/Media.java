 package com.example.tp;

public class Media {
    protected String titre;

//	THE CONSTRUCTEUR USING SOURCE ONLY 
	public Media(String titre) {
		this.titre = titre;
	} 
//   Duree par defaut 
    public int getDuree() {
        return 0;
    }
    
//  JUST USING TO SRING BY SOURCE INSTEAD 
    
	@Override
	public String toString() {
		return "Media [titre=" + titre + "]";
	}   
    
   
}
