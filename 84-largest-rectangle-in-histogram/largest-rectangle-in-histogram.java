class stackIMS implements sMethods{
    int[] arr;
    int top;

    stackIMS(int size){
        this.arr = new int[size];
        this.top = -1;
    }
    @Override
    public void push(int x){
        top++;
        arr[top]=x;
    }
    @Override
    public int pop(){
        int value = arr[top];
        top--;
        return value;
    }
    @Override
    public int peek(){
        int value = arr[top];
        return value;
    }
    @Override
    public boolean isEmpty(){
        return top==-1;   
    }
}

interface sMethods{
    void push(int x);
    int pop();
    int peek();
    boolean isEmpty();
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        stackIMS stack = new stackIMS(heights.length);
        int currh = 0;
        int maxarea=0;
            for (int i=0; i<=heights.length; i++){
                if (i==heights.length){
                    currh = 0;
                }
                else{
                    currh = heights[i];
                }
                while(!stack.isEmpty() &&
                    heights[stack.peek()]>currh){
                        int h = heights[stack.pop()];
                        int l=0;
                        if(stack.isEmpty()){
                            l=-1;
                        }
                        else{
                            l=stack.peek();
                        }
                        int w = i -l-1;
                        int currArea = h*w;

                        if (maxarea<currArea){
                            maxarea = currArea;
                        }
                    }
                    if (i<heights.length){ stack.push(i);}
            }
            return maxarea;
        }
    }