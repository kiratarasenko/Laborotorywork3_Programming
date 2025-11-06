package src.mymoves;

import src.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class RockSlide extends PhysicalMove{

		
		public RockSlide() {
			super(Type.ROCK, 75, 90);
			
			}
		
		@Override
		protected void applyOppEffects(Pokemon p) {
			
			if(Program.chance(0.3)) {
				Effect.flinch(p);
			}
			
		}
		
		
		@Override
		protected String describe() {
			String[] pieces = this.getClass().toString().split("\\.");
			return "does " + pieces[pieces.length-1];
			
		}
}
