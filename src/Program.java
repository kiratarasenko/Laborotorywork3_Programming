package src;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import src.mypokemons.*;

public class Program {

	// https://pokemondb.net/pokedex/zekrom
	// https://pokemondb.net/pokedex/psyduck
	// https://pokemondb.net/pokedex/golduck
	// https://pokemondb.net/pokedex/flabebe
	// https://pokemondb.net/pokedex/floette
	// https://pokemondb.net/pokedex/florges

	public static void main(String[] args) {

		Battle b = new Battle();
		Pokemon p1 = new PsyDuck("aka", 1);
		Pokemon p2 = new Zekrom("oko", 1);
		Pokemon p3 = new Golduck("eke", 1);
		Pokemon p4 = new Flabebe("iki", 1);
		Pokemon p5 = new Floette("oqo", 1);
		Pokemon p6 = new Florges("aqa", 1);

		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p5);

		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p6);

		b.go();

	}

	public static boolean chance(double d) {
		return d > Math.random();
	}
}
