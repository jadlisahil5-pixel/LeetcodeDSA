class Solution {
    public int maximumCount(int[] nums) {
        int l = 0,h=nums.length-1, negCount =0 , posCount = 0;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(nums[mid]>=0){
                h = mid-1;
            }else l = mid+1;
            negCount = l;
        }
        l = 0;  h = nums.length -1;
         while(l<=h){
            int mid = l + (h - l)/2;
            if(nums[mid]<=0){
                l = mid+1;
            }else h = mid-1;
            posCount = nums.length - l;
        }
        if (negCount>posCount)return negCount;
        else 
        return posCount;
    }
}