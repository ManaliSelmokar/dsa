package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arraysEasy {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option \n1. Min Max number in an array \n2. Sort an array \n3. Spiral Order matrix \n4. Transpose \n5. Shift n positions \n6. Max Product Triplet \n7. Max consecutive ones or zeros \n8. Move zeros to end \n9. Waveform \n10. Plus One \n11. Stock buy and sell \n12. Stock buy and sell 2 \n13. Remove duplicates \n14. Alternate Positive Negative \n15. Leader's array \n16. Missing Repeating Array \n17. Missing ranges \n18. Sum of subarrays");
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
 
            case 4:
                transpose();
                break;

            case 5:
                shiftLeftNtimes();
                break;

            case 6:
                int[] maxProd = { 10, 3, 5, 6, 20 };
                maxProductOfTriplet(maxProd);
                break;

            case 7:
                int[] binArr= {0,1,0,0,1,1,1,1,1,1,0};
                maxConsecOnes(binArr);
                break;

            case 8:
                int[] zeroNonZerosArr = {0,1,2,0,3,4,0,5,6,0};
                zeroNonZeros(zeroNonZerosArr);
                break;

            case 9:
                int[] waveformArr = {2, 4, 7, 8, 9, 10};
                waveform(waveformArr);
                break;

            case 10:
                int[] digits = {1, 2, 3, 4};
                int[] result = plusOne(digits);
                for (int num : result) System.out.print(num + " ");
                break;

            case 11:
                stockBuyAndSell();
                break;

            case 12:
                stockBuyAndSell2();
                break;

            case 13:
                int[] dupArr = {1,1,2,3,3,3,4,5,6,6,6};
                removeDuplicatesFromSortedArr(dupArr);
                break;

            case 14:
                ArrayList<Integer> altArr = new ArrayList<>(Arrays.asList(1,2,-3,4,-5,6));
                altPositiveNegative(altArr);
                break;

            case 15:
                int[] leaderArr = {10,4,5,16,3,6,11,12,1};
                ArrayList<Integer> res = leadersArray(leaderArr);
                for (int j = 0; j < res.size(); j++) System.out.print(res.get(j) + " ");
                break;

            case 16:
                ArrayList<Integer> missRepeatArr = new ArrayList<>(Arrays.asList(7,8,8,1,2,4,3,5));
                missingRepeatingArray(missRepeatArr);
                break;

            case 17:
                int[] missingArr = {-48, -10, -6, -4, 0, 4, 17};
                int lower = -54, upper = 17;
                List<List<Integer>> missingRes = missingRange(missingArr,lower,upper);
                for (List<Integer> range : missingRes) {
                    System.out.print("[ "+range.get(0) + " " + range.get(1)+" ]");
                }
                break;

            case 18:
                int[] arr = {1, 4, 5, 3, 2};
                System.out.println("Sum of Subarrays: "+subarraySum(arr));
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
        System.out.println("Enter lengths");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("Enter numbers");
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

    static void transpose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lengths");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter numbers");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }

    static void shiftLeftNtimes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in arr and arr values");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.println("No of rotations");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
        System.out.println("Result: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void maxProductOfTriplet(int[] arr){
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    maxProduct = Math.max(maxProduct, arr[i]*arr[j]*arr[k]);
                }
            }
        }
        System.out.println("Max product: "+maxProduct);
    }

    static void maxConsecOnes(int[] binArr){
        if(binArr.length==0) System.out.println("Empty arr");
        int maxCount = 0,count = 1;
        for(int i=1;i<binArr.length;i++){
            if(binArr[i]==binArr[i-1]) count++;
            else{
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        System.out.println("Consecutive Max Count: "+maxCount);
    }

    static void zeroNonZeros(int[] arr){
        int count = 0,index = 0;
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(index<arr.length){
                if(arr[i]==0) count++;
                else{
                    res[index] = arr[i];
                    index++;
                }
            }
        }
        for(int i=0;i<count;i++){
            res[index] = 0;
            index++;
        }

        System.out.print("Result : ");
        for(int i=0;i<res.length;i++) System.out.print(res[i]+" ");
    }

    static void waveform(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.print("Result : ");
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }

    static int[] plusOne(int[] digits) {

        // Start from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                System.out.println("Digits: "+digits[i]);
                digits[i]++;
                System.out.println("Digits++: "+digits[i]);
                return digits;
            }

            // If digit is 9, make it 0 and carry continues
            digits[i] = 0;
        }

        // If we are here, all digits were 9
        // Example: 999 → 1000
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    static void stockBuyAndSell(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.print("\nEnter the elements in an array (non-zero): ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                    if(arr[j]-arr[i]>max){
                        max = arr[j]-arr[i];
                    }
            }
        }

        System.out.println("Profit: "+max);
    }

    static void stockBuyAndSell2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.print("\nEnter the elements in an array (non-zero): ");
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }

        int lMin = prices[0];  
        int lMax = prices[0];  
        int res = 0;

        int i = 0;
        while (i < n - 1) {
            System.out.println("-----------------------");
            System.out.println("Current Result");
            System.out.println(""+res);
            System.out.println("-----------------------");
            // Find local minima
            System.out.println("-----------------------");
            System.out.println("Local Minima");
            while (i < n - 1 && prices[i] >= prices[i + 1]) { 
                System.out.println("i: "+i);
                i++; }
            System.out.println("lmin: "+prices[i]);
            lMin = prices[i];
            System.out.println("-----------------------");
           
            System.out.println("-----------------------");
            System.out.println("Local Maxima");
            // Local Maxima
            while (i < n - 1 && prices[i] <= prices[i + 1]) { 
                System.out.println("i: "+i);
                i++; }
            System.out.println("lmax: "+prices[i]);
            lMax = prices[i];
            System.out.println("-----------------------");


            // Add current profit
            res += (lMax - lMin);
            System.out.println("-----------------------");
        }

        System.out.println("Profit: "+res);
    }

    static void removeDuplicatesFromSortedArr(int[] arr){
        int[] distinctArr = new int[arr.length];
        int ind=1;
        if (arr.length<=1) System.out.println("Same array");
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[ind++] = arr[i];
            } 
        }
        System.out.print("Result:");
        for(int i=0;i<ind;i++) System.out.print(" "+arr[i]);
    }

    static void altPositiveNegative(ArrayList<Integer> arr){
        ArrayList<Integer> posNo = new ArrayList<>();
        ArrayList<Integer> negNo = new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            if (arr.get(i) >= 0)
                posNo.add(arr.get(i));
            else
                negNo.add(arr.get(i));
        }

        int posInd = 0, negInd = 0, i = 0;

        while(posInd<posNo.size() && negInd<negNo.size()){
            if(i%2==0){ 
                arr.set(i++,posNo.get(posInd++));
            }
            else if(i%2!=0){
                arr.set(i++,negNo.get(negInd++));
            }
        }

        while(posInd<posNo.size()){
            arr.set(i++,posNo.get(posInd++));
        }
        while(negInd<negNo.size()){
            arr.set(i++,negNo.get(negInd++));
        }

        for (int j = 0; j < arr.size(); j++) System.out.print(arr.get(j) + " ");
    }

    static ArrayList<Integer> leadersArray(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=arr.length-1;i>0;i--){
            while(arr[i]<arr[i-1]){
                i--;
                res.add(arr[i]);
                if(i==0) return res;
            }
        }
        return res;
    }

    static void missingRepeatingArray(ArrayList<Integer> Arr){
        Arr.sort(null);
        for(int i=0;i<Arr.size()-1;i++){
            if(Arr.get(i)+1!=Arr.get(i+1)){ 
                if(Arr.get(i)==Arr.get(i+1)) System.out.println("Duplicate: "+Arr.get(i));
                else System.out.println("Missing: "+(Arr.get(i)+1));
            }
        }
    }

    static List<List<Integer>> missingRange(int[] arr,int lower,int upper){
        List<List<Integer>> ranges = new ArrayList<>();
        if(lower<arr[0]) ranges.add(Arrays.asList(lower,arr[0]-1));
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]>1){
                ranges.add(Arrays.asList(arr[i]+1,arr[i+1]-1));
            }
        }
        if(upper>arr[arr.length-1]) ranges.add(Arrays.asList(arr[arr.length-1]+1,upper));
        return ranges;
    }

    static int subarraySum(int[] arr) {
        int n = arr.length;
        int result = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            temp = 0;
            for (int j = i; j < n; j++) {
                temp += arr[j];
                result += temp;
            }
        }
        return result;
    }

}
