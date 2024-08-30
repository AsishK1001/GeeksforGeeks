//Given an array nums[], construct a Product Array nums[] such that nums[i] is equal to the product of all the elements of nums except nums[i]. 

//Visit : https://www.geeksforgeeks.org/problems/product-array-puzzle4525/0

class Solution {
    public static long[] productExceptSelf(int nums[]) {
         int n=nums.length;

        long [] nu = new long[n];

        long res;
        for(int i=0;i<n;i++) {
            res=1;
            for(int j=0;j<n;j++) {
                if(i==j)
                continue;
                res*=nums[j];
            }
            nu[i]=res;
        }
        return nu;
    }
}
