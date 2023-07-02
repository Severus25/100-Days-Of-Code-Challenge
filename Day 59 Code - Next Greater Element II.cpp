// Problem Statement:
// https://leetcode.com/problems/next-greater-element-ii/

// Problem Solution:
class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        vector<int> res(nums.size(),-1);
        map<int,int> mp;
        stack<int> s; //index
        for(int i=0;i<nums.size();i++){
            int cur = nums[i];
            while(!s.empty() && cur > nums[s.top()]){
                int t = s.top();
                s.pop();
                res[t] = cur;
            }
            s.push(i);
        }
        
        for(int i=0;i<nums.size();i++){
            while(!s.empty() && nums[i] > nums[s.top()]){
                int t = s.top();
                s.pop();
                res[t] = nums[i];
            }
        }
        return res;
    }
};
