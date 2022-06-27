package com.giris;

public class Array {
    int length = 0;
    int mainArray[] = new int[length];
    /*Array in sonuna verilen değeri ekler.
     */
    public void ekle(int eklenecekSayi) {
        int tempArr[] = new int[mainArray.length + 1];
        for (int i = 0; i < mainArray.length; i++) {
            tempArr[i] = mainArray[i];
        }
        tempArr[mainArray.length] = eklenecekSayi;
        mainArray = tempArr;
    }
/*Array in içerisinde verilen indis numarasındaki değeri siler..
Eğer geçersiz bir indis girilmişse  hata verir.
 */
    public void sil(int silinecekIndex) {
        if (silinecekIndex >= 0 && silinecekIndex < mainArray.length) {
            int tempArr[] = new int[mainArray.length - 1];
            int j = 0;
            for (int i = 0; i < mainArray.length; i++) {
                if (i == silinecekIndex) {
                    if (i != mainArray.length - 1) {
                        i++;
                        tempArr[j] = mainArray[i];
                        j++;
                    }

                } else {
                    tempArr[j] = mainArray[i];
                    j++;
                }
            }
            mainArray = tempArr;
        }else{
            System.err.println("Indis numarasi gecerli araligin disindadir!");
        }
    }

/*Array in içerisinde istenen değeri istenen indis numarasındaki değeri ekler..
Eğer geçersiz bir indis girilmişse hata verir.
 */

    public void arayaEkle(int eklenecekSayi,int eklenecekIndex) {
        if (eklenecekIndex >= 0 && eklenecekIndex < mainArray.length + 1) {
            int tempArr[] = new int[mainArray.length + 1];
            int j = 0;
            boolean isAdded = false;

            for (int i = 0; i < mainArray.length; i++) {
                if (i == eklenecekIndex && isAdded == false) {
                    i--;
                    tempArr[j] = eklenecekSayi;
                    j++;
                    isAdded = true;
                } else {
                    tempArr[j] = mainArray[i];
                    j++;
                }
            }
            if (eklenecekIndex == mainArray.length) {
                tempArr[eklenecekIndex] = eklenecekSayi;
            }
            mainArray = tempArr;
        }else{
            System.err.println("Indis numarasi gecerli araligin disindadir!");
        }
    }

    public void listele() {
        for (int value : mainArray) {
            System.out.println(value);
        }
    }

}

