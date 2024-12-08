package com.example.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasharf = 'A'
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)

    var urun_id : Int = 3416
    var urun_adi : String = "Macbook Pro"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 42999.99
    var urun_tedarikci : String = "Apple"

    println("Ürün ID: $urun_id")
    println("Ürün Adı: $urun_adi")
    println("Ürün Adet: $urun_adet")
    println("Ürün Fiyat: $urun_fiyat")
    println("Ürün Tedarikçi $urun_tedarikci")


    var a = 10
    var b = 20

    println("$a x $b : ${ a * b }")

    //Sabitler - Constant
    //val(kotlin) - let(swift) - final(java)
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 40
    println(numara)
    //numara = 80

    //Tür Dönüşümü - Type Casting
    val i = 42
    val d = 78.95

    //Sayısaldan Sayısala Dönüşüm
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    //Sayısaldan Metine Dönüşüm
    val sonuc3 = i.toString()//"42"
    val sonuc4 = d.toString()//"78.95"
    println(sonuc3)
    println(sonuc4)

    //Metinden Sayısala Dönüşüm
    val yazi = "67.54t"

    val sonuc5 = yazi.toDoubleOrNull()
    println(sonuc5)
}