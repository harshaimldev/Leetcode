class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)!='#'){
                stack.push(s.charAt(i));
            }
            else {
                if (!stack.isEmpty()) {
                stack.pop();
                }
            }
        }
        for (int i=0; i<t.length(); i++){
            if(t.charAt(i)!='#'){
                stack1.push(t.charAt(i));
            }
            else {
                if (!stack1.isEmpty()) {
                stack1.pop();
                }
            }
        }

        if(stack.size() != stack1.size()){
            return false;
        }
        while(!stack.isEmpty()){
            if(stack.pop()!=stack1.pop()){
                return false;
            }
        }
        return true;
        

    }
}