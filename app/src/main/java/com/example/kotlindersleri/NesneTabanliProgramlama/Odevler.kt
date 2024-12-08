package com.example.kotlindersleri.NesneTabanliProgramlama

class Odevler {
    //SORU1
    fun soru1(km:Int) : Double {
        return km*0.621
    }

    //SORU2
    fun soru2(kkenar:Int,ukenar:Int) : Int {
        return kkenar*ukenar
    }

    //SORU3
    fun soru3(sayi:Int) : Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc = sonuc * i
        }
        return sonuc
    }

    //SORU4
    fun soru4(kelime:String) : Int {
        return kelime.count { it == 'e' || it == 'E'}
    }

    //SORU5
    fun soru5(kenarSayisi:Int) : Int {
        var sonuc = 0
        var toplam = sonuc*kenarSayisi
        when(kenarSayisi){
            3 -> sonuc = ((3-2) * 180)/3
            4 -> sonuc = ((4-2) * 180)/4
            5 -> sonuc = ((5-2) * 180)/5
            6 -> sonuc = ((6-2) * 180)/6
            7 -> sonuc = ((7-2) * 180)/7
            8 -> sonuc = ((8-2) * 180)/8
            9 -> sonuc = ((9-2) * 180)/9
            10 -> sonuc = ((10-2) * 180)/10
        }
        return sonuc
    }

    //SORU6
    fun soru6(gunSayisi:Int) : Int {
        val gunlukSaat = 8
        val saatlikCalismaUcreti = 40
        val gunlukUcret = gunlukSaat*saatlikCalismaUcreti
        val mesaiUcret = 80
        val aylikSaat = 150

        var yapilanMesaiUcret = 0
        var yapilanNormalUcret = 0

        var toplamMaas = 0

        if (aylikSaat < gunSayisi*8) {
            val mesai = (gunSayisi*8)-aylikSaat
            yapilanMesaiUcret = mesai*mesaiUcret

            yapilanNormalUcret = aylikSaat*saatlikCalismaUcreti
        } else {
            yapilanNormalUcret = gunSayisi*gunlukUcret
        }

        toplamMaas = yapilanNormalUcret+yapilanMesaiUcret

        return toplamMaas
    }

    //SORU7
    fun soru7(otoparkSuresi:Int) : Int{

        var ucret = 0

        if(otoparkSuresi < 1) {
            ucret = 50
        } else {
            val fazlaSure = otoparkSuresi-1

            val fazlaSureUcret = fazlaSure*10

            ucret = 50+fazlaSureUcret
        }

        return ucret
    }

}