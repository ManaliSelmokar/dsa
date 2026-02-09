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
}
