class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int mn[] = new int[nums.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; --i)
        {
            min= Math.min(nums[i],min);
            mn[i]= min;
        }
        for(int i=0;i<nums.length;++i)
        {
            max= Math.max(max,nums[i]);
            int x=max-mn[i];
            if(x<=k) return i;
        }
        return -1;

    }
}