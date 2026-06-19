package TOP_LEETCODE_75_QUESTION;
//https://leetcode.com/problems/climbing-stairs/description/

import java.util.Scanner;

public class ClimbingStairs {
    public  static int climbStair(int n ){
        if(n <= 2){ return n;}

        int first = 1;
        int second = 2;

        for(int i = 3 ;  i <= n ; i++){
            int current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a nth number of climb stairs: ");
        int n = sc.nextInt();

        int result = climbStair(n);
        System.out.println(result);
    }
}
