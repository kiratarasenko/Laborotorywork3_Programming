package src.mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AquaJet extends PhysicalMove{
	public AquaJet() { 
		
	super(Type.WATER, 40, 100, 1, 1);
	
	
	}
		
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
		
	}
}
