package learn;

import java.util.Scanner;

public class arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option \n1. Min Max number in an array \n2. Sort an array \n3. Spiral Order matrix");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                minMaxNumbersInAnArray();
                break;

            case 2:
                sortInAscendingOrder();
                break;

            case 3:
                spiralOrderMatrix();
                break;

            default:
                System.out.println("Enter a different option");

        }
        sc.close();
    }

    static void minMaxNumbersInAnArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }

       System.out.println("Max number: "+max);
       System.out.println("Min number: "+min);

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
                int temp = 0;
                if(numbers[j]<numbers[i]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.print(numbers[i]+" ");
        }
    }

    static void spiralOrderMatrix(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;


        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;


            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;


            System.out.println();
        }
   
    }
}
