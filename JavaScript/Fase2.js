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

 var nom = ["E","n","r","i","c"]

 for(var i=0; i<nom.length; i++){
     if(nom[i] >= 0 || nom[i] <= 9){
         console.log("Els noms de persones no contenen números!")
     }else{
         if(nom[i].toLowerCase() == "a" ||
            nom[i].toLowerCase() == "e" ||
            nom[i].toLowerCase() == "i" ||
            nom[i].toLowerCase() == "o" ||
            nom[i].toLowerCase() == "u" ){
                console.log("VOCAL")
         }else{
             console.log("CONSONANT")
         }
     }
 }