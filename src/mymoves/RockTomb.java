package src.mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class RockTomb extends PhysicalMove {
	public RockTomb() {
		super(Type.ROCK, 60, 95);

	}

	@Override
	protected void applyOppEffects(Pokemon p) {

		Effect e = new Effect().stat(Stat.SPEED, -1);

		p.addEffect(e);
	}

	@Override
	protected String describe() { return "использует RockTomb";}
}
