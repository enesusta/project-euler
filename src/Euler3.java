public class EulerSoru3 {
    public static long num;

    public static void main(String[] args) {
        
        long result=0L;
        long prime;
        long max=600851475143L;
        for(num=2;num<=max;num++) {
            System.out.println(num);
            prime=0;   
            for(long detect=2;detect<num/2+1;detect++) {
                if(num%detect==0) {
                    prime++;
                }
            }
            if(prime==0) {
               result=num;
               if(result<num){
                   result=num;
               }        

            }
           
        }        
        
        System.out.println(result);
       /* long prime;
        for(int i=2;i<=35;i++) {
            prime=0;
            for(int j=2;j<i/2+1;j++) {
                if(i%j==0) {
                    prime++;

                }
           }
           if(prime==0)
                System.out.println(i);

        }
*/        
        System.out.println("ehehe");
    }
    
}