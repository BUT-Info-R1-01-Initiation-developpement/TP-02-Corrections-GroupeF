package tp02.activite02

fun main() {
    // Pourquoi ce code peut-il être considéré comme "meilleur"
    // que le code du fichier `01_Bye.kt` ?
    // Ce code permet d'éviter la duplication du code permettant la première saisie
    // de l'utilisateur.
    // Le do-while en exécutant au moins une fois le contenu du bloc de code la boucles
    // est particulièrement adapté à cette situation.
    var saisieUtilisateur: String
    do {
        println("Saisis un texte et appuie sur entrée...")
        saisieUtilisateur = readln()
        println("Tu as saisi : $saisieUtilisateur")
    } while (saisieUtilisateur != "bye")
    println("Au revoir")
}