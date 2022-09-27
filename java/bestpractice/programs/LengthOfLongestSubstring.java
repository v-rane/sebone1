package com.sebone.java.bestpractice.programs;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String str) {
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        int res = 0;       
        while (right < str.length()) {
            char r = str.charAt(right);
            chars[r]++;
        while (chars[r] > 1) {
	        char l = str.charAt(left);
	        chars[l]--;
	        left++;
        }
        res = Math.max(res, right - left + 1);
        right++;
        }
        return res;
    }

    public static void main(String args[]) {
    	LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
    	System.out.println("Enter the string");
    	Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(str));
    }
}


