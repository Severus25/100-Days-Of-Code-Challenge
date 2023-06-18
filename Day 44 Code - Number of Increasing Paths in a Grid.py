# Problem Statememt: 
# https://leetcode.com/problems/number-of-increasing-paths-in-a-grid

# Problem Solution:
class Solution:
    def countPaths(self, grid: List[List[int]]) -> int:
        mod = pow(10, 9) + 7
        
        def helper(i, j, grid, dp, parent):
            m = len(grid)
            n = len(grid[0])

            if i < 0 or i >= m or j < 0 or j >= n or grid[i][j] <= parent:
                return 0

            if dp[i][j] != -1:
                return dp[i][j]

            down = helper(i + 1, j, grid, dp, grid[i][j]) % mod
            up = helper(i - 1, j, grid, dp, grid[i][j]) % mod
            right = helper(i, j + 1, grid, dp, grid[i][j]) % mod
            left = helper(i, j - 1, grid, dp, grid[i][j]) % mod

            dp[i][j] = (down + up + right + left + 1) % mod
            return dp[i][j]

        m = len(grid)
        n = len(grid[0])

        dp = [[-1] * n for _ in range(m)]

        for i in range(m):
            for j in range(n):
                if dp[i][j] == -1:
                    helper(i, j, grid, dp, -1)

        ans = 0
        for i in range(m):
            for j in range(n):
                ans = (ans + dp[i][j]) % mod
        return ans
