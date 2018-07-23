public class EulerSoru4 {


    public static void main(String[] args) {
        System.out.println(func(3422));

    }


    static int sum(int number) {
        int b;
        int kalan;
        int result = 0;
        while (number > 0) {
            kalan = number % 10;
            result = result * 10 + kalan;
            number /= 10;
        }
        return result;
    }

    static String func(int number) {
        int temp = sum(number);
        int result = temp + number;


        String value=Integer.toString(result);
        char valueTemp=value.charAt(0);
        char valueTemp2=value.charAt(2);

        boolean flag = valueTemp == valueTemp2;

        if (flag){
            return value;
        }

       else{
            temp = sum(result);
            result = result + temp;
            String value2 = Integer.toString(result);
            if (value2.indexOf(0) == value2.indexOf(2)) {
                return value2;
            }
            else
                return "calismadi";

        }


    }
}


