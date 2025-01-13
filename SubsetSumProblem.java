/*
In this question we are given with a array containing values
and we are given with a sum(a number) we have to find wheater there 
is anysubset from the array whose sum lead to the sum of the array
We have to return true or false 
*/
import java.util.*;
class main {
    public boolean subSetSum(int[] arr,int sum){
        boolean t[arr.length+1,sum+1];
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<sum;j++){
                if(i==0){
                    t[i,j]=false;
                }
                if(j==0){
                    t[i,j]=true;
                }
                if(arr[i-1]<=j){
                    t[i][j] = t[i][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[arr.length+1,sum+1];
    }
    public static void main(String[] args){

    }
}