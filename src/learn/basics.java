package learn;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select an option:");
        System.out.println("1. Calculate the area of a circle");
        System.out.println("2. Print the multiplication table of a number");    
        System.out.println("3. Simple Calculator");
        System.out.println("4. Print the month name from month number");
        System.out.println("5. Print even numbers up to a limit");
        System.out.println("6. Student Marks Evaluation");
        System.out.println("7. Check if a number is prime");
        System.out.println("8. Eligible to vote");
        System.out.println("9. Count of +ve and -ve numbers");
        System.out.println("10. GCD");
        System.out.println("11. Fibonacci series");
        System.out.println("12. Prime less than n");
        System.out.print("Enter your choice (1-7):\t");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                areaOfCircle();
                break;
            case 2:
                tableOfNumber();
                break;
            case 3:
                calculator();
                break;
            case 4:
                printMonth();
                break;
            case 5:
                printEvenNumbers();
                break;
            case 6:
                studentMarks();
                break;
            case 7:
                primeNumber();  
                break;
            case 8:
                eligibleToVote();
                break;
            case 9:
                countOfNumbers();
                break;
            case 10:
                gcd();
                break;
            case 11:
                fibonacciSeries();
                break;
            case 12:
                primeLessThanN();
                break;
        
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }
        sc.close();
    }

    static void areaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the area of a circle:");
        System.out.print("Enter the radius of the circle:\t");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: "+area);
        sc.close();
    }

    static void tableOfNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the multiplication table of a number:");
        System.out.print("Enter the number to print its table:\t");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
        sc.close();
    }

    static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator:");
        System.out.print("Enter the first number:\t");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number:\t");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, %):\t");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Result: "+(num1+num2));
                break;
            case '-':
                System.out.println("Result: "+(num1-num2));
                break;
            case '*':
                System.out.println("Result: "+(num1*num2));
                break;
            case '/':
                if(num2!=0) System.out.println("Result: "+(num1/num2));
                else System.out.println("Error: Division by zero is not allowed.");
                break;
            case '%':
                if(num2!=0) System.out.println("Result: "+(num1%num2));
                else System.out.println("Error: Modulo by zero is not allowed.");
                break;
        
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }

    static void printMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the month (1-12):\t");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        
            default:
                System.out.println("Invalid month number.");
        }
        sc.close();
    }

    static void printEvenNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit to print even numbers:\t");
        int limit = sc.nextInt();
        System.out.println("Even numbers up to "+limit+":");
        for(int i=1;i<=limit;i++){
            if(i%2==0)System.out.print(i+", ");
        }
        System.out.println();
        sc.close();
    }

    static void studentMarks(){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        do{
            System.out.print("Enter the marks of the student (0-100):\t");
            int marks = sc.nextInt();
            if(marks>=90) System.out.println("This is Good");
            else if(marks>=60 && marks<90) System.out.println("This is also Good");
            else if(marks>=0 && marks<60) System.out.println("This is Good as well");
            else System.out.println("Invalid marks. Please enter a value between 0 and 100.");

            System.out.print("Enter 1 to enter marks for another student or 0 to stop:\t");
            n = sc.nextInt();
        }
        while(n==1);
        sc.close();
    }

    static void primeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime:\t");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num<=1) isPrime = false;
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) System.out.println(num+" is a prime number.");
        else System.out.println(num+" is not a prime number.");
        factorsOfNumber(num);
        sc.close();
    }

    static void factorsOfNumber(int num){
        System.out.println("Factors of "+num+" are:");
        for(int i=1;i<=num;i++){
            if(num%i==0) System.out.print(i+" ");
        }
        System.out.println();
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
