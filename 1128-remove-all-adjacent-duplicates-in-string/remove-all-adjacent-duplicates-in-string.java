class charStack implements charMethods {

    char[] arr;
    int top;

    charStack(int size) {
        this.arr = new char[size];
        this.top = -1;
    }

    @Override
    public void push(char x) {
        top++;
        arr[top] = x;
    }

    @Override
    public char pop() {
        char value = arr[top];
        top--;
        return value;
    }

    @Override
    public char peek() {
        return arr[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}

interface charMethods {
    void push(char x);
    char pop();
    char peek();
    boolean isEmpty();
}

class Solution {
    public String removeDuplicates(String s) {
        charStack stack = new charStack(s.length());
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(ch);
            }
            else if(ch==stack.peek()){
                    stack.pop();
                }
            else{
                    stack.push(ch);
                }
        }

        char[] ans = new char[stack.top + 1];
        int i = stack.top;
        while (!stack.isEmpty()) {
            ans[i] = stack.pop();
            i--;
        }
        return new String(ans);
    }

    }
