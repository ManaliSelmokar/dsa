package learn;

import java.util.Scanner;

public class exercise1 {
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option \n1. Eligible to vote \n2. Count of +ve and -ve numbers \n3. GCD \n4. Fibonacci series");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                eligibleToVote();
                break;

            case 2:
                countOfNumbers();
                break;

            case 3:
                gcd();
                break;
            
            case 4:
                fibonacciSeries();
                break;

            default:
                System.out.println("Enter a different number");

        }
        sc.close();
    }

    static void eligibleToVote(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of a person");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are eligible to vote.");
        }
        else System.out.println("You are not eligible to vote.");
        sc.close();
    }

    static void countOfNumbers(){
        Scanner sc = new Scanner(System.in);
        int positive=0, negative=0, zeros=0,choice;
        do{
            System.out.println("Enter any number you want to");
            int n = sc.nextInt();
            if(n>0) positive++;
            else if(n<0) negative++;
            else if(n==0) zeros++;

            System.out.println("Press 1 to continue");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Number of positive numbers "+positive+"\nNumber of negative numbers "+negative+"\nNumber of zeros "+zeros);
        sc.close();
    }

    static void gcd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        int n=0,max=0;
        if(n1>n2) n=n2;
        else if(n2>n1) n=n1;

        for(int i=1;i<=n;i++){
            if(n1%i==0&&n2%i==0){
                if(max<i) max = i;
            }
        }

        System.out.println("GCD: "+max);
        sc.close();
    }

    static void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonnaci series");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[0]=0;
            arr[1]=1;
            if(i>1){
                arr[i] = arr[i-1]+arr[i-2];
            }
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

}
