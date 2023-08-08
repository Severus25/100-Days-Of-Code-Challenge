# Problem Statement:
# https://leetcode.com/problems/maximum-performance-of-a-team/

# Problem Solution:
class Solution:
    def maxPerformance(self, n, S, E, k):
        sm, ans, heap = 0, 0, []
        
        for eff, speed in sorted(zip(E, S))[::-1]:
            if len(heap) > k - 1: sm -= heappop(heap)
            heappush(heap, speed)
            sm += speed
            ans = max(ans, sm*eff)
        
        return ans % (10**9 + 7)
