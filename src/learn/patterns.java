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
                System.out.println("Invalid choice. Please select a number between 1 and 3.");
        }
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

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" \t");
            }
            int num = 1;
            for(int j=1;j<=i;j++){
                System.out.print(num+"");
                System.out.print("("+i+","+j+")\t");
                num = num * (i-j) / j;
                //logic explained:
                num = num * (i-j) / j;
                //The formula for calculating the value of the current element in the row is based on the properties of Pascal's triangle.
                //In Pascal's triangle, each element is the sum of the two elements directly above it in the previous row. The formula num = num * (i-j) / j is derived from this property and allows us to calculate the value of the current element based on the previous element in the same row.
                //The formula works as follows:
                //1. Start with num = 1 for the first element in each row (when j = 1).
                //2. For each subsequent element in the row (when j > 1), calculate the value of num using the formula num = num * (i-j) / j. This formula effectively computes the value of the current element based on the previous element in the same row, which is how Pascal's triangle is structured.           
                //Example: For the 4th row (i=4), the elements are calculated as follows:
                //- For j=1: print 1 then update num = 1 * (4-1) / 1 = 3 
                //- For j=2: print 3 then update num = 3 * (4-2) / 2 = 3 
                //- For j=3: print 3 then update num = 3 * (4-3) / 3 = 1 
                //- For j=4: print 1 
                //Thus, the 4th row of Pascal's triangle is 1, 3, 3, 1.
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }

    static void halfPyramidPattern(){
        // Implementation for half pyramid pattern
    }

    static void invertedHalfPyramidPattern(){
        // Implementation for inverted half pyramid pattern     
    }
}
