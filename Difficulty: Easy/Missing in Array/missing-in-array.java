class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1; 
        long totalSum = (long) n * (n + 1) / 2;
        long arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        return (int) (totalSum - arraySum);
    }
}