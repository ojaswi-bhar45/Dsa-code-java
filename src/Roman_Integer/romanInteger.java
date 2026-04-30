//https://leetcode.com/problems/roman-to-integer/description/

package Roman_Integer;
import java.util.HashMap;
import java.util.Scanner;

public class romanInteger {
    public static int romanToInt(String str) {
        HashMap<Character, Integer> romanInteger = new HashMap<Character, Integer>();

        romanInteger.put('I', 1 );
        romanInteger.put('V', 5);
        romanInteger.put('X', 10);
        romanInteger.put('L', 50);
        romanInteger.put('C', 100);
        romanInteger.put('D', 500);
        romanInteger.put('M', 1000);
        int total = 0;
        int n = str.length();
        for(int i = 0 ; i < n ;  i++){
          int currentValue = romanInteger.get(str.charAt(i));
          if(i < n-1 && currentValue < romanInteger.get(str.charAt(i+1))){
              total -= currentValue;
          }
          else{
              total += currentValue;
          }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert in integer");
        String str = sc.next();

        System.out.println(romanToInt(str));
    }
}
