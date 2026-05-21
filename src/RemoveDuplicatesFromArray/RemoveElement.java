
//https://leetcode.com/problems/remove-element/description/


package RemoveDuplicatesFromArray;

import java.util.Scanner;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for (int i = 0 ; i < n ; i ++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int [] nums = new int[n];

        System.out.println("Enter the element in array: ");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Now the enter the value to remove their occurrence:");
        int val = sc.nextInt();

        int k = removeElement(nums, val);
        System.out.println(k);
    }
}
