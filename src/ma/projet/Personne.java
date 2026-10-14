package ma.projet;

public abstract class Personne {
	protected final String nom;
	protected final double salaireBase;

//		THE CONSTRUCTEUR USING SOURCE ONLY

	public Personne(String nom, double salaireBase) {
		this.nom = nom;
		this.salaireBase = salaireBase;
	}
//  METHOD TO REDFENY IT 
	public abstract double calculerSalaire();
	
//  JUST USING TO SRING BY SOURCE INSTEAD 	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", salairee=" + calculerSalaire() + "]";
	}

}
