package tp02.activite04

import kotlin.text.reversed

fun palindrome() {
    println("Saisis un mot (\"bye\" pour terminer) :")
    var motSaisi = readln()
    while (motSaisi != "bye") {
        if (motSaisi == motSaisi.reversed()) {
            println("Le mot est un palindrome.")
        } else {
            println("Le mot n'est pas un palindrome.")
        }
        println("Saisis un mot (\"bye\" pour terminer) :")
        motSaisi = readln()
    }
    println("Au revoir")
}

fun main() {
    palindrome()
}