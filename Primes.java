public class Primes {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int count=0;
        double per;
        for (int i=0;i<n;i++)
        {
            if (Is_prime(i)) {
                System.out.println(i);
                count++;
            }
        }
        per=((double)count/(double)n)*100.0 ;
        System.out.println("There are "+ count + " primes between 2 and "+ n+ " (" + (int)per+ "% are primes)" );
        //There are 10 primes between 2 and 30 (33% are primes)
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