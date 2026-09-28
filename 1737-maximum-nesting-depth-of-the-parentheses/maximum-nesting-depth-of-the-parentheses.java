class Solution {
    public int maxDepth(String s) {
        int max=0,count=0;
        for(char i : s.toCharArray())
        {
            if(i=='(') count++;
            else if(i==')') count--;
            if(count>max) max=count;
        }
        return max;
    }
}