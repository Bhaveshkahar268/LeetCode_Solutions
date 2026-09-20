class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char j='a';
        for(int i=26; i>0 && j<='z';--i,++j)
        {
            hm.put(j,i);
        }
        int sum=0;
        int i=1;
        for(char x : s.toCharArray())
        {
            sum += hm.get(x)*i;
            i++;
        }
        return sum;
    }
}