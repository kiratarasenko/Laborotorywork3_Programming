package src.mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.mymoves.*;

public final class Zekrom extends Pokemon {

	public Zekrom(java.lang.String name, int level) {
		super(name, level);

		super.setType(Type.DRAGON, Type.ELECTRIC);
		super.setStats(100, 150, 120, 120, 100, 90);

		RockSlide rockSlide = new RockSlide();
		HyperVoice hyperVoice = new HyperVoice();
		Swagger swagger = new Swagger();
		RockTomb rockTomb = new RockTomb();

		super.setMove(rockSlide, hyperVoice, swagger, rockTomb);
	}
}
