package src.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.mymoves.*;

public final class PsyDuck extends Pokemon {

	public PsyDuck(java.lang.String name, int level) {
		super(name, level);

		setType(Type.WATER);
		setStats(50, 52, 48, 65, 50, 55);

		Scratch scratch = new Scratch();
		FurySwipes furySwipes = new FurySwipes();
		WaterGun waterGun = new WaterGun();

		setMove(scratch, furySwipes, waterGun);
	}
}
