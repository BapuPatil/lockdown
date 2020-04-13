/**
 * https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names/0
 */


import java.util.*;
public class winnerOfElection {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number of names");
        int n = sc.nextInt();
        sc.nextLine();
        String temp = "";
        int val;
        Map<String,Integer> votecount = new HashMap<>();
        for (int i=0; i<n;i++){
            temp = sc.nextLine();
            if(votecount.containsKey(temp)){
                votecount.put(temp,(votecount.get(temp))+1);
            }        //end of if
            else{
                votecount.put(temp,1);
            }

        }//end of for

        int max =0;
        String winner="";
        for(Map.Entry<String,Integer> entry : votecount.entrySet()){
            if(max<entry.getValue()){max = entry.getValue();winner=entry.getKey();}


        }

        System.out.println("winner :"+winner);
    }//end of main
}//end of class
