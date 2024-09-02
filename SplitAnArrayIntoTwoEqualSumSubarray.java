// Given an array of integers arr, return true if it is possible to split it in two subarrays (without reordering the elements), such that the sum of the two subarrays are equal. If it is not possible then return false.

// Visit : https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1

class Solution {
    public boolean canSplit(int arr[]) {
        int s1=0,s2=0;
        for(int i:arr)
            s1+=i;
        for(int i: arr) {
            s2+=i;
            s1-=i;
            if(s1==s2) return true;
        }
        return false;
    }
}
