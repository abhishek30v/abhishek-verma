class Solution {
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
      
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    int countPairs(int arr[], int low, int mid,int high){
        int cnt =0;
        int right = mid+1;
        for(int i=low;i<=mid;i++){
            while(right <= high && arr[i] > (long)2 * arr[right]){
                right++;
            }
                cnt += (right - (mid+1));
        }
        return cnt;
    }

    int mergesort(int arr[], int l, int r)
    {
        int cnt =0;
        if (l < r) {
            int m = l + (r - l) / 2;
            cnt += mergesort(arr, l, m);
            cnt += mergesort(arr, m + 1, r);

            cnt += countPairs(arr, l , m, r);
            merge(arr, l, m, r);
        }
        return cnt;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
      return mergesort(nums,0,n-1);
    }
}