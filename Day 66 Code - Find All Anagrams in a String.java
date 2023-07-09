// Problem Statement:
// https://leetcode.com/problems/find-all-anagrams-in-a-string/

// Problem Solution:  
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] hash = new int[128];
        for(int i=0; i<p.length(); i++) {
            hash[p.charAt(i)] ++;
        }
        List<Integer> res = new ArrayList<>();
        int start = 0;
        //The goal is to make sure the whole hash array is >= 0.
        //When hash[i] < 0, move start to get back to 0.
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            hash[c]--;
            while (hash[c]<0) {
                hash[s.charAt(start)]++;
                start++;
            }
            if (i-start +1 == p.length()) {
                res.add(start);
            }
        }
        return res;
    }
}
