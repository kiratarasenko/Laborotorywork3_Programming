package src.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.mymoves.*;

public final class Floette extends Pokemon {

	public Floette(java.lang.String name, int level) {
		super(name, level);

		super.setType(Type.FAIRY);
		super.setStats(54, 45, 47, 75, 98, 52);

		super.setMove(new Confide(), new Psychic(), new VineWhip());
	}
}
