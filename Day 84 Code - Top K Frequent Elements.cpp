// Problem Statement:
// https://leetcode.com/problems/top-k-frequent-elements/

// Problem Solution:
class Solution {
public:
    vector<int> topKFrequent_heapSort(vector<int>& nums, int k) {
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq; 
        
        unordered_map<int, int> freq;

        for(auto i: nums) {
            freq[i]++;
        }

        for(auto i: freq) {
            pq.push({i.second, i.first});
            if(pq.size() > k)
               pq.pop();
        }

        vector<int> topK;
        while(pq.size()) {
            topK.push_back(pq.top().second);
            pq.pop();
        }
        return topK;
    }
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        return topKFrequent_heapSort(nums, k);
    }
};
