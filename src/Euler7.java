
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

import java.util.Vector;

public class Euler7 {

    public static void main(String[] args) {



        int count = 1 , i = 1;
        while(count < 10001) {
            i += 2;
            if(isPrime(i))
                count++;
        }

        System.out.println(i);




    }


    public static boolean isPrime(int n) {

        if(n == 2)
            return true;

        if( n == 1 || n % 2 == 0)
            return false;

        for(int i = 3; i * i <=n ;i += 2)
            if(n % i == 0)
                return false;

        return  true;

    }



}


