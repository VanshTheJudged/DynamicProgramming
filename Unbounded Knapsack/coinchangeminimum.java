/*
We have to find the minimum number of coins that are needed to get
to the sum.Thus we have to find a way in which we get the minimum 
number of coins that sum up to sum.
In the inizialization of this question there is a twist
for size==0 and sum>0 we need to store INT_MAX-sum as we may
need infinite - sum coins to get to that sum.
here we have to also inizialize the 2nd row also
*/
//to inizialize 2nd row
for(int i =1;j<sum+1;j++){
    if(j%arr[0]==0){
        t[i][j]=j/arr[0];
    }
    else{
        t[i][j] = INT_MAX-1;
    }
}
//Now variation in code:- it a variation of Unbounded Knapsack
//now we just do changes to the original code
//we remove the value arr and change the weight arr with coin[i-1];