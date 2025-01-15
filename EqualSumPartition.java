/*
It is a little more complex problem of the same subsetsumproblem
here we need to divide the arr in parts containg equal sums
conditions to solve it
1.If the total sum of array is odd we can't have equal sum partition as we can't divide a odd in even parts
2.If the total is even then we have to find the subsetsum leading to half of the total sum if it exists then 
automatically it means that the other parts also exists which has a sum equal to it
*/
import java.util.*;
class main {
    public boolean subSetSum(int[] arr, int len){
        int total = 0;
        for(int i = 0;i<len;i++){
            total +=arr[i];
        }
        if(total%2==0){
            return SubsetSumProblem(arr,total/2);
        }
        else{
            return false;
        }
    }
}