class Solution {
    public int search(int[] arr, int target) {
        int l = 0, h = arr.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(arr[m]==target)return m;
            else if (arr[l]<=arr[m]){ // low to mid is sorted//
                if(arr[l] <= target && arr[m]>= target) h = m-1;  
                else l = m + 1;
            }else {  // mid to high is sorted//
                if (arr[m] <= target && arr[h]>= target)l = m+1; 
                else h = m-1;
            }

        }
        return -1;
    }
}