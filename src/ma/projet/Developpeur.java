package ma.projet;

public class Developpeur extends Personne {

//	THE CONSTRUCTEUR USING SOURCE ONLY
	public Developpeur(String nom, double salaireBase) {
		super(nom, salaireBase);
	}
	
    @Override
    public double calculerSalaire() {
        return salaireBase * 1.10;
    }	

}
