/*
We have to count the total number of subsets that make up the 
sum and have to return it.Now it is a variation of subset sum 
we just change the true and false with 0 and 1 and make the || a plus
as it just adds if the sum is possible or not
we get the answer at t[arr.lenght,sum+1]
 */
class main{
    public static int (int[] arr, int sum){
        int t[arr.length,sum+1];
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<sum;j++){
                if(i==0){
                    t[i,j]=0;
                }
                if(j==0){
                    t[i,j]=1;
                }
                if(arr[i-1]<=j){
                    t[i][j] = t[i][j-arr[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[arr.length,sum+1];
    }
    public static void main(String[] args){

    }
}