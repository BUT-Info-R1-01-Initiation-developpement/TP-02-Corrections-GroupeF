package tp02.activite02

fun main() {
    println("Saisie le mot dont tu veux compter les occurrences :")
    val motCompté = readln()
    var nombreOccurrences = 0 // Déclare et initialise nombreOccurences à 0
    var motSaisi: String  // Déclare la variable motSaisi
    do {
        println("Saisie un mot :")
        motSaisi = readln()
        if (motSaisi == motCompté) {
            nombreOccurrences++  // Incrémente le nombre occurrences.
        }
    } while(motSaisi != "bye")
    println("Le mot \"$motCompté\" a été saisi $nombreOccurrences fois")
}

// Dans ce contexte, nombreOccurrences++ peut s'écrire aussi
// de la manière suivante :
// nombreOccurences = nombreOccurences + 1
// ou encore
// nombreOccurences += 1

// Pourquoi est-on obligé de déclarer le type de la variable motSaisi à sa déclaration ?
// Car on assigne aucune valeur (aucun objet) à la variable motSaisi au moment de la déclaration.
