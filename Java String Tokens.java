//Solution to https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
        int size = tokens.length;
        System.out.println(size);
        for(int i=0; i<size; i++){
            System.out.println(tokens[i]);
            }
    }
}
