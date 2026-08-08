class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if (arr[0]!=arr[1])return arr[0];
        if (arr[n-1]!=arr[n-2])return arr[n-1];
        int l = 0 ,  h = n-1;
        while(l<=h){
            int mid = l + (h  - l)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            int f = mid , s = mid;
            if(arr[mid-1] == arr[mid]) f = mid - 1;
            else s = mid + 1;
            int leftCount = f-l;
            int rightCount = h - s;
            if (leftCount % 2 == 0) l = s+1;
            else h = f - 1; 
        }
            return 0;
        
    }
}