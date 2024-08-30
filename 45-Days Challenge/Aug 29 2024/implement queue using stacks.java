class MyQueue {
    Stack<Integer>input;
    Stack<Integer>output;

public MyQueue() {
   input = new Stack<>();
   output = new Stack<>();
}

public void push(int x) {
    input.add(x);
}

public int pop() {
    if(!output.isEmpty()){
       return output.pop();
    }
    else{
        while(!input.isEmpty()){
            output.add(input.peek());
            input.pop();
        }
       return output.pop();
    }
}

public int peek() {
     if(!output.isEmpty()){
       return output.peek();
    }
    else{
        while(!input.isEmpty()){
            output.add(input.peek());
            input.pop();
        }
       return output.peek();
    }
}

public boolean empty() {
    if(!output.isEmpty()){
        return false;
    }
    else{
        while(!input.isEmpty()){
            output.add(input.peek());
            input.pop();
        }
        if(!output.isEmpty()){
        return false;
        }
        else{
            return true;
        }
    }
}
}

/**
* Your MyQueue object will be instantiated and called as such:
* MyQueue obj = new MyQueue();
* obj.push(x);
* int param_2 = obj.pop();
* int param_3 = obj.peek();
* boolean param_4 = obj.empty();
*/