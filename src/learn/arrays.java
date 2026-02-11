package learn;

import java.util.Scanner;

public class arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option \n1. Min Max number in an array \n2. Sort an array");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                minMaxNumbersInAnArray();
                break;

            case 2:
                sortInAscendingOrder();
                break;

            default:
                System.out.println("Enter a different option");

        }
        sc.close();
    }

    static void minMaxNumbersInAnArray(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }

        sc.close();
    }

    static void sortInAscendingOrder(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int sortedArray[] = new int[size];
        int min = Integer.MIN_VALUE;

        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int temp =0;
                if(numbers[j]<numbers[i]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(numbers[i]+", ");
        }

    }
}
