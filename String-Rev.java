// Solution to https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        Boolean ans=false;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)==A.charAt(A.length()-1-i))
            {
                ans=true;
            }
            else ans=false;
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}
