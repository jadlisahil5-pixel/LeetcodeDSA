class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first( nums ,  target),last( nums ,  target)};
        }
        public static int first(int[] nums , int target){
        int l = 0;int h=nums.length-1; int idx1 = -1 ;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]>target) h = mid-1;
            else if(nums[mid]<target) l = mid+1;
            else{
                idx1 = mid;
                h = mid-1;
            }
            
        }
        return idx1;
        }
        public static int last(int[] nums , int target){
            int l = 0;int h=nums.length-1; int idx2 = -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]>target) h = mid-1;
            else if(nums[mid]<target) l = mid+1;
            else{
                idx2 = mid;
                l = mid +1;
            }
            
        }
        return idx2;
        }
    

}