package com.example.tp;

public class Video extends Media {

    private int duree;
    private String resolution;
    
//	THE CONSTRUCTEUR USING SOURCE ONLY 
	public Video(String titre, int duree, String resolution) {
		super(titre);
		this.duree = duree;
		this.resolution = resolution;
	}
	
    @Override
    public int getDuree() {
        return duree;
    }

//  JUST USING TO SRING BY SOURCE INSTEAD   
    @Override
    public String toString() {
        return "Video : " + titre + " (" + duree + "s, " + resolution + ")";
    }

}
