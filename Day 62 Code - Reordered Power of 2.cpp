// Problem Statement:
// https://leetcode.com/problems/reordered-power-of-2/

// Problem Solution:
class Solution {
public:
    // bool reorderedPowerOf2(int n) {
    bool reorderedPowerOf2(int N) {
        long c = counter(N);
        for (int i = 0; i < 32; i++)
            if (counter(1 << i) == c) return true;
        return false;
    }

    long counter(int N) {
        long res = 0;
        for (; N; N /= 10) res += pow(10, N % 10);
        return res;
    }
};
