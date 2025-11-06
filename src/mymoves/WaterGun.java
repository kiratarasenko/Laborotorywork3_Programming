package src.mymoves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove{
	public WaterGun() { 
	super(Type.WATER, 40, 100);
	
	
	}
		
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
		
	}
}