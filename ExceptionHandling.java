//Solution to https://www.hackerrank.com/challenges/java-exception-handling/problem

import java.util.Scanner;
class MyCalculator {
    public static int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception ("n or p should not be negative.");
        }
        else if(n == 0 || p == 0){
            throw new Exception ("n and p should not be zero.");
        } else {
            return ((int)Math.pow(n,p));
        }
    }
    
}

public class Solution {
