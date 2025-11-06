package src.mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class AquaJet extends PhysicalMove {
	public AquaJet() {

		super(Type.WATER, 40, 100, 1, 1);

	}

	@Override
	protected String describe() {
		String[] pieces = this.getfinal class().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
		
	}
}
