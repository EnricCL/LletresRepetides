/**
 * Exercici:
 * L’exercici consisteix en mostrar per consola quantes vegades apareix cada lletra del teu nom i cognoms amb diferents variants (fases).
 * FASE 3
 * ● Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.
 * 
 * @author Enric Comes
 *
 */

 //Variables globals que es reutilitzen en els bucles
 var lletra
 var comptador = 0

 //Array del nom
 var nom = ["E","n","r","i","c"]

 //Array per emmagatzemar el nombre de vegades que apareixen
 var comptarLletres = []

 //Map per emmagatzemar nom i nombre
 var persona = new Map()

 //Bucle per recorrer el nom
 for(var i = 0; i < nom.length ; i++){

    lletra = nom[i] //S'emmagatzema la lletra actual

    //Bucle per a obtenir el nombre de vegades que 
    //apareix la lletra actual
    for(var j = 0; j < nom.length ; j++){
        if(nom[j] == lletra) comptador++
    }

    //S'afegeix al llistat de nombres comptarLletres
    comptarLletres.push(comptador)
    comptador = 0

    //S'inclou al Map la lletra actual 
    //amb la clau de la iteració actual
    persona.set(i , lletra)

 }

 //Bucle per afegir al Map el nombre de vegades que apareixen
 for(var k = 0; k < comptarLletres.length ; k++){
     persona.set(nom.length+k , comptarLletres[k] )
 }

 //Per a comprovar que es guarden les lletres de la llista
 //i les vegades que apareixen
 console.log(persona)



