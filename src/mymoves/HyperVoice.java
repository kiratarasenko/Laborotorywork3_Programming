package src.mymoves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HyperVoice extends SpecialMove {
	
	public HyperVoice() {
		super(Type.NORMAL, 90, 100);
		
		
	}

	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
		
	}

}
