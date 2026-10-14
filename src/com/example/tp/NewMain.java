package com.example.tp;

public class NewMain {
	public static void main(String[] args) {

        MediaLibrary lib = new MediaLibrary();

        lib.add(new Audio("lotus folwer", 1800));
        lib.add(new Video(" make up Tutoriel ", 900, "1080p"));
        lib.add(new LiveStream("Concert live", "http://live.example.com"));
        lib.add(new Audio("seoul city ", 2400));

        lib.playAll();

        System.out.println();
        System.out.println("Duree totale = " + lib.totalDuration() + " s");
    }
}
