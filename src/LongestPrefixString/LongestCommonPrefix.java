package LongestPrefixString;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public String longestPrefix(String[] strs){
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length- 1];
        int i = 0;
        while(i <str1.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                i++;
            }else{
                break;
            }
        }

        return str1.substring(0, i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        LongestCommonPrefix obj = new LongestCommonPrefix();

        String result = obj.longestPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}
