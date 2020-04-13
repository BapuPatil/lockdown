/*
* link:https://practice.geeksforgeeks.org/problems/number-of-pairs/0/
* */


import java.util.Scanner;

public class NumberOfPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the first array:");
        int array1Size=sc.nextInt();
        System.out.println("enter the size of the second array:");
        int array2Size=sc.nextInt();
        int[] array1 = new int[array1Size];
        int[] array2 = new int[array2Size];

        System.out.println("enter the elements of array 1:");
        for (int i=0;i<array1Size;i++){
            array1[i]=sc.nextInt();
        }

        System.out.println("enter the elements of array 2:");
        for (int i=0;i<array2Size;i++){
            array2[i]=sc.nextInt();
        }

        int temp = 0;
        int pair=0;
        int[] largestArray = (array1Size>array2Size) ? array1:array2;
        int[] smallestArray = (array1Size<array2Size) ? array1:array2;

        for(int x = 0;x<largestArray.length;x++){
                temp=largestArray[x];
                for(int j=0;j<smallestArray.length;j++){
                if(
                        Math.pow((double)temp,(double)smallestArray[j]) > Math.pow((double)smallestArray[j],(double)temp)
                ){
                    pair+=1;
                }

                }
        }

        System.out.println("number of pairs where in x^y > y^x = "+pair);
        System.out.println(10*20-20);
        }//end of main


}
