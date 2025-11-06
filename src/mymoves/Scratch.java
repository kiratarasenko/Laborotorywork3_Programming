package src.mymoves;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Scratch extends PhysicalMove{
	public Scratch() { 
	super(Type.NORMAL, 40, 100);
	}
		
	@Override
	protected String describe() {
		String[] pieces = this.getfinal class().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
		
	}
}

