package TOP_LEETCODE_75_QUESTION;
//https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Scanner;
public class ContainDuplicates {
    public static boolean containDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums.length ; i ++){
            //If element is already exits
            if(set.contains(nums[i])){
                return true;
            }
            // Add element to set
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the value of arrays:");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt();
        }
        boolean ans = containDuplicates(nums);
        System.out.println(ans);
    }
}
