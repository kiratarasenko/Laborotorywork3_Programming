javac -cp lib/Pokemon.jar -d dist src/*.java src/mymoves/*.java src/mypokemons/*.java
jar cfm lab2.jar MANIFEST.MF -C dist .