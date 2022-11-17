package com.example.androidbootcamp.nesne_tabanli_programlama.odev2;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 o2 = new Odev2();

        //1. Soru Test
        double km = 5.78;
        double t1 = o2.soru1(km);
        System.out.println(km + " kilometre " +t1+ " mile eşittir!!");
        System.out.println("-------------");

        //2. Soru Test
        o2.soru2(5,4);
        System.out.println("-------------");

        //3. Soru Test
        int sayi = 5;
        int t3 = o2.soru3(sayi);
        System.out.println(sayi + "!= " +t3);
        System.out.println("-------------");

        //4. Soru Test
        String kelime = "elevator";
        o2.soru4(kelime);
        System.out.println("-------------");

        //5. Soru Test
        int kenarSayisi = 6;
        int icAci = o2.soru5(kenarSayisi);
        System.out.println(kenarSayisi + " kenarlı bir çokgenin her bir iç açısı "+icAci+" derecedir");
        System.out.println("-------------");

        //6. Soru Test
        int calisilanGun = 20;
        int aylikMaas = o2.soru6(calisilanGun);
        System.out.println(calisilanGun + " Gün Çalışanın aylık maaşı: " +aylikMaas+" TL'dir!!");
        System.out.println("-------------");

        //7. Soru Test
        int otoparkKullanimDk = 1600;
        int otoparkUcreti = o2.soru7(otoparkKullanimDk);
        System.out.println("Otopark kullanım ücreti " +otoparkUcreti+" TL'dir!!");
        System.out.println("-------------");
    }
}
