/*
 *link:https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CelebrityProblem {

public void printMatrix(int[][] matrix){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println("\n");
    }
}

public static int getId(Integer[][] matrix,int n){

//    Collections.max(Arrays.asList(matrix[0]));

    int celebrity=-1;
    Integer[] temp;

    //find out the celebrity
    for(int x = 0; x<n ;x++){
        if(Collections.max(Arrays.asList(matrix[x]))==0){
             celebrity = x;
            break;
        }}
//if celebrity is not found
        if(celebrity==-1){
            return -1;
        }

        for(int j =0;j<n;j++){
            //skip the celebrity row
            if(j==celebrity){
                continue;
            }

            temp=matrix[j];
            if(temp[celebrity].intValue()!=1){
                    return -1;
            }

        }

            return celebrity;
    }





    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number of people in the party");
        int headCount = sc.nextInt();
        Integer[][] matrix = new Integer[headCount][headCount];
        System.out.println("enter the  matrix:");
        for(int row = 0;row < headCount;row++){
            for (int col =0; col<headCount;col++){
                matrix[row][col]=Integer.valueOf(sc.nextInt());
            }
        }


        System.out.println("ID of the celebrity is :"+ getId(matrix,headCount));
}



}
