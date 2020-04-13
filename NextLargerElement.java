/*
* link: https://practice.geeksforgeeks.org/problems/next-larger-element/0
* answer plagiarised
* */


import java.util.*;

public class NextLargerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stk = new Stack<Integer>();
        System.out.println("enter the number of elements");
        int size = sc.nextInt();
        int[] set  = new int[size];
        for(int i =0 ;i< size;i++){
            set[i]=sc.nextInt();
        }
        int temp;
        for(int i =0 ; i<size;i++){
            while(!stk.isEmpty()&& set[i] > stk.peek()){
                map.put(stk.pop(),set[i]);

            }
            stk.push(set[i]);
        }
            for(int i =0;i<size;i++) {

                System.out.println(map.getOrDefault(set[i],(int)-1));
            }

    }
}
