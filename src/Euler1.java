public class EulerSoru1 {
    public static void main(String[] args) {

        // int (tam sayı) tipinde bir değişken tanımlarız.

        int toplam=0;

           /*
           for anahtar kelimesi döngü kurmamızı sağlar. Bu ifade ile
           0 değerinden başlayıp bir bir artan ve 1000 sayısına kadar sürekli tekrar eden bir işlem sağlanır.
           */
        for(int i=0; i< 1000 ; i++) {

            /* if koşul ifadesidir. Türkçedeki eğer ile benzer bir anlama sahiptir.
                Döngü içerisindeki i değişkeni her seferinde sayısal olarak 1 değer arttığı için
                ( ör : 1  2  3  4  5 ) gibi... i değişkeni 3 veya 5 'in katı olması halinde if içerisinde
                tanımlı bloğa girecek demektir.

            */

            /*
                || olarak gördüğünüz OR operatörüdür. Türkçe'de veya anlamına gelir. İki koşuldan birinin
                sağlanması durumunda  ki bu örnekte i'nin 3'ün veya 5'in katı olması durumu söz konusu.

                % sembolü matematiksel bir ifade olarak mod'u temsil eder. Eğer i değişkeni(sayısı) 3'ün veya 5'in
                mod 0'i ise tam katı demektir. Bu koşulu sağlayan i değerleri (örnek 15), yukarıda tanımladığımız
                (int toplam) adlı toplam değişkenine eklenir.
            */
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                toplam +=i;
            }
        }

        System.out.println("3 veya 5 'in 1000'den küçük katlarının toplamı = " + toplam);




    }
}
