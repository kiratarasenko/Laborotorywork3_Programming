package src.mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove{
	public FurySwipes() { 
		super(Type.NORMAL, 18, 80, 15, 4);
	}
	
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
		
	}
}
