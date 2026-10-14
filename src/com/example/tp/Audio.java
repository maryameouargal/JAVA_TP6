package com.example.tp;

public class Audio extends Media {

    private int duree;
    
//	THE CONSTRUCTEUR USING SOURCE ONLY 
	public Audio(String titre, int duree) {
		super(titre);
		this.duree = duree;
	}
	
    @Override
    public int getDuree() {
        return duree;
    }
//  JUST USING TO SRING BY SOURCE INSTEAD 

	@Override
	public String toString() {
		return "Audio [duree=" + duree + "s, titre=" + titre + "]";
	}
    
}
