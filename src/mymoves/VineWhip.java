package src.mymoves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class VineWhip extends PhysicalMove {
	public VineWhip() {
		super(Type.GRASS, 45, 100);
	}

	@Override
	protected String describe() { return "использует VineWhip";}
}
