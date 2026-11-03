class Solution {
    public int minMoves(int[] nums) {
        int mx = nums[0];
        for (int x : nums) if (x > mx) mx = x;
        int ans = 0;
        for (int x : nums) ans += mx - x;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna