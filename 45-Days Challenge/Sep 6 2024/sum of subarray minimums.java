class Solution {
    public int[] findNSE(int[] arr,int n){    
    int nse[] = new int[n];
    Stack<Integer> st = new Stack<>();

    for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
            st.pop();
        }
        nse[i] = st.isEmpty() ? n : st.peek();
        st.push(i);
    }
    return nse;
  }

    public int[] findPSEE(int[] arr,int n){    
        int psee[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }

        public int sumSubarrayMins(int[] arr) {
            int n = arr.length;
            int nse[] = findNSE(arr,n);
            int psee[] = findPSEE(arr,n);
            long sum =0; 
            int mod = (int) 1e9 +7;

            for(int i=0;i<n;i++){
                long left = i-psee[i];
                long right = nse[i] - i;
                long contribution =  left * right *arr[i] % mod;
                
                sum = (sum + contribution) % mod;
            }
            return (int)sum;
        }
    }
