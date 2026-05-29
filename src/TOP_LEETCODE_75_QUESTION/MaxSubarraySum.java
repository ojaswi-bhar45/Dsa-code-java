package TOP_LEETCODE_75_QUESTION;

import java.util.Scanner;

public class MaxSubarraySum {
    public static int maxSubArray(int[] nums) {
//        Brute force approach which takes the O(n^3) time
//        int n = nums.length;
//
//        int max_sum = Integer.MIN_VALUE;
//        for (int starting = 0; starting < n; starting ++) {
//            int sum = 0;
//            for (int ending = starting; ending < n; ending++) {
//                sum += nums[ending];
//            }
//            max_sum = Math.max(max_sum, sum);
//        }
//        return max_sum;

        //Kadane’s Algorithm
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the element of array:");
        for(int i = 0 ; i < n ; i ++){
            nums[i]= sc.nextInt();
        }

        int res = maxSubArray(nums);
        System.out.println(res);
    }
}
