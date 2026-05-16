package RemoveDuplicatesFromArray;

import java.util.Scanner;

public class remove_duplicates_from_sorted_array {

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for(int j = 1; j < nums.length; j++) {

            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements in array:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Updated Array: ");

        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}