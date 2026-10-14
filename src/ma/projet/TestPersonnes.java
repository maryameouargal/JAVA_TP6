package ma.projet;

import java.util.ArrayList;
import java.util.List;

public class TestPersonnes {

	public static void main(String[] args) {

		List<Personne> equipe = new ArrayList<>();
		equipe.add(new Developpeur("Yassine", 5000));
		equipe.add(new Manager("ME", 8000));
		equipe.add(new Developpeur("NOT ME ", 650));

		Utils.listerPersonnes(equipe);
	}
}