public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack();
        
        for(String token : tokens) {
            if (!Character.isDigit(token.charAt(token.length() - 1))) {
                int n2 = nums.pop();
                int n1 = nums.pop();
                
                if (token.equals("+")) {
                    nums.push(n1 + n2);
                } else if (token.equals("-")) {
                    nums.push(n1 - n2);                    
                } else if (token.equals("/")) {
                    nums.push(n1 / n2);
                } else if (token.equals("*")) {
                    nums.push(n1 * n2);
                }
            } else {
                nums.push(Integer.parseInt(token));
            }
        }
        return nums.pop();
    }
}
