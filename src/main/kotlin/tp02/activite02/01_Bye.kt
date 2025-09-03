package tp02.activite02     // indique qu'on se trouve dans un "espace de nom"
                            // ce sera expliqué plus tard dans l'année

fun main() {
    println("Saisis un texte et appuie sur entrée...")
    // ...
    var saisieUtilisateur = readln()
    println("Tu as saisi : $saisieUtilisateur")
    // ...
    while (saisieUtilisateur != "bye") {
        println("Saisis un texte et appuie sur entrée...")
        saisieUtilisateur = readln()
        println("Tu as saisi : $saisieUtilisateur")
    }
    // ...
    println("Au revoir")
}