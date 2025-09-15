package tp02.activite02     // indique qu'on se trouve dans un "espace de nom"
                            // ce sera expliqué plus tard dans l'année

fun main() {
    println("Saisis un texte et appuie sur entrée...")
    // Récupération du texte saisi par l'utilisateur
    var saisieUtilisateur = readln()
    println("Tu as saisi : $saisieUtilisateur")
    // Tant que l'utilisateur ne saisie pas "bye"
    // on affiche ce qu'a saisi l'utilisateur.
    // S'il a saisi "bye", on affiche "bye" et on sort de boucle
    while (saisieUtilisateur != "bye") {
        println("Saisis un texte et appuie sur entrée...")
        saisieUtilisateur = readln()
        println("Tu as saisi : $saisieUtilisateur")
    }
    // On affiche au revoir
    println("Au revoir")
}