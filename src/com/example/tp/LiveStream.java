package com.example.tp;

public class LiveStream extends Media {

    private String url;

//	THE CONSTRUCTEUR USING SOURCE ONLY
    
	public LiveStream(String titre, String url) {
		super(titre);
		this.url = url;
	}
    @Override
    public int getDuree() {
        return -1; 
    }
//  JUST USING TO SRING BY SOURCE INSTEAD 
	@Override
	public String toString() {
		return "LiveStream [url=" + url + ", titre=" + titre + "]";
	}
    
}
