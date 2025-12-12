package src.mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class FurySwipes extends PhysicalMove {
	public FurySwipes() {
		super(Type.NORMAL, 18, 80, 15, 4);
	}

	@Override
	protected String describe() { return "использует FurySwipes";}
}
