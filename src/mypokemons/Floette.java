package src.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.mymoves.*;

public final class Floette extends Pokemon {

	public Floette(java.lang.String name, int level) {
		super(name, level);

		setType(Type.FAIRY);
		setStats(54, 45, 47, 75, 98, 52);

		setMove(new Confide(), new Psychic(), new VineWhip());
	}
}
