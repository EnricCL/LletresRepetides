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
		
		//Variables globals que es reutilitzen en els bucles
		char lletra;		
		int comptador = 0;
		
		//Llista de Characters per al nom
		List<Character> nom = new ArrayList<>();
		
		//El nom que es guardarà a la llista
		nom.add('E');
		nom.add('n');
		nom.add('r');
		nom.add('i');
		nom.add('c');
		
		//Llista de nombre de vegades que apareixen
		List<Integer> comptarLletres = new ArrayList<>();
		
		//LinkedHashMap per emmagatzemar nom i nombre per ordre d'inclusió
		LinkedHashMap< String, String> persona = new LinkedHashMap<String, String>();				
		
		//Bucle per recorrer el nom
		for (int i=0; i<nom.size(); i++) {
			
			lletra=nom.get(i); //S'emmagatzema la lletra actual	
			
			//Bucle per a obtenir el nombre de vegades que apareix la lletra actual
			for(int j=0; j<nom.size(); j++) {
				if(nom.get(j) == lletra) comptador++;
			}
			//S'afegeix al llistat de nombres comptarlletres
			comptarLletres.add(comptador);
			comptador=0;
			
			//S'inclou al Map la lletra actual, aprofitant el nº de iteració com a clau
			persona.put(Integer.toString(i), String.valueOf(lletra));
			
		}
		
		//Bucle per afegir al Map el nombre de vegades que apareixen
		for (int i=0; i<comptarLletres.size(); i++) {
			persona.put(Integer.toString(nom.size()+i), String.valueOf(comptarLletres.get(i)));
		}
		
		//Per a comprovar que es guarden les lletres de la llista i el nombre de vegades que apareixen
		System.out.println(persona);
	}

}
