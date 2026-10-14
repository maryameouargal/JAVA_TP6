package com.example.tp;

public class MediaLibrary {
	private Media[] items = new Media[4];
    private int count = 0;

    // Ajoute un media 
    public void add(Media m) {
        if (count == items.length) {
            Media[] bigger = new Media[items.length * 2];
            System.arraycopy(items, 0, bigger, 0, items.length);
            items = bigger;
        }
        items[count] = m;
        count++;
    }

    // Affiche tous les medias 
    public void playAll() {
        System.out.println("Contenu de bibliotheque");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    // Somme 
    public int totalDuration() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();
            if (d > 0) {
                total += d;
            }
        }
        return total;
    }
}
