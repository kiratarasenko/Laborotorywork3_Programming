package src.mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Swagger extends StatusMove{
	
	public Swagger() {
		super(Type.NORMAL, 0, 85);
		
		
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect.confuse(p);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect e = new Effect().stat(Stat.ATTACK, 2);
		
		p.addEffect(e);
	}
	
	
	@Override
	protected String describe() {
		String[] pieces = this.getfinal class().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
		
	}

}
