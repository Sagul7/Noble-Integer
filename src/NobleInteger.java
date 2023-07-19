import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println(checkNobleInteger(A,n));
    }
    public static int checkNobleInteger(int[] A,int n)
    {
        Arrays.sort(A);
        int res[] = new int[n];
        for(int i=0;i<n;i++)
        {
            res[i] = A[n-i-1];
        }
        for(int i=0;i<n;i++)
        {
            if(res[i]==i)
                return 1;
        }
        return -1;
    }
}
/*
Noble Integer
Given an integer array A, find if an integer p exists in the array
such that the number of integers greater than p in the array equals p.
Input 1:
A = [3, 2, 1, 3]
Input 2:
A = [1, 1, 3, 3]
Output 1:
1
Output 2:
-1

apporch : if smaller sort ascending ...greater decending order
check i==A[i] if equals 1 else 0;

0 1 2 3
3 3 2 1

2 and 2 equals hence it is nobleintger
 */