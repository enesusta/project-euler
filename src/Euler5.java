public class Euler5 {


    // 1'den 10'a kadar butun sayılara kalansız bolunen en kucu sayı 2520'dır.
    // 1'den 20'ye kadar butun sayılara kalansız bolunen en kucuk pozıtıf sayı kaçtır?
    public static void main(String[] args) {


        int i = 20;
            while(!isAsal(i))
                i++;

            System.out.println(i);

    }

    public static boolean isAsal(int number) {

        for (int i = 1; i < 20; i++)
            if (number % i != 0)
                return false;


        return true;

    }


}
