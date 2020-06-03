package lletresRepetides;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercici:
 * L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb diferents variants (fases).
 * FASE 4
 * · Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
 * · Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona.
 * És a dir, partim de la llista name i surname i al acabar l'execució només tindrem una que es dirà fullName.
 * FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
 * 
 * @author Enric Comes
 *
 */
public class Fase4 {

	public static void main(String[] args) {
		
		//Llista de Characters per al nom
		List<Character> nom = new ArrayList<>();
				
		//El nom que es guardarà a la llista
		nom.add('E');
		nom.add('n');
		nom.add('r');
		nom.add('i');
		nom.add('c');
		
		//Llista de Characters per al cognom
		List<Character> cognom = new ArrayList<>();
		
		//El cognom que es guardarà a la llista
		cognom.add('C');
		cognom.add('o');
		cognom.add('m');
		cognom.add('e');
		cognom.add('s');
		
		//Lista junta
		List<Character> fullName = new ArrayList<>();
		
		//Bucles per juntar nom, un espai i el cognom en una sola llista
		for(int i=0; i<nom.size(); i++) {
			fullName.add(nom.get(i));
		}
		fullName.add(' ');
		for(int i=0; i<cognom.size(); i++) {
			fullName.add(cognom.get(i));
		}
		
		//Comprovar la llista junta
		System.out.println("FullName: "+fullName);		

	}

}
