package lletresRepetides;

import java.util.*;

/**
 * Exercici:
 * L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb diferents variants (fases).
 * FASE 3
 * ● Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.
 * 
 * @author Enric Comes
 *
 */

public class Fase3 {

	public static void main(String[] args) {
		
		//Variable global que es reutilitza en els bucle
		int comptador = 0;
		
		//Llista de Characters per al nom
		List<Character> nom = new ArrayList<>();
		
		//El nom que es guardarà a la llista
		nom.add('E');
		nom.add('n');
		nom.add('r');
		nom.add('i');
		nom.add('c');
		
		//LinkedHashMap per emmagatzemar lletra i nombre per ordre d'inclusió
		LinkedHashMap< String, String> persona = new LinkedHashMap<String, String>();				
		
		//Bucle per recorrer el nom
		for (int i=0; i<nom.size(); i++) {	
			
			//Bucle per a obtenir el nombre de vegades que apareix la lletra actual
			for(int j=0; j<nom.size(); j++) {
				if(nom.get(j) == nom.get(i)) comptador++;
			}
			
			//S'inclou al Map la lletra actual i les vegades que hi surt
			persona.put(String.valueOf(nom.get(i)), Integer.toString(comptador));
			comptador=0; //reinici del comptador per a la següent lletra
			
		}
		
		//Per a comprovar que es guarden les lletres de la llista i el nombre de vegades que apareixen
		System.out.println(persona);
	}

}
