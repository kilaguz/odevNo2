package com.example.androidbootcamp.nesne_tabanli_programlama.odev2;

public class Odev2 {
    //soru1
    public double soru1(double km){
        double sonucMile = km*0.621;
        return sonucMile;
    }
    //soru2
    public void soru2(double kenar1, double kenar2){
        double dortgenAlani = kenar1*kenar2;
        System.out.println("Kenarları girilen dörtgenin alanı = " +dortgenAlani + " m²'dir");
        System.out.println("----------------------------");
    }
    //soru3
    public int soru3(int sayi1){
        int fakt = sayi1;

        if(sayi1<0){
            System.out.println("lütfen pozitif bir sayı giriniz");
            return 1;
        }
        else if (sayi1==0){
            return 1;
        }
        while(sayi1>1){
            fakt = fakt*(sayi1-1);
            sayi1--;
        }
        return fakt;
    }
    //soru4
    public void soru4(String kelime){
        int bayrak = 0;
        char kontrol = 'e';
        int harfSayisi = kelime.length();
        for(int i = 0; i<harfSayisi; i++){
            char h = kelime.charAt(i);
            if(h==kontrol) {
                bayrak++;
            }
        }
        System.out.println(kelime +" içerisinde " +bayrak+" adet e harfi vardır!!");
    }
    //soru5
    public int soru5(int kenarSayisi){
        if(kenarSayisi<3){
            System.out.println("girilen kenar sayısı çokgen oluşturmak için uygun değildir.");
            return -1;
        }
        int sonuc = ((kenarSayisi-2)*180)/kenarSayisi;
        return sonuc;
    }
    //soru6
    public int soru6(int calisilanGun){
        int calisilanSaat = calisilanGun*8;
        int maas = 0;
        if(calisilanSaat<=150){
            maas = calisilanSaat*40;
        }
        else{
            int mesaiSaati = calisilanSaat-150;
            maas = (150*40)+(mesaiSaati*80);
        }
        return maas;
    }
    //soru7
    public int soru7(double otoparkSuresiDk){
        double otoparkSuresiSaat = otoparkSuresiDk/60;
        if (otoparkSuresiSaat<=1 && otoparkSuresiSaat>0){
            return 50;
        }
        else if(otoparkSuresiSaat<=0){
            return 0;
        }
        else{
            int saatInt = (int)otoparkSuresiSaat;
            if(saatInt==otoparkSuresiSaat) {
                return 50 + ((saatInt - 1) * 10);
            }
            else{
                return 50 + (saatInt * 10);
            }
        }
    }


}
