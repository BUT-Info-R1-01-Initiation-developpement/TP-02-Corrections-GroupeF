package tp02.activite03

// Cette fonction doit demander à l'utilisateur de saisir des nombres
// jusqu'à ce qu'il saisisse 0, puis afficher le plus grand nombre saisi
fun trouveMax() {
    println("Entrez un nombre (0 pour terminer):")
    var nombreSaisi = readln().toInt()
    var nombreMax = nombreSaisi
    while (nombreSaisi != 0) {
        println("Entrez un nombre (0 pour terminer):")
        nombreSaisi = readln().toInt()
        if (nombreSaisi != 0 && nombreSaisi > nombreMax) {
            nombreMax = nombreSaisi
        }
    }
    if (nombreMax == 0) {
        println("Pas de nombre saisi différent de 0")
    } else {
        println("Le plus grand nombre saisi (hors 0) est: $nombreMax")
    }
}


fun main() {
    trouveMax()
}

// Identifiez l'erreur de compilation et expliquez-la en français.
// Variable utilisé&e alors qu'elle n'était pas assignée.

// Que se passe-t-il si l'utilisateur entre uniquement des nombres négatifs puis 0 ?
// ....

