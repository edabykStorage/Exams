package com.giris;

import java.util.Locale;
import java.util.Scanner;

public class CustomStringTr {
    String cumle;
    private  String cumleIsteme(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Cumle giriniz : ");
        cumle=sc.nextLine();
        return cumle;
    }


    /* 1. String bir değer verildiğinde Stringi istenilen ifadenin içerisinde arayıp,
    geçtiği ilk index numarasını int cinsinden dönen method.
     * */
    public int aranilanStringinIndisi(String stringIfade){
    cumleIsteme();

        return cumle.indexOf(stringIfade);
    }

      /* 2. Char verildiğinde charı ifadenin içerisinde arayıp,
    charın geçtiği ilk index numarasını int cinsinden dönen method.
     * */

    public int aranilanCharinIndisi(char charIfade){
        cumleIsteme();
        return cumle.indexOf(charIfade);
    }

    /* 3.int bir x değeri verildiğinde, ifadenin x. indisindeki değerini
       char cinsinden dönen method.
       * */
    public char indisDegeri(int x){
        cumleIsteme();
        return cumle.charAt(x);
    }

    /* 4.String bir aranılacak ifade bir int x değer verildiğinde, aranılacak ifadeyi x. değerden sonra
    cumle içinde arayan ve aranılacak ifadenin geçtiği ilk index numarasını int cinsinden dönen method.
   * */
    public int aranilanStringinIndisi(String aranilacakIfade,int sayi){
        cumleIsteme();
        return cumle.indexOf(aranilacakIfade,sayi);
    }

    /* 5.String bir ifadenin uzunluğunu veren method
   * */
    public int uzunluk(){
        cumleIsteme();
        return cumle.length();
    }

    /* 6.String bir ifadede istenilen indisden sonra ifadeyi keser ve getirir. Verilen int değeri kesilecek indise dahildir.
   * */
    public String stringKes(int x){
        cumleIsteme();
        return cumle.substring(x);
    }



    /* 7.String bir ifadede istenilen indisler arasındaki ifadeyi keser ve getirir. ilk int kesilecek indise dahildir. Ikıncı verilen int kesilecek indise dahil
    değildir.
     * */
    public String stringKes(int ilkInt,int sonInt){
        cumleIsteme();
        return cumle.substring(ilkInt,sonInt);
    }


    /* 8.Verilen bir cümlenin başındaki ve sonundaki boşlukları siler ve Stringin boşluksuz halini geri döner.
     * */
    public String bosluklariSil(){
        cumleIsteme();
        return cumle.trim();
    }

    /* 9.Verilen bir cümlenin tüm harflerini büyük harfe cevirir.
     * */
    public String buyukHarfeCevir(){
        cumleIsteme();
        return cumle.toUpperCase();
    }
    /* 10.Verilen bir cümlenin tüm harflerini kücük harfe cevirir.
     * */
    public String kucukHarfeCevir(){
        cumleIsteme();
        return cumle.toLowerCase();
    }

}
