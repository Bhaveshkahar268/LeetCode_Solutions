class Solution {
    public int DigitSum(int digit)
    {
        int sum=0;
        while(digit>0) {
            int rem=digit%10;
            sum+=rem;
            digit= digit/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums)
    {
        for(int i=0;i<nums.length;++i)
        {
            int digit = DigitSum(nums[i]);
            if(i==digit) return i;

        }
        return -1;
    }
}