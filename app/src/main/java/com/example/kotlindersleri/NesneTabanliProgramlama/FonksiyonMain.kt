package com.example.kotlindersleri.NesneTabanliProgramlama

fun main() {
    val f = Fonksiyonlar()

    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç: $gelenSonuc")

    f.selamla3("Ayşegül")

    val gelenToplam = f.toplama1(10,20)
    println("Gelen Toplam: $gelenToplam")

}