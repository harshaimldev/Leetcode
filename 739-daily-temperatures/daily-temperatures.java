class stackIMS implements sMethods{
    int[] arr;
    int top;

    stackIMS(int size){
        this.arr = new int[size];
        this.top = -1;
    }

    @Override
    public int pop(){
        int value = arr[top];
        top--;
        return value;
    }

    @Override
    public void push(int n){
        top++;
        arr[top]= n;
    }

    @Override
    public int peek(){
        return arr[top];
    }

    @Override
    public boolean isEmpty(){
        return (top==-1);
    }

}

interface sMethods{
    int pop();
    void push(int n);
    int peek();
    boolean isEmpty();
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        stackIMS stack = new stackIMS(temperatures.length);

        int n =temperatures.length;
        int[] nge= new int[n];

        for(int i =n-1; i>=0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<= temperatures[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                nge[i] = 0;
            }
            else{
                nge[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        return nge;
    }
}