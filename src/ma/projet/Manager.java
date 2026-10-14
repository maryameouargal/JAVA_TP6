package ma.projet;

public class Manager extends Personne {

//	THE CONSTRUCTEUR USING SOURCE ONLY
	public Manager(String nom, double salaireBase) {
		super(nom, salaireBase);
	}

	@Override
	public double calculerSalaire() {
		return salaireBase * 1.30;
	}
}
