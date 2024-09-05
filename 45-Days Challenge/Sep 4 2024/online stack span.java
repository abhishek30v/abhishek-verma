class StockSpanner {
    Stack<int[]>st;
        public StockSpanner() {
            st = new Stack<>();
        }
        
        public int next(int price) {
           int span =1;
           while(!st.isEmpty() && st.peek()[0] <= price){
               span += st.pop()[1];
           }
           st.push(new int[]{price,span});
    return span;       
    }
    }
    
    //approach 1->  (but time limit exceeded)
    
    /*class StockSpanner {
    Stack<Integer>st;
    Stack<Integer>st1;
        public StockSpanner() {
            st = new Stack<>();
            st1 = new Stack<>();
        }
        
        public int next(int price) {
            int count=1;
                while(!st.isEmpty() && st.peek() <= price ){
                    int val = st.pop();
                    count++;
                    st1.push(val);
                }
    
                while(!st1.isEmpty()){
                    st.push(st1.pop());
                }
                st.push(price);
            return count;
        }
    }*/
    
    
    /**
     * Your StockSpanner object will be instantiated and called as such:
     * StockSpanner obj = new StockSpanner();
     * int param_1 = obj.next(price);
     */