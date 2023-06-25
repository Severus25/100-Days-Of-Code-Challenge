// Problem Statement:
// https://leetcode.com/problems/symmetric-tree/

// Problem Solution:
class Solution {
public : 
    bool checkMirror(TreeNode*left, TreeNode* right){
        if(left==NULL && right==NULL) return true;
        if((left==NULL && right !=NULL) || (left!=NULL && right==NULL)) return false;
        if(left->val!=right->val) return false;
        return  checkMirror(left->left, right->right)&& checkMirror(left->right, right->left);
}
public:
    bool isSymmetric(TreeNode* root) {
        if(root==NULL) return true;
        return checkMirror(root->left, root->right);
    }
};
