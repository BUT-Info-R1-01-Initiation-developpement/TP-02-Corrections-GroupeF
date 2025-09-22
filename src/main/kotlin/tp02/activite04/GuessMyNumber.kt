package tp02.activite04

import kotlin.ranges.random
import kotlin.text.toInt
import kotlin.text.trimIndent

fun guessMyNumber() {
    // Indication à l'utilisateur
    println(
        """
        Bienvenue sur le jeu Guess My Number !
        
        Tu dois trouver un nombre entier compris entre 0 et 100 choisi par le programme.
        Tu disposes d'autant d'essais que tu le souhaites.
        Tu peux stopper le jeu à tout moment en saisissant le mot "bye".
    """.trimIndent()
    )
    // Stockage du "stop word" dans une constante
    val stopWord = "bye"
    // stockage du nombre d'essais max
    val nombreMaxEssais = 5
    // Génération du nombre à trouver
    val nombreATrouve = (0..100).random()
    // Lecture de la saisie utilisateur
    println("Saisie une valeur :")
    var texteSaisi = readln()
    // État du joueur (n'a pas encore gagné)
    var joueurAGagné = false
    var nombreEssais = 0
    // Boucle du jeu
    while (texteSaisi != stopWord && !joueurAGagné && nombreEssais < nombreMaxEssais) {
        // conversion en Int du texte saisi
        val nombreSaisi = texteSaisi.toInt()
        // traitement de l'essai en cours
        nombreEssais++
        if (nombreSaisi == nombreATrouve) {
            joueurAGagné = true  // on change l'état du joueur
            println("Gagné avec $nombreEssais essai${if (nombreEssais > 1) "s" else ""}.")
        } else if (nombreSaisi < nombreATrouve) {
            println("Trop petit !")
        } else {
            println("Trop grand !")
        }
        if (!joueurAGagné) {
            if (nombreEssais < nombreMaxEssais) {
                println("Saisie une valeur :")
                texteSaisi = readln()
            } else {
                println("Perdu car tu as consommé tes $nombreEssais essais !")
                println("Le nombre à trouver était : $nombreATrouve.")
            }
        }
    }
    println("Au revoir")
}

fun main() {
    guessMyNumber()
}