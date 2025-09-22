package tp02.activite03

// Cette fonction calcule la moyenne des notes saisies
// et indique si l'étudiant est admis (moyenne >= 10)
fun calculMoyenne() {
    println("Combien de notes souhaitez-vous saisir?")
    val nombreNotes = readln().toInt()
    if (nombreNotes <= 0) {
        println("Bye")
        return
    }
    var sommeNotes = 0.0
    var compteur = 1
    
    while(compteur <= nombreNotes) {
        println("Entrez la note $compteur:")
        val note = readln().toDouble()
        
        if (note >= 0 && note <= 20) {
            sommeNotes += note
            compteur++
        } else {
            println("La note doit être comprise entre 0 et 20")
        }
    }
    
    val moyenne = sommeNotes / nombreNotes
    
    println("La moyenne est de: $moyenne")
    
    if (moyenne >= 10) {
        println("Étudiant admis")
    } else {
        println("Étudiant ajourné")
    }
}

fun main() {
    calculMoyenne()
}
