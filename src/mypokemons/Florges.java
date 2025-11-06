package src.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.mymoves.*;

public final class Florges extends Pokemon {

	public Florges(java.lang.String name, int level){
		super(name, level);
		
		super.setType(Type.FAIRY);
		super.setStats(44, 38, 39, 61, 79, 42);
	
		
		
		super.setMove(new Confide(), new Psychic());
	}
}

