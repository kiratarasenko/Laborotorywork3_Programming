package src.mymoves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class HyperVoice extends SpecialMove {

	public HyperVoice() {
		super(Type.NORMAL, 90, 100);

	}

	@Override
	protected String describe() { return "does HyperVoice";}
}
