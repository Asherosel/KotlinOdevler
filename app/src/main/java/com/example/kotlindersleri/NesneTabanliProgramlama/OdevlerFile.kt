package com.example.kotlindersleri.NesneTabanliProgramlama

fun main() {

    val o2 = Odevler()

    //SORU1
    val km = 50
    val sonuc1 = o2.soru1(km)
    println("${km} km = ${sonuc1} mil")

    //SORU2
    val kkenar = 5
    val ukenar = 10
    val sonuc2 = o2.soru2(kkenar,ukenar)

    println("Kısa kenarı ${kkenar} cm, uzun kenarı ${ukenar} cm olan dikdörtgenin alanı ${sonuc2} cm^2")

    //SORU3
    val sayi = 3
    val sonuc3 = o2.soru3(sayi)

    println("${sayi}! = ${sonuc3}")

    //SORU4
    val kelime = "Erdem marketten meyve alıyor."
    val sonuc4 = o2.soru4(kelime)

    println("'${kelime}' içinde ${sonuc4} adet 'e' harfi bulunuyor.")

    //SORU5
    val kenarSayisi = 3
    val sonuc5 = o2.soru5(kenarSayisi)
    val icToplam = sonuc5*kenarSayisi

    println("Kenar sayısı ${kenarSayisi} olan çokgenin bir iç açısı ${sonuc5}, toplamı ${icToplam}.")

    //SORU6
    val calisilanGun = 19
    val sonuc6 = o2.soru6(calisilanGun)

    println("${calisilanGun} günlük çalışmanın ücreti ${sonuc6}")

    //SORU7
    val otoparkSuresi = 6
    val sonuc7 = o2.soru7(otoparkSuresi)

    println("${otoparkSuresi} saatlik otopark süresinin ücreti ${sonuc7} TL")
}