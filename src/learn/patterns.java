package learn;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which pattern do you want to print?");
        System.out.println("1. Solid Rhombus");
        System.out.println("2. Number Pyramid");
        System.out.println("3. Palindromic Number Pyramid");
        System.out.println("4. Print a hollow butterfly pattern");
        System.out.println("5. Print a hollow rhombus pattern");
        System.out.println("6. Print a pascal's triangle pattern");
        System.out.println("7. Print a half pyramid pattern");
        System.out.println("8. Print a inverted half pyramid pattern");
        System.out.print("Enter your choice (1-8):\t");
        int choice = sc.nextInt();
        switch (choice) {   
            case 1:
                solidRhombus();
                break;
            case 2:
                numberPyramid();
                break;
            case 3:
                palindromicNumberPyramid();
                break;

            case 4:
                hollowButterflyPattern();
                break;
            case 5:
                hollowRhombusPattern(); 
                break;
            case 6:
                pascalTrianglePattern();        
                break;
            case 7:
                halfPyramidPattern();
                break;
            case 8:
                invertedHalfPyramidPattern();
                break;
        
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 8.");

        }
        sc.close();
    }

    static void solidRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a solid rhombus:");
        System.out.print("Enter the number of rows for the rhombus:\t");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=rows;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        sc.close();
    }

    static void numberPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a number pyramid:");
        System.out.print("Enter the number of rows for the pyramid:\t");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+"\t");
                System.out.print("\t");
            }
            System.out.println();
        }
        sc.close();
    }

    static void palindromicNumberPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a palindromic number pyramid:");
        System.out.print("Enter the number of rows for the pyramid:\t");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" \t");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+"\t");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        sc.close();
    }

    static void hollowButterflyPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a hollow butterfly pattern:");
        System.out.print("Enter the number of rows for the butterfly pattern:\t");
        /*

        *            *
        * *        * *
        *   *    *   *
        *     **     *
        *     **     *
        *   *    *   *
        * *        * *
        *            *
        
        */
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(j==1){
                    //System.out.print("("+i+","+j+")\t");
                    System.out.print("*\t");
                }
                else if((j==i)||(j==rows-i+1)||(i==rows-j+1)|| j==rows){
                    //System.out.print("("+i+","+j+")\t");
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();  
        }
        sc.close();
    }

    static void hollowRhombusPattern(){
        // Implementation for hollow rhombus pattern
        /*
                    * * * * *
                  *       *
                *       *
              *       *
            * * * * *
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Print a hollow rhombus pattern:");
        System.out.print("Enter the number of rows for the rhombus:\t");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=rows;j++){
                if(i==1 || i==rows || j==1 || j==rows){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void pascalTrianglePattern(){
        // Implementation for pascal's triangle pattern
        /*
                1
              1   1
            1   2   1
          1   3   3   1
        1   4   6   4   1
        
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a pascal's triangle pattern:");   
        System.out.print("Enter the number of rows for the pascal's triangle:\t");
        int rows = sc.nextInt();
        int[] arr = new int[rows];

        //Approach 1: Using binomial coefficient formula
        /*
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" \t");
            }
            int num = 1;
            for(int j=1;j<=i;j++){
                System.out.print(num+"");
                System.out.print("("+i+","+j+")\t");
                num = num * (i-j) / j;
                System.out.print(num+"\t");
            }
            System.out.println();
        }*/

        //Approach 2: Using 1D array
        for(int i=0;i<rows;i++){
            arr[i] = 1; 
            for(int j=i-1;j>0;j--){
                arr[j] = arr[j] + arr[j-1]; 
            }
            for(int j=1;j<rows-i;j++){
                System.out.print(" \t");
            }
            for(int j=0;j<=i;j++){
                System.out.print(arr[j]+"\t\t");
            }
            System.out.println();
        }
        sc.close();
    }

    static void halfPyramidPattern(){
        // Implementation for half pyramid pattern
        /*
              1
             1 2
            1 2 3
           1 2 3 4
          1 2 3 4 5

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a half pyramid pattern:");
        System.out.print("Enter the number of rows for the half pyramid:\t");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t\t");
            }
            System.out.println();
        }
        sc.close();
    }

    static void invertedHalfPyramidPattern(){
        // Implementation for inverted half pyramid pattern     
        /*
          1 1 1 1 1
           2 2 2 2
            3 3 3
             4 4
              5
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Print an inverted half pyramid pattern:");
        System.out.print("Enter the number of rows for the inverted half pyramid:\t");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(i+"\t\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
