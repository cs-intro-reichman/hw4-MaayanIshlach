public class Primes {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int count=0;
        double per;
        System.out.println("Prime numbers up to "+n+":");
        for (int i=0;i<n+1;i++)
        {
            if (Is_prime(i)) {
                System.out.println(i);
                count++;
            }
        }
        per=((double)count/(double)n)*100.0 ;
        System.out.println("There are "+ count + " primes between 2 and "+ n+ " (" + (int)per+ "% are primes)" );
        //Prime numbers up to 7:%0A2%0A3%0A5%0A7%0AThere are 4 primes between 2 and 7 (57%25 are primes)
        }
    

    public static boolean Is_prime(int num)
    {
        boolean p=true;
        if (num<2) {
            return false;
        }
        for(int i=2;i<num-1;i++)
        {
            if (num%i==0) {
                return p=false;
            }
        }
        return p;
    }
}