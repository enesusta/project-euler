
public class EulerSoru2 {
    public static void main(String[] args) {

        // İlk soruda olduğu gibi toplam adında tam sayı tipinde bir değişken tanımlıyoruz.
        int toplam=0;


       /*
        while ifadesi koşullu döngü kurmamıza yarar.

        Fibonacci() metodu içindeki değer 4 milyondan küçük olduğu sürece while bloğu çalışacaktır.
        Döngü her sağlandığında i değeri 1 artar.

        Döngü içinde i değeri sürekli artaracağı için, 1 2 3 4 .. 135678 ... 1000456 gibi..
        Koşul ifadesi ile Fibonacci serisindeki çift sayıları ayırabiliyoruz, mantık oldukça basit
        bir sayı 2'ye tam bölünüyorsa çift sayıdır. Bu tam bölünebilme olayını ise 2 sayısının mod'unun 0
        olması ile sağlıyoruz.

        Bu koşulu sağlayan Fibonacci ifadesi toplam adlı değişkene eklenerek sonucu buluyoruz.

       */
        int i=0;

        while(Fibonacci(i)<4000000) {

            if(Fibonacci(i) % 2 == 0) {
                toplam = toplam+Fibonacci(i);
                System.out.println("Fibo i " + Fibonacci(i));
            }

            // Arttırdığımız i değeri. her while dönüşünde 1 artar.
            i++;

        }








    }


    /*

    Tam sayı tipinde bir method yazdık. Methodumuzun adı Fibonacci. Bu metod tam sayı değerinde
    bir parametre kullanıyor.

    Örnek kullanım : Fibonacci(5); gibi..

    Fibonacci metodunun içinde negatif değer veya ondalıklı sayı veya karakter katarı(String) girilirse metod çalışmayacaktır.

    Metoda girilen sayı , ki bu tanimlanacakSayi adlı değişkene atanıyor, 0 ise method,  0 değerini döndürecek.
    Diğer bir ifade ile Fibonacci(0) = 0'dır.

    Aynı şekilde Fibonacci(1) değeri de 1 olmakta bu yüzden.

    Bu metodlara yinelenen (Rekürsif veya İngilizce tabiri ile Recursive) metod adı veriliyor.

    Algoritma şu şekilde işliyor.

    Örneğin Fibonacci(4) için ele alalım :

    Fibonacci(4)=Fibonacci(2)+Fibonacci(3);
    Fibonacci(3)=Fibonacci(1)+Fibonacci(2);
    Fibonacci(2)=Fibonacci(0)+Fibonacci(1);

    şeklinde işliyor.

    */


    public static int Fibonacci(int tanimlanacakSayi) {
        if(tanimlanacakSayi == 0) {
            return 0;
        }
        else if(tanimlanacakSayi == 1) {
            return 1;
        }
        else {
            return Fibonacci(tanimlanacakSayi-2) + Fibonacci(tanimlanacakSayi-1);
        }

    }
}