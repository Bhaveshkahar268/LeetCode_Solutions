class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String first = arriveAlice.compareTo(arriveBob) > 0 ? arriveAlice : arriveBob;  // the later arrival: "MM-DD" strings sort like dates
        String last = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;  // the earlier departure
        return Math.max(0, day(last) - day(first) + 1);
    }

    private static final int[] before = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    static { Arrays.parallelPrefix(before, Integer::sum); }  // days in the year before each month

    private static int day(String mmdd) {  // "MM-DD" -> day of the year, 1..365
        return before[Integer.parseInt(mmdd.substring(0, 2)) - 1] + Integer.parseInt(mmdd.substring(3));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna