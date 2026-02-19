package learn;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option \n1. Prime num less than n \n2. Count of +ve and -ve numbers \n3. GCD \n4. Fibonacci series");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                primeLessThanN();
                break;

            case 2:

                break;

            case 3:

                break;
            
            case 4:

                break;

            default:
                System.out.println("Enter a different number");

        }
        sc.close();
    }

    static void primeLessThanN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        // creation of boolean array
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
 
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                // marking as false
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        // Count number of primes
        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p])
                count++;
        }
 
        // Store primes in an array
        int[] res = new int[count];
        int index = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p])
                res[index++] = p;
        }

        System.out.println("Prime nos: ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        } 
    }

}
