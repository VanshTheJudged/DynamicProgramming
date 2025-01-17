/*
We are given with an array and a difference is given to us
we have to return how many 2 subset can be formed that lead to 
a difference of d.We can just simplify this problem using 
s1+s2=range as s1-s2=diff so from these we can find s1 like 
2s1-range= diff
or s1 = (diff+range)/2;
now we can just use the count of subset and a given sum code to 
find how many s1 can be created.
*/
