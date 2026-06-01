package TOP_LEETCODE_75_QUESTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three_sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2 ; i ++){
            //Skip the duplicates first element

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                left ++;
                right --;
                    // Skip duplicate left values
                    while (left < right &&
                            nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                            nums[right] == nums[right + 1]) {
                        right--;
                    }
                }else if(sum < 0){
                    left ++;
                }else{
                    right --;
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements for array: ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);


    }
}
