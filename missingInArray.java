// Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive), find the missing element. The array is a permutation of size n with one element missing. Return the missing element.

//Visit : https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&status=solved&sortBy=submissions

lass Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int sum=0;
        for(int i=0;i<n-1;i++)
            sum+=arr[i];
        int tot=n*(n+1)/2;
        return tot-sum;
    }
}
