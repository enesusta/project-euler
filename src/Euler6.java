/*
        The sum of the squares of the first ten natural numbers is,

        12 + 22 + ... + 102 = 385
        The square of the sum of the first ten natural numbers is,

        (1 + 2 + ... + 10)2 = 552 = 3025
        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

        */

public class Euler6 {


    public static void main(String[] args) {

         System.out.println(result());

    }

    public static int sumOfSquares(int n) {

        int sum=0;

        for(int i=0;i<=n;i++)
            sum += i*i;


        return sum;

    }

    public static int squareOfSum(int n) {

        int sum = 0;

        for(int i=1;i<=n;i++)
                sum += i;


        return sum*sum;
    }


    public static int result() {

        return squareOfSum(100) - sumOfSquares(100);

    }


}
