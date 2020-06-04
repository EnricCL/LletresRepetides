/**
 * Exercici:
 * L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb diferents variants (fases).
 * FASE 3
 * ● Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.
 * 
 * @author Enric Comes
 *
 */

 //Variables global que es reutilitza en els bucles
 var comptador = 0

 //Array del nom
 var nom = ["E","n","r","i","c"]

 //Map per emmagatzemar nom i nombre
 var persona = new Map()

 //Bucle per recorrer el nom
 for(var i = 0; i < nom.length ; i++){

    lletra = nom[i] //S'emmagatzema la lletra actual

    //Bucle per a obtenir el nombre de vegades que 
    //apareix la lletra actual
    for(var j = 0; j < nom.length ; j++){
        if(nom[j] == nom[i]) comptador++
    }

    //S'inclou al Map la lletra actual 
    //amb les vegades que surt
    persona.set(nom[i] , comptador)
    comptador = 0 //reinicia comptador per a la següent lletra

 }

 //Per a comprovar que es guarden les lletres de la llista
 //i les vegades que apareixen
 console.log(persona)



