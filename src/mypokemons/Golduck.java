package src.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.mymoves.*;

public final class Golduck extends Pokemon {

	public Golduck(java.lang.String name, int level) {
		super(name, level);

		setType(Type.WATER);
		setStats(80, 82, 78, 95, 80, 85);

		setMove(new FurySwipes(), new Scratch(), new WaterGun(), new AquaJet());
	}
}
