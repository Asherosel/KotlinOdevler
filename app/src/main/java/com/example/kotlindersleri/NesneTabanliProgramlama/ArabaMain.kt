package com.example.kotlindersleri.NesneTabanliProgramlama

fun main() {
    //Nesne Oluşturma
    val bmw = Araba("Kırmızı", 0, false)

    //Okuma
    println("-------------------------------")
    bmw.bilgiAl()

    //Veri Atama
    bmw.renk = "Mavi"
    bmw.hiz = 10
    bmw.calisiyorMu = true

    //Okuma
    println("-------------------------------")
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(50)
    bmw.bilgiAl()
    bmw.yavasla(15)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz", 100,true)

    //Okuma
    println("-------------------------------")
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
}