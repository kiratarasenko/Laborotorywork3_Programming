package src.mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public final class RockSlide extends PhysicalMove {

	public RockSlide() {
		super(Type.ROCK, 75, 90);

	}

	@Override
	protected void applyOppEffects(Pokemon p) {

		if (Utilities.chance(0.3)) {
			Effect.flinch(p);
		}

	}
	@Override
	protected String describe() { return "does RockSlide";}

}
