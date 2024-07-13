import java.util.*;
public class math {
    long factorial(long n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans *= i;
        }
        return ans;
    }
    long biggestdigit(long n){
        long ans = Long.MIN_VALUE;
        while(n != 0){
            long x = n%10;
            ans = Math.max(ans,x);
            n = n/10;
        }
        return ans;
    }
    long smallestdigit(long n){
        long ans = Long.MAX_VALUE;
        while(n != 0){
            long x = n%10;
            ans = Math.min(ans,x);
            n = n/10;
        }
        return ans;
    }
    long countdigits(long n){
        int count = 0;
        while(n != 0){
            long x = n%10;
            count++;
            n = n/10;
        }
        return count;
    }
    long reversenum(long n){
        long ans = 0;
        while(n != 0){
            ans = ans*10 + n%10;
            n = n/10;
        }
        return ans;
    }
    boolean checkpalind(long n){
        long x = n;
        long ans = 0;
        while(n != 0){
            ans = ans*10 + n%10;
            n = n/10;
        }
        return x == ans;
    }
    boolean armstrong(long n){
        long original = n; long x = n;
        long ans = 0;
        int count = 0; 
        while(x != 0){
            long num = x%10; count++;
            x = x / 10;
        }
        while(n != 0){
            long y = n%10; 
            ans += Math.pow(y,count);
            n = n/10;
        }
        return original == ans;
    }
    boolean primenumber(int n){
        if(n < 2) return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    void  alldivisor(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println(i);
            }
            if(n/i != i){
                System.out.println(n/i);
            }
        }
    }
    int GCGHCD(int n,int m){
        int ans = 1;
        for(int i=1; i<=Math.min(n,m); i++){
            if(n%i == 0 && m%i == 0){
                ans = i;
            }
        }
        return ans;
    }
    int GCGHCD2(int n,int m){
        while(n>0 && m>0){
            if(n>m){
                n = n%m;
            }
            else{
                m = m%n;
            }
        }
        if(n == 0) return m;
        return n;
    }
    void primefactor(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0 && primenumber(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE THREE VALUES FIRST LONG ANFD TWO INTEGER TYPE");

        long x = scanner.nextLong();

        int y = scanner.nextInt();
        int z = scanner.nextInt();

        math m = new math();

        System.out.println("THE FACTORAIL OF THE NUMBER THAT YOU ENTERS :  "+ m.factorial(y));
        
        // System.out.println("THE BIGGEST DIGIT  OF THE NUMBER THAT YOU ENTERS :  "+ m.biggestdigit(x));

        // System.out.println("THE SMALLEST DIGIT  OF THE NUMBER THAT YOU ENTERS :  "+ m.smallestdigit(x));

        // System.out.println("THE NUMBER OF  DIGIT  OF THE NUMBER THAT YOU ENTERS :  "+ m.countdigits(x));

        // System.out.println("THE REVERSE  OF THE NUMBER THAT YOU ENTERS :  "+ m.reversenum(x));

        // System.out.println("THE CHECK THE NUMBER THAT YOU ENTERS IS PALINDROME:   "+((m.checkpalind(x)) ? "YES" : "NO"));

        // System.out.println("THE CHECK THE NUMBER THAT YOU ENTERS IS PRIME NUMBER:   "+((m.primenumber(y)) ? "YES" : "NO"));

        // System.out.println("THE CHECK THE NUMBER THAT YOU ENTERS IS AREMSTRONG:   "+((m.armstrong(y)) ? "YES" : "NO"));

        // System.out.println("THE CHECK THE NUMBER THAT YOU ENTERS IS ALL DIVISOR:  ");  m.alldivisor(y);

        // System.out.println("THE GCD AND HIGEST COMMAN FACTOR OF GIVEN RANGE: "+ m.GCGHCD(y,z));  //(WE CAN FIND ALL FACTOR ALSO)

        // System.out.println("THE GCD AND HIGEST COMMAN FACTOR OF GIVEN RANGE: "+ m.GCGHCD2(y,z));  

        // System.out.println("THE CHECK THE NUMBER THAT YOU ENTERS IS ALL PRIMEFACTOR:  ");  m.primefactor(y);

    }
}





// import java.util.*;
// public class math {
//     boolean[] sieveOfEratosthenes(int n) {
//         boolean[] prime = new boolean[n + 1]; 

//         Arrays.fill(prime, true); 

//         for (int i = 2; i * i <= n; i++) {
//             if (prime[i]) {
//                 for (int j = i * i; j <= n; j += i)
//                     prime[j] = false;
//             }
//         }
//         return prime;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int x = scanner.nextInt();
//         math m = new math();

//         // boolean[] prime = m.sieveOfEratosthenes(n);        // BOOL ARRAY
//         // System.out.print("Prime numbers up to " + n + " are:\n");
//         // for (int i = 2; i <= n; i++) {
//         //     if (prime[i])
//         //         System.out.print(i + " ");
//         // }

//         boolean[] prime = m.sieveOfEratosthenes(x);        // BOOL ARRAY
//         System.out.println("Prime numbers in the given range  " + n + " to " + x );
//         for (int i = n; i <= x; i++) {
//             if (prime[i])
//                 System.out.print(i + " ");
//         }
//     }
// }






