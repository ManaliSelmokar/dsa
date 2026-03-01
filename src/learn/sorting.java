package learn;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option \n1. Bubble sort \n2. Selection sort");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                int[] bubbleArr = {7,8,9,2,4,1};
                bubbleSort(bubbleArr);
                break;

            case 2:
                int[] selectArr = {7,8,9,2,4,1};
                selectSort(selectArr);
                break;

            case 3:
                int[] insertArr = {7,8,9,2,4,1};
                insertSort(insertArr);
                break;
            
            case 4:

                break;

            default:
                System.out.println("Enter a different number");

        }
        sc.close();
    }

    static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) System.out.print(arr[j] + " ");
    }

    static void selectSort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){

            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            
        }
        for (int j = 0; j < arr.length; j++) System.out.print(arr[j] + " ");
    }

    static void insertSort(int[] arr){
        int current;
        System.out.println("---------input arr--------------");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        for(int i=1;i<arr.length;i++){
            System.out.println("\n---------i loop--------------");
            current = arr[i];
            int j = i-1;
            System.out.println("current value (arr["+i+"]): "+arr[i]+"\nj index: "+(i-1));
            while(j>=0 && current<arr[j]){
                System.out.println("-----------condition------------");
                System.out.println("current: "+current+"< arr[j]:"+arr[j]);
                System.out.println("arr[j+1]: "+arr[j+1]+" and arr[j]: "+arr[j]);
                arr[j+1] = arr[j];
                System.out.println("new arr[j+1]: "+arr[j+1]+" where j+1 = "+(j+1));
                j--;
                System.out.println("j: "+j);
                System.out.println("---------condition end--------------");
            }
            arr[j+1] = current;
            System.out.println("new current: "+arr[j+1]+" where index = "+(j+1));
            System.out.println("---------i loop end--------------");
        }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
