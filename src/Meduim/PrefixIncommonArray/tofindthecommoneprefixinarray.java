package Meduim.PrefixIncommonArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class tofindthecommoneprefixinarray{
    public static int[] CommonPrefix(int[] A, int[] B){
        int n = A.length;
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        int [] ans = new int[n];

        for(int i = 0 ; i < n ; i++){
            setA.add(A[i]);
            setB.add(B[i]);


          int count = 0;

          for(int num : setA){
              if(setB.contains(num)){
                  count ++;
              }
          }
          ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array for A and B:");
        int n = sc.nextInt();


        int [] A = new int[n];
        int [] B = new int[n];

        System.out.println("Enter the element of A: ");
        for(int i = 0 ; i < n ; i ++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the element of B: ");

        for(int i = 0 ; i < n ; i ++){
            B[i] = sc.nextInt();
        }


        int[] result = CommonPrefix(A, B);
        System.out.println(Arrays.toString(result));

    }
}
