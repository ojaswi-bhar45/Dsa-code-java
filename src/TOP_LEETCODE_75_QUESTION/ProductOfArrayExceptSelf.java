package TOP_LEETCODE_75_QUESTION;
//https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i ++) {
            int mul = 1;
            for(int j = 0 ; j < n ; j ++){
                if(i == j ){
                    continue;
                }
                mul = mul * nums[j];
            }
            ans[i] = mul;
        }
        return ans;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of array: ");
        int[] nums = new int[n];

        for(int i = 0 ; i < n ; i ++ ){
            nums[i] = sc.nextInt();
        }

        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));

    }
}
