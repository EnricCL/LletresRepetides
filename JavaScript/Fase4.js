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

var nom = ["E","n","r","i","c"]
var cognom = ["C","o","m","e","s"]
var fullName = []

//Bucle per afegir nom al fullName, l'espai i el cognom
for(var i = 0; i < nom.length ; i++){
    fullName.push(nom[i])
}
fullName.push(" ")
for(var j = 0; j < cognom.length ; j++){
    fullName.push(cognom[j])
}

//Comprovar la llista junta
console.log("Fullname: ["+fullName+"]")