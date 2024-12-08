package com.example.kotlindersleri.NesneTabanliProgramlama

class Araba(var renk:String, var hiz:Int,var calisiyorMu:Boolean) {

    init {
        println("Constructor çalıştı.")
    }

    fun calistir(){//Side effect : Fonksiyon ile sınıfın özelliklerini değiştirebilme.
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz +=kacKm
    }

    fun yavasla(kacKm:Int){
        hiz -=kacKm
    }

    fun bilgiAl(){
        println("Renk: ${renk}")
        println("Renk: ${hiz}")
        println("Renk: ${calisiyorMu}")
    }

    //this veya self(Swift) : Bulunduğunuz sınıf
    //super : Kalıtım varsa üst sınıfı temsil eder.

}