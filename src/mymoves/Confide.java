package src.mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Confide extends StatusMove {
	public Confide() {
		super(Type.NORMAL, 0, 0);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {

		Effect e = new Effect().chance(1).stat(Stat.SPECIAL_ATTACK, -1);

		p.addEffect(e);

	}
	@Override
	protected String describe() { return "does Confide";}
}
