package learn;

import java.util.Scanner;

public class arraysMedium {
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option \n1. Next Permutation");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                nextPermutation();
                break;

            case 2:

                break;

            case 3:
               
                break;
            
            case 4:
               
                break;

            case 5:
                
                break;

            default:
                System.out.println("Enter a different number");

        }
        sc.close();
    }

    static void nextPermutation(){
        //The next lexicographically greater permutation is the smallest arrangement of a 
        // sequence that is larger than its current order, determined by finding the 
        // rightmost pair (a[i], a[i+1]) where a[i] < a[i+1]
    }

    
}
