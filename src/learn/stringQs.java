package learn;

import java.util.Scanner;

public class stringQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: \n1. Cummulative length \n2. Replace characters \n3. Username");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                cummulativeLength();
                break;

            case 2:
                replaceCharacters();
                break;

            case 3:
                username();
                break;
        
            default:
                break;
        }

    }

    static void cummulativeLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of strings");
        int n = sc.nextInt();
        System.out.println("Enter the strings");
        String arr[] = new String[n];
        int length = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            length += arr[i].length();
        }

        System.out.println("The cummulative length of all strings: "+length);
    }

    static void replaceCharacters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String original = sc.next();
        String result = "";

        for(int i = 0;i<original.length();i++){
            if(original.charAt(i)=='E'){
                result += 'I';
            }
            else if (original.charAt(i)=='e'){
                result += 'i';
            }
            else{
                result += original.charAt(i);
            }
        }

        System.out.println("Result string: "+result);
    }

    static void username(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email id: ");
        String email = sc.next();
        String username = "";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            username+=email.charAt(i);
        }

        System.out.println("Username: "+username);
    }
}
