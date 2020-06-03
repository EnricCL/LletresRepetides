package lletresRepetides;

/**
 * Exercici:
 * L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb diferents variants (fases).
 * FASE 1
 * ● Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
 * ● Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
 * 
 * @author Enric Comes
 */
public class Fase1 {

	public static void main(String[] args) {
		
		char [] nom = {'E','n','r','i','c'};
		
		for (int i=0; i < nom.length ; i++) {
			System.out.print(nom[i]);
		}
	}
}
