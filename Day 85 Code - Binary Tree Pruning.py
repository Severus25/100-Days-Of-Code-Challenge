# Problem Statement:
# https://leetcode.com/problems/binary-tree-pruning/

# Problem Solution:
class Solution(object):
    def pruneTree(self, root):
        if not root: return None
        root.left = self.pruneTree(root.left)
        root.right = self.pruneTree(root.right)
        if not root.left and not root.right and not root.val: return None
        return root
        
