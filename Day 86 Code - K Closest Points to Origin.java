// Problem Statement:
// https://leetcode.com/problems/k-closest-points-to-origin/

// Problem Solution:
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        PriorityQueue<int[]> pq = 
            new PriorityQueue<>(100, (int[] p1, int[] p2) -> Integer.compare((p1[0]*p1[0] + p1[1]*p1[1]), (p2[0]*p2[0] + p2[1] * p2[1])));
        
        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
        }
        
        int[][] result = new int[K][2];
        
        for (int i = 0; i < K; i++) {
            result[i] = pq.remove();
        }
        
        return result;
    }
}
