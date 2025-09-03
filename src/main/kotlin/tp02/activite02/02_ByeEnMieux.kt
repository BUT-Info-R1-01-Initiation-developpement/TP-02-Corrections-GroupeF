package tp02.activite02

fun main() {
    // Pourquoi ce code peut-il être considéré comme "meilleur"
    // que le code du fichier `01_Bye.kt` ?
    // ...
    var saisieUtilisateur: String
    do {
        println("Saisis un texte et appuie sur entrée...")
        saisieUtilisateur = readln()
        println("Tu as saisi : $saisieUtilisateur")
    } while (saisieUtilisateur != "bye")
    println("Au revoir")
}