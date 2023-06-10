class MinStack 
{
public:
 
   //implementing two stacks, one for numbers, the other for minimum values
    stack<int>s1,s2;
 
 void push(int val) 
    {
        if(s1.empty()||val<=s2.top())
        { 
            s2.push(val);
        }
        s1.push(val);
    }
    /* as we want the min value so remove the top value from s1 if both the value of top pos are same*/
    void pop() 
    {
        if(s1.empty()||s1.top()==s2.top())
        {
            s2.pop();
        }
        s1.pop();
    }
    
//return the top value of the first stack
    int top() 
    {
      return s1.top();
    }
    //return the top value of the second stack
    int getMin() 
    {
       return s2.top();   
    }
};
