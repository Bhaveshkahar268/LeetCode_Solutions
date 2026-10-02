class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();

        for(int i=0;i<s.length();++i)
        {
            char curr= s.charAt(i);
            if(curr=='(' || curr=='{' || curr=='[') 
            {
                stk.push(curr);
            }
            else
            {
                if(stk.isEmpty()) return false;
                char top =stk.pop();
                if(curr==')' && top!='('
                || curr=='}' && top!='{'
                || curr==']' && top!='[') return false;
            }
        }
        if(!stk.isEmpty()) return false; 
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna