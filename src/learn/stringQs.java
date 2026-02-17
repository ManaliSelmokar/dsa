package learn;

import java.util.Scanner;
import java.util.Stack;

public class stringQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: \n1. Cummulative length \n2. Replace characters \n3. Username \n4. String builder cummulative length \n5. Sb replace char \n6. Sb username \n7. Lowercase \n8. Reverse \n9. Palindrome \n10. Reverse words \n11. Rotations");
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

            case 4:
                appendLen();
                break;

            case 5:
                replaceChar();
                break;

            case 6:
                uname();
                break;
            
            case 7:
                convertlowerCase();
                break;

            case 8:
                reverse();
                break;

            case 9:
                palindrome();
                break;

            case 10:
                reverseWords();
                break;

            case 11:
                System.out.println("Rotations possible? "+rotations());
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

    static void appendLen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the strings");
        StringBuilder sb = new StringBuilder(sc.next());
        sb.append(sc.next());
        sb.append(sc.next());

        System.out.println("Cummulative Length: "+sb.length());
    }

    static void replaceChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        StringBuilder sb = new StringBuilder(sc.next());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='E'){
                sb.setCharAt(i, 'I');
            }
            else if(sb.charAt(i)=='e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println("Result: "+sb);
    }

    static void uname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        StringBuilder sb = new StringBuilder(sc.next());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='@'){
                sb.delete(i, sb.length());
            }
        }
        System.out.println("Username: "+sb);
    }

    static void convertlowerCase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string in capital");
        StringBuilder sb = new StringBuilder(sc.next());
        char c;

        System.out.println("Convert to lowercase");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) >='A' && sb.charAt(i) <='Z'){
                c = (char)(sb.charAt(i)+32);
                sb.setCharAt(i, c);
            }
        }
        System.out.println("Result String: "+sb);

        System.out.println("Convert to uppercase");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) >='a' && sb.charAt(i) <='z'){
                c = (char)(sb.charAt(i)-32);
                sb.setCharAt(i, c);
            }
        }
        System.out.println("Result String: "+sb);
    }
    
    static void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        StringBuilder sb = new StringBuilder(sc.next());
        int index=0;
        char front,back;
        for(int i=0;i<sb.length()/2;i++){
            index=sb.length()-i-1;
            front = sb.charAt(i);
            back = sb.charAt(index);
            sb.setCharAt(index, front);
            sb.setCharAt(i, back);
        }
        System.out.println("Result: "+sb);
    }

    static void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb = new StringBuilder(sc.next());
        int b=0;
        char front,back;
        boolean bool = true;
        for(int f=0;f<sb.length()/2;f++){
            b = sb.length() - f - 1;
            front = sb.charAt(f);
            back = sb.charAt(b);
            if(front!=back){
                bool = false;
            }
        }
        System.out.println("Is a Palindrome: "+bool);
    }

    static void reverseWords(){
        String s = "Please reverse the words";
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else if(word.length()>0){
                stack.push(word.toString());
                word.setLength(0);
            }
        }

        if(word.length()>0){
                stack.push(word.toString());
        }

        while(!stack.isEmpty()){
            result.append(stack.pop());
            if(!stack.isEmpty()){
                result.append(' ');
            }
        }

        System.out.println("Result: "+result);
    }

    static boolean rotations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings");
        String s1 = sc.next();
        String s2 = sc.next();
        boolean b = false;
        char last;
        int n = s1.length();

        if(s1.length()!=s2.length()) return false;
        
        for(int i=0;i<n;i++){
            if(s1.equals(s2)){
                return true;
            }
            
            last = s1.charAt(s1.length()-1);
            s1 = last + s1.substring(0,s1.length()-1);
        }

        return false;
    }
}
