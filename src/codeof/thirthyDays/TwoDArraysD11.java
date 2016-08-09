package codeof.thirthyDays;

import java.util.Scanner;

/**
 * Created by Naveen Kumar .A on 8/9/16.
 */
public class TwoDArraysD11 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int arr[][] = new int[6][6];
            for(int i=0; i < 6; i++){
                for(int j=0; j < 6; j++){
                    arr[i][j] = in.nextInt();
                }
            }
            int maxSum = Integer.MIN_VALUE;
            for(int i =1; i<5; i++){
                for(int j =1; j<5;j++){
                    int sum = calcSum(arr, i,j);
                    if(sum >maxSum){
                        maxSum = sum;
                        System.out.println(i+" "+j);
                    }
                }
            }
            System.out.println(maxSum);
        }

        private static int calcSum(int[][] arr, int timeRow, int timeCol){
            int sum =0;
            for(int i=timeRow-1; i<=timeRow+1; i+=2){
                for(int j = timeCol-1; j<=timeCol+1; j++)
                    sum=sum+arr[i][j];
            }
            sum=sum+arr[timeRow][timeCol];
            return sum;
    }
}
