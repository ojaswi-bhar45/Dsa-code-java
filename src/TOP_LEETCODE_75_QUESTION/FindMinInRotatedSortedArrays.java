package TOP_LEETCODE_75_QUESTION;

import java.util.Scanner;

public class FindMinInRotatedSortedArrays {
    public static  int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while( left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
    return nums[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();

        int [] nums = new int[n];
        System.out.println("enter the element of array: ");
        for(int i = 0 ; i < n ; i ++){
            nums[i]= sc.nextInt();
        }

        int minElement = findMin(nums);
        System.out.println(minElement);

    }
}
