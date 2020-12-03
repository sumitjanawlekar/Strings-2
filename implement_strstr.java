// Time Complexity : O(m*n), where m is the length of hayStack and n is the length of the needle
// Space Complexity :O(1), no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//Three Liner Explanation of your code in plain English
//1. Start traversing on the hayStack till you find the first character of the needle in the hayStack
//2. Once you find start looking for the complete needle from the first character found in the hayStack, and return the index of
        //first character in the hayStack
//3. If you dont find the complete needle, reset the needle pointer back to 0 and continue looking in the remaining hayStack

// Your code here along with comments explaining your approach

class Solution {
    public int strStr(String haystack, String needle) {
        //edge case
        if(needle.length() == 0) return 0;
        //result to be returned
        int result = -1;
        //haystack and needle index
        int i =0;
        int j =0;
        while(i<haystack.length() && j<needle.length()){
            //reset the needle index for every iteration
            j=0;
            //first character of the needle found
            if(haystack.charAt(i) == needle.charAt(j)){
                int curr = i;
                //check you find the entire needle in the hayStack
                while(curr < haystack.length() && j < needle.length() && haystack.charAt(curr) == needle.charAt(j)){
                    curr++; j++;
                }
                //once needle found assign the start index in the hayStack to result
                if(j == needle.length()) {
                    result = i;
                    break;
                }
            }
            i++;
        }
        return result;
    }
}