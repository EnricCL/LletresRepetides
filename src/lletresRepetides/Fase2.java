package lletresRepetides;

/**
 * Exercici:
 * L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb diferents variants (fases).
 * FASE 2
 * ● Canvia la taula per una llista (List<Character>)
 * ● Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
 * ● Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’
 * 
 * @author Enric Comes
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
		
		List<Character> nom = new ArrayList<>();
		
		//afegeixo el nom a la llista de characters
		nom.add('E');
		nom.add('n');
		nom.add('r');
		nom.add('i');
		nom.add('c');
		
		/* bucle que comprova si el character és un nombre o una lletra,
		* després passa tot a minúscules i comprova si és vocal o consonant
		*/
		for (Character element:nom) {
			if(Character.isDigit(element)) {
				System.out.println("Els noms de persones no contenen números!");
			}else {
				if(	Character.toLowerCase(element) == 'a' || 
					Character.toLowerCase(element) == 'e' || 
					Character.toLowerCase(element) == 'i' ||
					Character.toLowerCase(element) == 'o' ||
					Character.toLowerCase(element) == 'u' ) {
					System.out.println("VOCAL");
				}else {
					System.out.println("CONSONANT");
				}
			}		
		}		
	}
}
