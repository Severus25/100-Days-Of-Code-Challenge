// Problem Statement:
// https://leetcode.com/problems/length-of-last-word/
  
// Problem Solution:
class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
