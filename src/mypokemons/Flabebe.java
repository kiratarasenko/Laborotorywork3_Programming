package src.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.mymoves.*;

public final class Flabebe extends Pokemon {

	public Flabebe(java.lang.String name, int level) {
		super(name, level);

		
		setType(Type.FAIRY);
		setStats(44, 38, 39, 61, 79, 42);
		setMove(new Confide(), new Psychic(), new VineWhip(), new DoubleTeam());
	}
}
