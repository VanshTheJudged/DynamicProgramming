/*
It is similar to Equalsumpartition as we have to give
s1-s2=minimum thus we have to minimize the s1-s2 
here s1 and s2 are partitions of the array and there is no common digit in them
range is the sum of all the array.
*/

class main{
    public static int minSum(int[] arr,int range){
        boolean t[arr.length,sum+1];
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
        int [range/2] v;
        for(int k = 0;i<range/2;k++){
            if(t[j][arr.lenght()]){
                v[j]=j;
            }
        } 
        int min = INT.MAX;
        for(int i = 0:i<v.lenght();i++){
            mn = min(mn,range-2v[i]);
        }
        return mn;
    }
}