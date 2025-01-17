/*
we are given with an array and a sum value we have to assign
+ or - to all the values of the array in such a way that it leads to 
a total addition of given sum.And we have to return the number
of all the combinations.

To solve it:-Think if i put all the positive elements in 1 set 
and all the negative elements in other set then we can say that
s1-s2=sum(it is given to us in the question) now 
we do the common procedure we get s1+s2=range
or s2=range - s1;
then s1-range+s1=sum;
2s1-range=sum;
s1 = (sum+range)/2;
now we need to count all the s1 there are;
and we can do that using count of subset with a given sum.
*/