package tp02.activite02

fun main() {
    println("Saisie un nombre entier ou bye pour arrêter le programme : ")
    var valeurSaisie = readln()
    var somme = 0 // déclare et intialise la variable somme à 0
    while(valeurSaisie != "bye") {
        // L'instruction somme += valeurSaisie.toInt() est équivalente à celle-ci :
        // somme = somme + valeurSaisie.toInt()
        // Cette instruction fait plusieurs choses :
        // 1. l'objet référencé par la variable valeurSaisie est converti
        // en un objet de type Int ;
        // 2. L'objet de type Int obtenu est ajouté à l'objet de type Int référencé
        // par la variable somme ;
        // 3. Le résultat est assigné la variable somme.
        somme += valeurSaisie.toInt()
        // Affiche la somme des nombres saisis
        println("Somme des nombres saisis : $somme")

        // Saisie d'une nouvelle entrée par l'utilisateur
        println("Saisie un nombre entier ou bye pour arrêter le programme : ")
        valeurSaisie = readln()
    }
    println("Au revoir")
}